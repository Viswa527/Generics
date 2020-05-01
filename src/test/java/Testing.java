import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeNumbers_ComparedWithIntegerObject_ReturnsMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		float number = maxnumber.findMaximumNumber(2211.3f, 1244.4f, 11492.7f);
		Assert.assertEquals(11492.7f,number,0);
	}
	
}
