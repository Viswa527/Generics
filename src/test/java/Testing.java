import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeNumbers_ComparedWithIntegerObjects_ReturnsMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		int number = maxnumber.findMaximumNumber(10, 12, 14);
		Assert.assertEquals(14,number);
	}
	@Test
	public void givenThreeNumbers_ComparedWithIntegerObject_ReturnsMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		int number = maxnumber.findMaximumNumber(221, 124, 114);
		Assert.assertEquals(221,number);
	}
	@Test
	public void givenThreeNumbers_ComparedWithIntegerObjects_ReturnMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		int number = maxnumber.findMaximumNumber(-10, 0, -14);
		Assert.assertEquals(0,number);
	}
	
}
