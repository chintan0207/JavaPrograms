package sep30FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter writer = new FileWriter("D:\\xyz.txt",true);
		
		writer.write("Welcome to Edubridge");
		writer.close();
		System.out.println("File is created");

	}

}
