package org.gow79.files.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CopyBytes {
	public static void main(String[] args) throws IOException {

		InputStream in = null;
		FileOutputStream out = null;

		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			in = classloader.getResourceAsStream("xandu.txt");
			out = new FileOutputStream("outagain.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Completed");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
