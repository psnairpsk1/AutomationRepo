package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	
	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox = driver.findElement(By.id("single-input-field"));
		//entering text
		msgbox.sendKeys("Test Message");
		WebElement showbutton = driver.findElement(By.id("button-one"));
		System.out.println(showbutton.isDisplayed());
		System.out.println(showbutton.isEnabled());
		showbutton.click();
		//to get the message in the message box
		WebElement yourmessage = driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());
		
		msgbox.clear();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands commands = new WebElementCommands();
		commands.browserLaunch();
		commands.verifyWebElement();

	}

}
