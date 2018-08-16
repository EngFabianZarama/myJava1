package lab18;

import java.util.Scanner;
import java.io.*;

public class replace {
	public static void main(String[] args) {
		
		File filename = new File(args[0]);

		// create input and output files
		String s = "";
		try {
			Scanner input = new Scanner(filename);
			while (input.hasNextLine()) {
				s += input.nextLine() + "\n";
				
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problem with input file");
		}
		
		System.out.println("Old lines:");
		System.out.println(s);
		s = s.replaceAll("Java","HTML");
		System.out.println("New lines:");
		System.out.println(s);
		
		try {
			PrintWriter output = new PrintWriter(filename);
			output.write(s);
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("problem with output file");
		}

	}
}
