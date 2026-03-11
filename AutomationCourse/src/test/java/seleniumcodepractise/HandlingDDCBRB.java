package seleniumcodepractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumbasics.Base;

public class HandlingDDCBRB extends Base {

	public void verifyDD()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dd = driver.findElement(By.xpath("//select[@id ='dropdowm-menu-1']"));
		Select select = new Select(dd);
		//select.selectByIndex(1);
		//select.selectByValue("python");
		select.selectByContainsVisibleText("SQL");
		
	}
	
	public void verifyChckBox()
	{
		WebElement cb = driver.findElement(By.xpath("//input[@value ='option-1']"));
		WebElement cb2 = driver.findElement(By.xpath("//input[@value ='option-4']"));
		cb.click();
		cb2.click();
	}
	
	public void verifyRadioButton()
	{
		WebElement rb2 = driver.findElement(By.xpath("//input[@value ='blue']"));
		rb2.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDDCBRB browser = new HandlingDDCBRB();
		browser.browserLaunch();
		browser.verifyDD();
		browser.verifyChckBox();
		browser.verifyRadioButton();

	}

}
