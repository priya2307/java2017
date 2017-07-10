package loop;
// Break the loop if i value is 2
public class ForEx3 {

	public static void main(String[] args) {
        for(int i=10; i>1; i--)
        {
            if (i==2)
             {
	           break;
              }
            System.out.println("The value of i is: "+i);
        }
	}

}
