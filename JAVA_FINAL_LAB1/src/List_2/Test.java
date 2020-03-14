package List_2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	
	{
		 ArrayList<Student> ob = new ArrayList<>();
		 
		 Student S1 = new Student (100 , " fahim ");
		 Student S2 = new Student (200 , " faysal ");
		 Student S3 = new Student (300 , "  sakib ");
		 
		 ob.add(S1);
		 ob.add(S2);
		 ob.add(S3);
		 
		 for ( Student i : ob)
		 {
			 
			 System.out.println(i); // for each loop
		 }
		 

	}

}
