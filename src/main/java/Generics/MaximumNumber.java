package Generics;

public class MaximumNumber {
	public static int findMaximumNumber(int numberOne,int numberTwo,int numberThree)
	{
		Integer firstNumber = new Integer(numberOne);
		Integer secondNumber = new Integer(numberTwo);
		Integer thirdNumber = new Integer(numberThree);
		if(firstNumber.compareTo(secondNumber)>0)
		{
			if(firstNumber.compareTo(thirdNumber)>0)
			{
				return firstNumber;
			}
			else
			{
				return thirdNumber;
			}
		}
		else
		{
			if(secondNumber.compareTo(thirdNumber)>0)
			{
				return secondNumber;
			}
			else
			{
				return thirdNumber;
			}
		}
	}
}
