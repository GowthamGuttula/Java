package org.gow79.files.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {

	public static void main(String a[]) throws IOException {

		try (var fileReader = new FileReader("xandu.txt"); var fileWriter = new FileWriter("output.txt")) {
			int c;

			while ((c = fileReader.read()) != -1) {
				fileWriter.write(c);
			}
			System.out.println("Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
