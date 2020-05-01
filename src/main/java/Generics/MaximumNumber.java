package Generics;

public class MaximumNumber {
	public static Float findMaximumNumber(Float numberOne,Float numberTwo,Float numberThree)
	{
		Float firstNumber = new Float(numberOne);
		Float secondNumber = new Float(numberTwo);
		Float thirdNumber = new Float(numberThree);
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
