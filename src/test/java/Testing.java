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
	
}
