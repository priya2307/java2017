class PracticeEx3
{
	public static void main(String ar[])
	{
		int  min=3;
		int max=9;
		int sum=2;


		while(min<=max)
		{
			sum= sum+min;
			min = min +2;
		}
		
		System.out.println(" Summation = " + min);
	}
}

