package List_2;

public class Student 
{
     
	private int id;
	private String name;
	
	
	
	public Student() 
	{
		super();
	}



	public Student(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() 
	
	
	{    
		System.out.println(" Information Of Student : ");
		return "StudentList [id=" + id + ", name=" + name + "]";
		
		
	}
	
	
	
	
	
	
}
