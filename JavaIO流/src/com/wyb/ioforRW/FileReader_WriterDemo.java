package com.wyb.ioforRW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_WriterDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:/JavaIo/filereader.txt");
		FileWriter fw = new FileWriter("E:/JavaIo/filewriter.txt");
		// FileWriter fw = new FileWriter("E:/JavaIo/filewriter.txt",true);

		char[] buffer = new char[2056];
		int c;
		while ((c = fr.read(buffer, 0, buffer.length)) != -1) {
			fw.write(buffer, 0, c);
			fw.flush();
		}
		fr.close();
		fw.close();
	}
}
