package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJSExecuter extends Base{

	public void verifyJs() throws AWTException
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showButton = driver.findElement(By.id("button-one"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",showButton);
		js.executeScript("window.scrollBy(0,100)", "");//to scroll down
		
		Robot rbt = new Robot();
		rbt.delay(2500);
		js.executeScript("window.scrollBy(0,-100)", "");//to scroll up
		
		//JavascriptExecuter js=(JavascriptExecutor)driver; 
		//js.executeScript("arguments[0].click();")
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingJSExecuter jsexec = new HandlingJSExecuter();
		jsexec.browserLaunch();
		try {
			jsexec.verifyJs();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
