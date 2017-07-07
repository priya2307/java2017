class WhileEx3
{
	public static void main(String ar[])
	{
		int  min=1;
		int max=10;
		int sum=0;


		while(min<=max)
		{
			sum= sum+2;
			min = min +1;
		}
		
		System.out.println(" Summation = " + sum);
	}
}
