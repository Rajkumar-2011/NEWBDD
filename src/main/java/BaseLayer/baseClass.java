package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
protected static WebDriver driver;
	public static void initialization()
	{
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.facebook.com/reg");
		
	}
}
