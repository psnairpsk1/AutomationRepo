package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {

	public void verifyTables()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		//to print all the data in the table
		//WebElement table =driver.findElement(By.id("dataTable"));
		//or
		WebElement table =driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(table.getText());
		
		
		//to print a specific row. Here we are printing 2nd row
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tableRow.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingTables tables = new HandlingTables();
		tables.browserLaunch();
		tables.verifyTables();

	}

}
