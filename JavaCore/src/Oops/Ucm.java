package Oops;

 class Student {

        int sid;
        String sname;
        String scourse;
		
        void Details()
          {
        	sid=102;
        	sname="priya";
        	scourse="industrial management";
          }
	
        void PrintDetails()
           {
        	System.out.println("Sid =" +sid);
        	System.out.println("Student Name =" +sname);
        	System.out.println("Student Course =" +scourse);
            }
		}
	public class Ucm
	{
		public static void main(String ar[])
		{
			Student s1= new Student();
			Student s2= new Student();
			s1.Details();
			s2.Details();
			
			s1.PrintDetails();
			s2.PrintDetails();
	
		}
	}
