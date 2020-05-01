import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeString_ComparedWithStringLengthObject_ReturnMaximumCharacterdString()
	{
		MaximumNumber maximumNumber=new MaximumNumber();
		String result = maximumNumber.findMaximumLengthOfString("Bananna","Apple","Orange");
		Assert.assertEquals("Bananna",result);
	}
	@Test
	public void givenThreeString_ComparedWithStringLengthObject_ReturnsMaximumCharacteredString()
	{
		MaximumNumber maximumNumber=new MaximumNumber();
		String result = maximumNumber.findMaximumLengthOfString("Bananna","PineApple","Apple");
		Assert.assertEquals("PineApple",result);
	}
	@Test
	public void givenThreeString_ComparedWithStringLengthObject_ReturnsMaximumCharacterdString()
	{
		MaximumNumber maximumNumber=new MaximumNumber();
		String result = maximumNumber.findMaximumLengthOfString("Apple","PineApple","CustaredApple");
		Assert.assertEquals("CustaredApple",result);
	}


}
