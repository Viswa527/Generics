import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeString_ComparedWithStringLengthObject_ReturnsMaximumCharacterdString()
	{
		MaximumNumber maximumNumber=new MaximumNumber();
		String result = maximumNumber.findMaximumLengthOfString("Bananna","PineApple","Orange");
		Assert.assertEquals("PineApple",result);
	}

}
