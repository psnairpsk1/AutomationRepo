package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	//web driver declaration
	public WebDriver driver;//webdriver its a predefined interface.
	
	public void browserLaunch()
	{
		driver = new ChromeDriver();//here ChromeDriver is class and driver is a interface object.So interface objects are created through the help of classes
		//if i need to launch the application in firefox we can use firefox driver
		
		//To launch url we use the method get inside the wedriver interface
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();//to maximize the window
		
	}
	
	//To close the browser we use the new method
	public void closeAndQuit()
	{
		//driver.close(); //to close the current tab
		driver.quit();//to close the entire browser
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.browserLaunch();
		base.closeAndQuit();

	}

}
