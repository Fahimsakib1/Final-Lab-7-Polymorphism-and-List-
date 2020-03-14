package Question2;

public class Triangle extends Shape 

{
      public double base;
      public double height;
      
      
	    public Triangle(String color, double base, double height) 
	    
	    {
	    	
		super(color);
		this.base = base;
		this.height = height;
		
	    }
	    
	    public double Area ()
		{
			System.out.print(" Area Of Triangle Is  : ");
			
			return 0.5*base*height;
			
			
		}
		
      
      
}
