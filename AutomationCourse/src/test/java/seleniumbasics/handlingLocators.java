package seleniumbasics;

import org.openqa.selenium.By;

public class handlingLocators extends Base{

	public void verifyLocators()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("description"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		driver.findElement(By.cssSelector("input[id='single-input-field']"));
		
	/*	/html/body/section/div/div/div[2]/div[2]/div/div[1] */ //Absolute Xpath
		
		//x path using relative xpath
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button' ]"));
		driver.findElement(By.xpath("//button[@id='button-one' or @type='button12' ]"));
		//access parent class..ie here our target is to access the parent object or element
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		//access child element with attribue value @id = 'button-one'..ie here our target is to access the child object or element
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
