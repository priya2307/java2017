package stringBuffer;

public class StringBufferEx2 {

	public static void main(String[] args) 
	{
		 StringBuffer name =new StringBuffer("Priya");
			System.out.println("Name  = "+name);
			System.out.println("Length = "+name.length());
			System.out.println("Capacity = "+name.capacity());
			name.append("Alli");
			System.out.println("after append = "+name);
			System.out.println("Length = "+name.length());
            System.out.println("Capacity = "+name.capacity());

	}

}
