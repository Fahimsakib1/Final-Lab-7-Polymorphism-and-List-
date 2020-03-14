package Question1;

public class Test 
{

	public static void main(String[] args)
	
	{
		  CourseBook cb = new CourseBook();
		  cb.PrintName();
		  cb.issueBook(10);
		  
		  System.out.println(" ---------------------------  ");
		  
		  Book b = new Book();
		  b.PrintName();
		  b.issueBook(4);
		  
		  System.out.println(" ---------------------------  ");
		  
		  Book b1 = new CourseBook();
		  b1.PrintName();
		  cb.returnBook(5,2); // b1. returnBook(5,2) dile hobe na cause  returnBook(int a, int b )  aita overriding method
		  
       
	}

}
