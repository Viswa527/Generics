import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeNumbers_ComparedWithIntegerObject_ReturnsMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		float number = maxnumber.findMaximumNumber(221.3f, 1244.4f, 114.7f);
		Assert.assertEquals(1244.4f,number,0);
	}
	
}
