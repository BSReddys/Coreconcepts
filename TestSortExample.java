package corejavaconcepts.textsorting;

import java.util.*;

public class TestSortExample {

	public static void main(String[] args) {
		List<String> sl = new ArrayList<>();
		sl.add("Viru");  
		sl.add("Saurav");  
		sl.add("Mukesh");  
		sl.add("Tahir"); 
		
		for(String s:sl)
		System.out.println(s);
	System.out.println("///////////////////////////");	
		Collections.sort(sl);//sort(ArrayList ls);
		for(String s:sl){
			System.out.println(s);
			System.out.println("*******");
		}
	}

}
