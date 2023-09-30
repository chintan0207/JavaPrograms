package sep30FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileOutputStream outputStream = new FileOutputStream("D:\\abc.txt",true);
		String str = "Thank you";
		byte bArr[] = str.getBytes();  // converting String into byte[]
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("file is created");
		
	}

}

