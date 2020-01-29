package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("in.txt");
		FileReader fr = null;
		BufferedReader fb = null;
		try {
			fr = new FileReader(file);
			fb = new BufferedReader(fr);
			
			String line = fb.readLine();
			while(line != null) {
				System.out.println(line);
				line = fb.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			
			try {
				if(fr != null) {
					fr.close();
				}
				
				if(fb != null) {
					fb.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
