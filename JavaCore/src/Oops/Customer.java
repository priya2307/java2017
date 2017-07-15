package Oops;

class Cell{

			    String company;  
			    String model;  
			    int cost; 
			    void Details()
		          {
		        	company="iphone";
		        	model="6s";
		        	cost=700;
		          }
			
		        void PrintDetails()
		           {
		        	System.out.println("Company Name =" +company);
		        	System.out.println("Phone Model =" +model);
		        	System.out.println("Phone Cost =" +cost);
		            }
}
			public class Customer
			{
				public static void main(String ar[])
				{
					Cell c1= new Cell();
					Cell c2= new Cell();
					c1.Details();
					c2.Details();
					
					c1.PrintDetails();
					c2.PrintDetails();
			
				}
			}


			    