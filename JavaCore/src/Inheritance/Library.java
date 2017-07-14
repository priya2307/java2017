package Inheritance;

class Student
{
	int id;
	String name;
	String address;
	
	void setDetails(int a, String b, String c)
	{
	this.id= a;
	this.name=b;
	this.address=c;
	}
	void getDetails()
	{
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Address: "+address);
	}
}
class Book extends Student
{
	int bookno;
	
	void setbook(int num)
	{
		this.bookno=num;
	}
	void getbook()
	{
		System.out.println(name+"Book Number  = "+bookno);
	}
}
public class Library {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setDetails(10212102,"Priya","Michigan");
		b1.setbook(98);
		b1.getDetails();
		b1.getbook();
	}

}
