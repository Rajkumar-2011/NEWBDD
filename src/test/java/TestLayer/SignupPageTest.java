package TestLayer;

import BaseLayer.baseClass;
import PageLayer.SignUpPage;

public class SignupPageTest extends baseClass {

	public static void main(String[] args) throws InterruptedException {
		baseClass.initialization();
		Thread.sleep(3000);
		SignUpPage signup=new SignUpPage();
		Thread.sleep(3000);
		signup.createAccount("Atharva", "Rajkumar", "12", "Nov", "2020", "Male", "9632587418","atharva@gmail.com");
		Thread.sleep(3000);
		driver.quit();
	}

}
