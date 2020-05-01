import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeNumbers_ComparedWithFloatObject_ReturnsMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		float number = maxnumber.findMaximumNumber(2211.3f, 1244.4f, 114.7f);
		Assert.assertEquals(2211.3f,number,0);
	}
	@Test
	public void givenThreeNumbers_ComparedWithFloatObject_ReturnMaximumNumber()
	{
		MaximumNumber maxnumber = new MaximumNumber();
		float number = maxnumber.findMaximumNumber(2211.3f, 124458.4f, 11492.7f);
		Assert.assertEquals(124458.4f,number,0);
	}
	@Test
	public void givenThreeNumber_ComparedWithFloatObject_ReturnsMaximumNumber() {
		MaximumNumber maxnumber = new MaximumNumber();
		float number = maxnumber.findMaximumNumber(2211.3f, 1244.4f, 11492.7f);
		Assert.assertEquals(11492.7f, number, 0);
	}
}
