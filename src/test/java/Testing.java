import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {

	@Test
	public void givenThreeNumbers_ComparedWithIntegerObjects_ReturnMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		int number = maxnumber.findMaximumNumber(-10, 0, -14);
		Assert.assertEquals(0,number);
	}
	
	
}
