package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdownCheckBoxRadioButton extends Base {
	
	public void verifyDropdown() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
		//select the value using Select by index method
		select.selectByIndex(2); //this will select Python

		//select by value
		select.selectByValue("c#");
		
		//select by visible Text
		select.selectByContainsVisibleText("SQL");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdownCheckBoxRadioButton drop = new HandlingDropdownCheckBoxRadioButton();
		drop.browserLaunch();
		drop.verifyDropdown();

	}

}
