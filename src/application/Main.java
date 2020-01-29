package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String file = "in.txt";

		try (BufferedReader fb = new BufferedReader(new FileReader(file))){
			
			String line = fb.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = fb.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
