package sep28Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<String>();
	     set.add("Lotus");
	     set.add("rose");
	     set.add("Jasmin");
	     set.add("Lotus");
	     set.add(null);
	     System.out.println("Implementing hashset.....");
	     for(String s: set) {
	    	 System.out.println(s);
	     }
		
	     LinkedHashSet<String> liset=new LinkedHashSet<String>();
	      liset.add("Mango");
	      liset.add("gova");
	      liset.add("Banana");
	      liset.add("Watermelon");
	      liset.add("gova");
	      liset.add(null);
	      
	      System.out.println("\nImplementing LinkedHashSet.......");
	      for(String s1:liset)
	      {
	    	  System.out.println(s1);
	      }
	      
	      
	      TreeSet<String> tset=new TreeSet<>();
	      tset.add("Srinu");
	      tset.add("Ram");
	      tset.add("chimtu");
	      tset.add("pappu");
	      tset.add("sagar");
	      tset.add("Srinu");
	     // tset.add(null); NullPointerException
	      System.out.println("\nImplementing TreeSet:...");
	      for(String s2:tset)
	      {
	    	  System.out.println(s2);
	      }
	      
	      
	      
	      
	}

}
