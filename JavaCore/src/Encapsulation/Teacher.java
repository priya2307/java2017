package Encapsulation;

public class Teacher {

	public static void main(String[] args) {

        Student s=new Student(); 
		s.setSid(101);
		System.out.println("ID="+s.getSid());
		s.setSname("Priya");
		System.out.println("Name="+s.getSname());
		
	}

}
