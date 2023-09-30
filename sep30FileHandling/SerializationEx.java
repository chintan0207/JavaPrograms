package sep30FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Student student = new Student(201,"Rahul");
		
		FileOutputStream oStream = new FileOutputStream("D:\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(oStream);
		objectOutputStream.writeObject(student);  //obj-byte
		oStream.flush();
		System.out.println("converted into stream");
	}

}
