import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeNumbers_ComparedWithIntegerObject_ReturnsMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		int number = maxnumber.findMaximumNumber(221, 124, 114);
		Assert.assertEquals(221,number);
	}

	
}
