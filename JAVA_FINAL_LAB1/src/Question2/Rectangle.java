package Question2;

public class Rectangle extends Shape
{
     
	public double length;
	public double width;
	
	
	public Rectangle(String color, double length, double width) 
	
	{
		super(color);
		this.length = length;
		this.width = width;
		
		
	}
	
	public double Area ()
	{
		System.out.print(" Area Of Rectangle Is  : ");

		return length*width;
		
		
		
	}
	
	
	
}
