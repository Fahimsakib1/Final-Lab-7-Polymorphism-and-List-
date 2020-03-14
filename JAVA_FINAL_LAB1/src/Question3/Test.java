package Question3;

public class Test {

	public static void main(String[] args)
	
	{
		 
		 
		 Monster M = new Monster ();
		 M.name = " DEADPOOL";
		 System.out.println(" Monster Name Is : " +M.name);
		 
		 M.Attack();
		 
		 
		 FireMonster F = new FireMonster ();
		 F.Attack();
		 
		 WaterMonster W = new WaterMonster ();
		 W.Attack();
		 
		 StoneMonster S = new StoneMonster ();
		 S.Attack();
		 
		 

	}

}
