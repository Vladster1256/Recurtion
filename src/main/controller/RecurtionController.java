package main.controller;

public class RecurtionController
{
	public void start()
	{
		for(int spot = 0; spot < 100; spot++)
		{
			long startTime = System.currentTimeMillis();
			System.out.println("The " + (spot+1) + "'th position of the Fibonacci sequence is: "+ getFibonacci(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000 + " seconds to calculate it.");
		}
		
//		for(int spot = 0; spot < 200; spot++)
//		{
//			long startTime = System.currentTimeMillis();
//			System.out.println("The " + (spot+1) + "'th position of the Factorial sequence is: "+ getFactorial(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000 + " seconds to calculate it.");
//		}
	}
	private double getFibonacci(double position)
	{
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else
		{
			return getFibonacci(position - 2) + getFibonacci(position - 1);
		}
	}
	
	private double getFactorial(double value)
	{
		if(value == 0 || value == 1)
		{
			return 1;
		}
		else
		{
			return value * getFactorial(value -1);
		}
	}
}
