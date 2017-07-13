package Oops;
//Program to print parameterized constructor
class Iphone {

				Iphone() 
				{
					System.out.println("Inside Constructor");
				}
				Iphone(int x) 
				{
					System.out.println(" x value = "+x);
				}
				Iphone(int x, int y) 
				{
					System.out.println(" y value= "+y);
				}
				void location() 
				{
					System.out.println("California");
				}
			}
			public class Mobile {

				public static void main(String[] args) {
			Iphone i1 = new Iphone(6); 
			i1.location();

				}

			}
