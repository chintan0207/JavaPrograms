package sep13autoboxing;

public class Autoboxingunboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 12;
		
		Integer obj1 = Integer.valueOf(a);
		
		Integer obj2 = a;
		
		System.out.println(a+" "+ obj1+" " +obj2);
		
		Integer integer = 10;
		int a1 = integer.intValue();
		int a2 = integer;
		
		System.out.println(integer+" "+ a1+" " +a2);

	}

}
