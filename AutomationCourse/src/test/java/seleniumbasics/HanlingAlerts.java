package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HanlingAlerts extends Base {

	
	public void verifySimpleAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		//Alert is a interface
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void verifyConfirmAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Alert alrt = driver.switchTo().alert();
		//alrt.dismiss();//to click cancelor No button
		alrt.accept();//To click ok button.
		
		
	}
	
	public void verifyPromptAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptButton = driver.findElement(By.id("promtButton"));
		promptButton.click();
		Alert alrt = driver.switchTo().alert();
		alrt.sendKeys("Prasanth");
		alrt.accept();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HanlingAlerts alerts = new HanlingAlerts();
		alerts.browserLaunch();
		//alerts.verifySimpleAlerts();
		alerts.verifyConfirmAlerts();
		//alerts.verifyPromptAlerts();

	}

}
