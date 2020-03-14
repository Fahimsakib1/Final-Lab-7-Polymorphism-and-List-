package Question2;

public class Test {

	public static void main(String[] args) 
	{
	
        Shape S = new Shape(" Black ");
        System.out.println(S.Area()); // no override
      
        
        Rectangle R = new Rectangle (" Green ", 4.58, 9.85);
        System.out.println(R.Area()); // no override
        
        
        Triangle T = new Triangle (" White ", 7.85, 9.58);
        System.out.println(T.Area()); // no override
        
        
        
        Shape S2 = new Rectangle ("Yellow " , 4.25, 8.15);
        System.out.println(S2.Area()); //  override
        
        
        Shape S3 = new Triangle ("Red " , 7.25, 1.15);
        System.out.println(T.Area()); //  override
       
        
        
        
        
        
        
        
		
	}

}
