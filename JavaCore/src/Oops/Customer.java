package Oops;

class Mobile{

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
					Mobile m1= new Mobile();
					Mobile m2= new Mobile();
					m1.Details();
					m2.Details();
					
					m1.PrintDetails();
					m2.PrintDetails();
			
				}
			}


			    