package Question1;

public class CourseBook extends Book 


{ 
	//overriding
	public void PrintName()
    {
   	 
   	 System.out.println(" This is Course book ");
    }
	
	//overriding
	public void issueBook(int n)
    {
   	 
   	 System.out.println(" Issue book id :  " + n);
   	 
    }
	
	
	//overloading
	public void issueBook()
    {
   	 
   	 System.out.println(" Issue book id without id ");
   	 
    }
	
	
	//overloading
	public void returnBook(int a , int b)
    {
   	 
   	 System.out.println(" Return book1 id :  " + a);
   	 System.out.println(" Return book2 id :  " + b);
    }
	
	
}
