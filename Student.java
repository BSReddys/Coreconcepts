package corejavaconcepts.collection;

public class Student implements Comparable<Student> {
	
 int roll;
 String sname;
 int smarks;
 
 public Student(){
	 
 }
public Student(int roll, String sname, int smarks) {
	super();
	this.roll = roll;
	this.sname = sname;
	this.smarks = smarks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSmarks() {
	return smarks;
}
public void setSmarks(int smarks) {
	this.smarks = smarks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", sname=" + sname + ", smarks=" + smarks + "]";
}
// order is based on smarks
/*public int compareTo(Student s) {  
    if(smarks>s.smarks){  
        return 1;  
    }else if(smarks<s.smarks){  
        return -1;  
    }else{  
    return 0;  
    }  */
//order is based on sname
    public int compareTo(Student s) {  
        if(roll>s.roll){  
            return 1;  
        }else if(roll<s.roll){  
            return -1;  
        }else{  
        return 0;  
        } 
}
	
}
