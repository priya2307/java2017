package SingleInheritance;

class Shape 
{
    int length;
    int breadth;
	void setDetails(int a, int b)
	{
	this.length=a;
	this.breadth=b;
	}
	void getDetails()
	{
		System.out.println("Length of Rectangle : "+length);
		System.out.println("Breadth of Rectangle: "+breadth);
	}


class Rectangle extends Shape
{
    int area;
    
    void setArea()
    {
        area = length*breadth;
    }
    void getArea()
    {
		System.out.println("Area of Rectangle  = "+area);

    }
}
public class Measurement{
    
	public void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
        r1.setDetails(10,20);
        r1.setArea(); 
        r1.getDetails();
        r1.getArea();
    }
}
}
