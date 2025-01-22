package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.baseClass;

public class WebElementsUtils extends baseClass {
	public static void sendKeys(WebElement wb, String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			wb.click();
		}
	}

	public static void handleRadioButton(List<WebElement> list,String value)
	{
		for(WebElement wb:list)
		{
			String actualValue= wb.getText();
			if(actualValue.trim().equalsIgnoreCase(value))
			{
				WebElementsUtils.click(wb);
			}
		}
	}
	
}
