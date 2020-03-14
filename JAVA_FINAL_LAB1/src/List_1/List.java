package List_1;

import java.util.ArrayList;

public class List 
{

	public static void main(String[] args) 
	{
            ArrayList<String> wordList = new ArrayList<>();
	        
	        wordList.add( " First Name : Fahim ");
	        wordList.add( " Second Name : Rony ");
	        wordList.add( " Third Name : Kutta ");
	        
	        System.out.println(wordList.get(0)); // individual print er jonno command
	        System.out.println(wordList.get(1)); // individual print er jonno command
	        System.out.println(wordList.get(2)); // individual print er jonno command
	        
	        System.out.println(" ---------------------------  ");
	        
	        
	        
	        System.out.println(" Size Of The List Is : " + wordList.size());
	        System.out.println(" ---------------------------  ");
	        
	        
	        for ( int i =0 ; i< wordList.size(); i++)
	        	
	        	
	        {
	        	
	        	System.out.println(wordList.get(i)); // for loop use kore sob gulo print
	        }
	        
	        
	        System.out.println(" ---------------------------  ");
	        
	        for (String word : wordList)
	        {
	        	
	        	System.out.println(word); // for each loop use kore sob gulo print
	        }
	        
	        
	        
	        

	}

}
