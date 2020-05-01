import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeNumbers_ComparedWithIntegerObject_ReturnsMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		float number = maxnumber.findMaximumNumber(221.3f, 124.4f, 114.7f);
		Assert.assertEquals(221.3f,number,0);
	}
	
}
