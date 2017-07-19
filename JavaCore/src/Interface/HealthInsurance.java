package Interface;

abstract class Insurance {
	
	String name;
	int id;
	public abstract void getDetails(); 	
}
class CarInsurance extends Insurance {

	public void getDetails()
	{
	 name="CIGNA";
	 id=101;
	 System.out.println("Name= "+name);
	 System.out.println("ID="+id);
	}
}
public class HealthInsurance {

	public static void main(String[] args) {
		CarInsurance ci=new CarInsurance();
		ci.getDetails();
		}

}
