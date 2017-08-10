package vector;

import java.util.Vector;

		class Student
		 {
		 	int id;
		 	String name;
		 	String course;
		 	void setDetails(int x, String y, String z)
		 	{
		 	this.id=x;
		 	this.name=y;
		 	this.course=z;
		 	}
		 	
		 	void getDetails()
		 	{
		 		System.out.println(" Student Id = "+id);
		 		System.out.println(" Student Name = "+name);
		 		System.out.println(" Student course = "+course);
		 	}
		 }
		 public class VectorEx3 {
		      public static void main(String[] args) {
		 
		 		Student s1= new Student();
		 		Student s2= new Student();
		 		Student s3= new Student();
		 		s1.setDetails(1,"priya","Maths");
		 		s2.setDetails(2,"alli","Science");
		 		s3.setDetails(3,"rahul","Chemistry");
		 		
		 		Vector<Student> v = new Vector<Student>();
		 		v.add(s1);
		 		v.add(s2);
		 		v.add(s3);
		 		
		 		for(Student s : v)
		 		{
		 			System.out.println("Student Details=" +s.id +s.name+s.course);
		 		}
		 	 }
	}

