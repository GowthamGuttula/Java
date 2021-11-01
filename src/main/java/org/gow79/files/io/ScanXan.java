package org.gow79.files.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {
	public static void main(String[] args) throws IOException {

		Scanner s = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader("xandu.txt")));

			while (s.hasNext()) {
				System.out.format(s.next());
			}
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}
