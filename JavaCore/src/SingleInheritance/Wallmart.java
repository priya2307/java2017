package SingleInheritance;

class Customer
{
	String name;
	String address;
	
	void setDetails(String a, String b)
	{
	this.name=a;
	this.address=b;
	}
	void getDetails()
	{
		System.out.println("Customer ID : "+name);
		System.out.println("Customer Address: "+address);
	}
}
class Employee extends Customer
{
        String empname;
        
	void setWork(String z)
	{
		this.empname=z;
	}
	void getWork()
	{
		System.out.println("Employer Name= "+empname);
	}
}
public class Wallmart {


	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setDetails("Priya","Michigan");
		e1.setWork("Christi");
		e1.getDetails();
		e1.getWork();
	}

}







