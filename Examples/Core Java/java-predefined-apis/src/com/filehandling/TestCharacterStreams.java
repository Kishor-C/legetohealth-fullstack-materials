package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharacterStreams {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("hello.txt");
			FileWriter writer = new FileWriter("demo.txt");
			BufferedReader readerBuffer = new BufferedReader(reader);
			BufferedWriter writerBuffer = new BufferedWriter(writer);
			String line = null;
			int counter = 0;
			do {
				counter++;
				line = readerBuffer.readLine();
				if(line != null) {
					writerBuffer.write(line);
					writerBuffer.newLine();
				}
			} while(line != null);
			writerBuffer.flush();
			writer.flush();
			readerBuffer.close();
			writerBuffer.close();
			reader.close();
			writer.close();
			System.out.println("Counter: "+counter);
			System.out.println("File read & write completed!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
