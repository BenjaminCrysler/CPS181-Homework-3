package primaryPackage;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// @Benjamin Crysler
		// @Version 1.0
		// October 20,2015
		// Stack and Queue Assignment
		// "Homework3.txt" required
		// requires "StartQ.java", "Middle.java", "EndQ.java", "IQueue.java",
		// and "IStack.java".

		// open file and create scanner
		FileInputStream fileByteStream = new FileInputStream("Homework3.txt");
		Scanner filescan = new Scanner(fileByteStream);

		while (filescan.hasNextLine()) {
			// read in string and print
			String fileString = filescan.nextLine();
			System.out.println("String read from file: " + fileString);

			System.out.println("");

			// separate out each character of string
			char[] charArray = new char[fileString.length()];
			for (int i = 0; i < fileString.length(); ++i) {
				charArray[i] = fileString.charAt(i);
				System.out.println("Character @" + i + ": " + charArray[i]);
			}

			System.out.println("");

			// create StartQ, Middle, and EndQ objects
			StartQ q1 = new StartQ();
			Middle s1 = new Middle();
			EndQ q2 = new EndQ();

			// add each letter to startQ
			for (int i = 0; i < fileString.length(); i++) {
				q1.add(charArray[i]);
			}

			System.out.println();

			// move each letter of StartQ into Middle
			while (q1.ismt() == false) {
				s1.push(q1.remove());
			}

			System.out.println();

			// move each letter of Middle into EndQ
			while (s1.ismt() == false) {
				q2.add(s1.pop());
			}

			System.out.println("");

			// create and populate stringbuilder, print results
			StringBuilder sb = new StringBuilder(20);
			while (q2.ismt() == false) {
				sb.append(q2.remove());
			}
			System.out.println();
			System.out.println("end result: " + sb.toString());
			System.out.println("original string: " + fileString);
			System.out.println("-----------------------------------------------------------------------------------------------");
		}

		filescan.close();

	}

}
