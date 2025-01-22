package PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.baseClass;
import utilityLayer.HandlesDropDown;
import utilityLayer.WebElementsUtils;

public class SignUpPage extends baseClass {
	
	public void createAccount(String Fname,String Lname,String Date,String month,
			String year,String dd,String mob,String Pwd) {
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElementsUtils.sendKeys(Firstname, Fname);
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElementsUtils.sendKeys(Lastname, Lname);
		
		WebElement dt=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		HandlesDropDown.selectByvisibleText(dt, Date);
			
		WebElement mon=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		HandlesDropDown.selectByvisibleText(mon, month);
		
		WebElement yr=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		HandlesDropDown.selectByvisibleText(yr, year);
		
		List<WebElement> radio=driver.findElements(By.xpath("//label[@class='_58mt']"));
		WebElementsUtils.handleRadioButton(radio, dd);
		
		WebElement Phone=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElementsUtils.sendKeys(Phone, mob);
		
			
		WebElement Pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		WebElementsUtils.sendKeys(Pass, Pwd);
		
	}

}
