package corejavaconcepts.textexamples;

import java.util.*;

import corejavaconcepts.collection.Student;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.getSname().compareTo(s2.getSname());
	}

}
