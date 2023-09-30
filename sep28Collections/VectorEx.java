package sep28Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector=new Vector<>();
		vector.addElement("Lilli");
		vector.add("Morga");
		vector.addElement("Rose");
		vector.add("Jasmin");
		Enumeration<String> en=vector.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
