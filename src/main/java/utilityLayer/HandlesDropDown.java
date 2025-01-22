package utilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.baseClass;

public class HandlesDropDown extends baseClass {
	public static void selectByvisibleText(WebElement wb,String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			Select sel=new Select(wb);
			sel.selectByVisibleText(value);
			
		}
	}

}
