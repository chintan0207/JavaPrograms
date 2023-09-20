package sep1ed;

public class Demo1 {

	public static void main(String[] args) {
		
       String language[]= {"Java","Python","Asp.Net","PHP"};
		
		//for loop
		//length=specify the size of array
		
		for(int i=0;i<language.length;i++) {
			
		System.out.println(language[i]);
		
		}
		System.out.println("Using foreach loop");
		
		//for each loop
		//for(datatype variable:object)
		
		for(String j:language)
		{
			System.out.println(j);
		}
		
		

	}

}
