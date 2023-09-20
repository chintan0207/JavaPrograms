package sep15String;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "welcome",s2="Hello",s3="welcome",s4="        Welcome to Edubridge";

		//String Methods
		//1.charAt(int index)
		
		System.out.println("charAt(3) :" + s1.charAt(3));
		
		System.out.println("Length of s2 :" + s2.length());
		
		System.out.println("Substring(3) :" + s1.substring(3));
		System.out.println("Substring(0,3) :" + s1.substring(0,3));
		
		System.out.println("contains(e) :" + s3.contains("e"));
		System.out.println("contains(d) :" + s3.contains("d"));
		
		System.out.println("s1.equals(s3) :" + s1.equals(s3));
		
		System.out.println("s1.equalsIgnoreCase(s3) :" + s1.equalsIgnoreCase(s3));
		
		System.out.println("isEmpty() " + s2.isEmpty());
		
		System.out.println("s1.indexOf('e') :" + s1.indexOf('e'));
		System.out.println("s1.indexOf('e') :" + s1.indexOf('e',2));
		
		System.out.println("s1.lastIndexOf('e') :" + s1.lastIndexOf('e'));
		
		System.out.println("concat() " + s2.concat("User"));
		System.out.println(s2);
		
		s2 = s2.concat("User");
		
		System.out.println(s2);
		
		System.out.println("replace('e','a') :" + s1.replace('e','a'));
		
		System.out.println("toUpperCase() :" + s2.toUpperCase());
		
		System.out.println("toLowerCase() :" + s2.toLowerCase());
		
		System.out.println("before trim() :" + s4.length());
		s4 = s4.trim();
		System.out.println("after trim() :" + s4.length());
		
		System.out.println(s4);
		System.out.println("splited Strings: ");
		String splitedString[] = s4.split("");
		
		for (String string: splitedString) {
			System.out.println(string);
		}
		
		System.out.println("count of words : " + splitedString.length);
		
		
	}

}
