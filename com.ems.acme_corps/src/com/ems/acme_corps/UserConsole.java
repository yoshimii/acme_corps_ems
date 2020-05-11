package com.ems.acme_corps;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserConsole {

	public static void main(String[] args) {
		String file = "departments.txt";
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\n");
		
		try (PrintWriter fw = new PrintWriter(new File(file))) {
			String line = null;
			while ((line = scan.nextLine()) != null) {
				if (line.trim().equalsIgnoreCase("done")) {
					System.out.println("Exiting...");
					System.exit(0);
				}
			}
			fw.println(line);
		} catch(IOException ex) {
			System.err.println("An IOException was caught!");
            ex.printStackTrace();
		} finally {
			if(scan!=null) {
				scan.close();
			}
		}

	}

}
