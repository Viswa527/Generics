package Generics;

public class MaximumNumber {
	public Comparable MaximumNumber(String fruitOne, String fruitTwo, String fruitThree) {
		return testMaximum(fruitOne,fruitTwo,fruitThree);
	}
	public static <T extends Comparable> T testMaximum(String fruitOne,String fruitTwo,String fruitThree) {
		Integer firstFruit = new Integer(fruitOne.length());
		Integer secondFruit = new Integer(fruitTwo.length());
		Integer thirdFruit= new Integer(fruitThree.length());
		if(firstFruit.compareTo(secondFruit)>0)
		{
			if(firstFruit.compareTo(thirdFruit)>0)
			{
				return (T) fruitOne;
			}
			else
			{
				return (T) fruitThree;
			}
		}
		else
		{
			if(secondFruit.compareTo(thirdFruit)>0)
			{
				return (T) fruitTwo;
			}
			else
			{
				return (T) fruitThree;
			}
		}
	}
}
