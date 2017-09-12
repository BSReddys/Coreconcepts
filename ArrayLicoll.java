package corejavaconcepts.textexamples;

import java.util.*;

import corejavaconcepts.collection.Student;

public class ArrayLicoll {
	public static void main(String args[]){  
		 /*// ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
		 // HashSet<String> list = new HashSet<>();//Creating HashSet
		 // Set<String> list = new LinkedHashSet<>();
		 Set<String> list = new TreeSet<>();
		  list.add("Ravi");//Adding object in collections  
		  list.add("Vijay"); 
		  list.add(" ");
		  list.add("Ravi"); 
		  list.add(" ");
		  list.add("Ajay");  
		 
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  //Using foreach loop
		// for(String st:list)
		//	  System.out.println(st);
*/		Student s1= new Student(1,"zohn",35);
        Student s9= new Student(9,"",355);
		Student s2= new Student(2,"aest",53);
		Student s3= new Student(3,"kicker",13);
		Student s4= new Student(4,"john",35);
		//Student s8= new Student(1,"john",35);
		List<Student> s = new ArrayList<Student>();
		//LinkedList<Student> s = new LinkedList<Student>();
		//HashSet<Student> s = new HashSet<>();
		 //Set<Student> s = new LinkedHashSet<>();
		// Set<Student> s = new TreeSet<>();
		  s.add(s1);
		  s.add(s2);
		  s.add(s3);
		 s.add(s4);
		  s.add(s9);
		//ArrayList<Student> ss = new ArrayList<Student>();
		 // LinkedList<Student> ss = new LinkedList<Student>();
		//  HashSet<Student> ss = new HashSet<>();
		Student s5= new Student(5,"nivk",63);
		Student s6= new Student(6,"jack",3668);
		Student s7= new Student(7,"guyp",3856);
	//	ss.add(s5);ss.add(s6);ss.add(s7);
		//s.addAll(ss);
		//s.removeAll(ss);
		
		System.out.println("sort by name......");
		Collections.sort((List<Student>) s, new NameComparator());
		  for(Student obj:s){
			 // System.out.println(obj.getRoll()+"  "+obj.getSname()+"  "+obj.getSmarks());
			  System.out.println(obj);
			 // System.out.println(obj.getRoll());
			 // System.out.println("next");
		  }
		 } 
	
}
