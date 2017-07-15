package HierarchicalInheritance;

class A 
{
int a,b;
int add;
  public void methodA(int x, int y)
  {
	  this.a=x;
	  this.b=y;
	  add=a+b;
     System.out.println("Addition="+add);
  }
}
class B extends A
{
	int sub;
  public void methodB(int x,int y)
  {
        sub=a-b;
	  System.out.println("Substraction="+sub);
  }
}
class C extends A
{
	int mul;
 public void methodC(int x,int y)
 {
         mul=a*b;
	 System.out.println("Multiplication="+mul);
 }
}
class D extends A
{
	int div;
  public void methodD(int x,int y)
  {
	  div=a/b;
     System.out.println("Division="+div);
  }
public void methodC() {
	// TODO Auto-generated method stub
	
}
}
public class MyClass
{
  public static void main(String args[])
  {
    D d1= new D();
      d1.methodA(50,60);
      
  }
}

