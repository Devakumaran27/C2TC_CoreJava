package Day3.BufferReaderDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	public static void main(String [] args) throws IOException {
		
		FileReader fr = new FileReader("data.txt");

		BufferedReader br = new BufferedReader(fr);
		
		String content;
		while ((content = br.readLine()) != null) {
		System.out.println(content);
	}
	}
}