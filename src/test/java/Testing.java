import Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
	@Test
	public void givenThreeString_ComparedWithStringLengthObject_ReturnMaximumCharacterdString()
	{
		MaximumNumber maximumNumber=new MaximumNumber();
		String result = (String) maximumNumber.MaximumNumber("Bananna","Apple","Orange");
		Assert.assertEquals("Bananna",result);
	}
	@Test
	public void givenThreeString_ComparedWithStringLengthObject_ReturnsMaximumCharacteredString()
	{
		MaximumNumber maximumNumber=new MaximumNumber();
		String result = (String) maximumNumber.MaximumNumber("Bananna","PineApple","Apple");
		Assert.assertEquals("PineApple",result);
	}
	@Test
	public void givenThreeString_ComparedWithStringLengthObject_ReturnsMaximumCharacterdString()
	{
		MaximumNumber maximumNumber=new MaximumNumber();
		String result = (String) maximumNumber.MaximumNumber("Apple","PineApple","CustaredApple");
		Assert.assertEquals("CustaredApple",result);
	}
}
