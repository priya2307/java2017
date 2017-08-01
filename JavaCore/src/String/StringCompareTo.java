package String;

public class StringCompareTo {

	public static void main(String[] args) {
		String p1= "PRIYA";
		String p2= new String("Alli");
		String p3=new String("RAHUL");
		
		int result = p1.compareTo(p2);
		int result2=p1.compareTo(p3);
		System.out.println("result  =" +result);
		System.out.println("result2  =" +result2);

	}

}
