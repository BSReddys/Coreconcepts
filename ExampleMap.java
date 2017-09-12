package corejavaconcepts.Mapexample;

import java.util.*;

import corejavaconcepts.collection.Student;

public class ExampleMap {

	public static void main(String[] args) {
		/*Hashtable<Integer,String> ms= new Hashtable<Integer,String>();
		//Map<Integer,String> ms= new HashMap();
		//Map<Integer,String> ms= new LinkedHashMap<Integer,String>();
		//Map<Integer,String> ms= new TreeMap<Integer,String>();
		ms.put(1, "");
		ms.put(1, "null");
		ms.put(2, "jack");
		ms.put(3, "rack");
		//ms.put(null , "ewfew");
		//System.out.println(ms);
		//Set s = ms.entrySet();
		 for(Map.Entry<Integer,String> m:ms.entrySet()){
			 System.out.println(m.getKey()+"  "+m.getValue());
			 
		 }*/
		// Map<Integer,Student> ms= new HashMap<Integer,Student>(); 
		// Map<Integer,Student> ms= new LinkedHashMap<Integer,Student>();
		 //Map<Integer,Student> ms= new TreeMap<Integer,Student>();
		 Hashtable<Integer,Student> ms= new Hashtable<Integer,Student>();
		 Student s1= new Student(1,"john",35);
	        Student s9= new Student(9,"",355);
			Student s2= new Student(2,"rest",53);
			Student s3= new Student(3,"kicker",13);
			Student s4= new Student(4,"john",35);
		 ms.put(1, s1);
		 ms.put(9, s9);
		 ms.put(2, s2);
		 ms.put(3, s3);
		 ms.put(4, s4);
		 for(Map.Entry<Integer,Student> m:ms.entrySet()){
			 System.out.println(m.getKey()+"  "+m.getValue());
			 
		 }
		 /*ms.remove(2);
		 ms.remove(9, s9);
		 for(Map.Entry<Integer,Student> m:ms.entrySet()){
			 System.out.println(m.getKey()+"  "+m.getValue());
			 
		 }*/
	}

}
