package loops.controller;

public class LoopsController
{
	public void start()
	{
		boolean boolvar = false;
		
		while (boolvar == false)
		{
			System.out.println("Loop working.");
			
			boolvar = true;
		}
	
		boolean endless = true;
		
		while (endless == true)
		{
			System.out.println("Welcome to endless suffering.");
			
			boolvar = false;
		}
	
	}
}
