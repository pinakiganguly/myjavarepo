package Basic_codes;

import java.util.TreeSet;
public class student implements Comparable {
	float marks;
	public student(float marks) {
		this.marks=marks;
	}
	public int compareTo(Object o) {
		student s=(student) o;
		if(s.marks==marks) {
			return 0;
		}
		else {
			if(s.marks<marks) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
	public String toString() {
		return "Marks:"+marks;
	}
	public static void main(String args[]) {
		student stud1=new student(95.3f);
		student stud2=new student(56.23f);
		student stud3=new student(78.4f);
		
		TreeSet ts=new TreeSet();
		ts.add(stud1);
		ts.add(stud2);
		ts.add(stud3);
		System.out.println(ts);
	}
}
