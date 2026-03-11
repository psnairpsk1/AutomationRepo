package seleniumcodepractise;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumbasics.Base;

public class HandlingAlertsInSelenium extends Base{

	public void verifyAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickMe1 = driver.findElement(By.xpath("//button[@id = 'alertButton']"));
		clickMe1.click();
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		
		
	}
	
	public void verifyConfirmationAlert()
	{
		//driver.navigate().to("https://demoqa.com/alerts");

		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Alert alrt = driver.switchTo().alert();
		//alrt.dismiss();//to click cancelor No button
		alrt.accept();//To click ok button
	}
	public void verifyPromptAlerts()
	{
		//driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickMe3 = driver.findElement(By.id("promtButton"));
		clickMe3.click();
		Alert alrt = driver.switchTo().alert();
		alrt.sendKeys("Hi And Hello");
		alrt.accept();
		//alrt.dismiss();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlertsInSelenium alerts = new HandlingAlertsInSelenium();
		alerts.browserLaunch();
		alerts.verifyAlerts();
		alerts.verifyConfirmationAlert();
		alerts.verifyPromptAlerts();

	}

}
