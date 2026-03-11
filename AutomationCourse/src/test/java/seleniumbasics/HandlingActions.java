package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{

	private static final String TimeUnit = null;
	private static final String SECONDS = null;

	public void verifyRightClick()
	{
		WebElement othersMenu = driver.findElement(By.id("others"));
		Actions act = new Actions(driver);
		act.contextClick(othersMenu).build().perform();
	}
	
	public void verifyMouseOver()
	{
		WebElement othersMenu = driver.findElement(By.id("others"));
		Actions act = new Actions(driver);
		act.moveToElement(othersMenu).build().perform();
		
	}
	
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		//drag.click();
        act.dragAndDrop(drag, drop).build().perform();
	
	}
	//KeyBoard Events
	public void verifyKeyboardActions() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions = new HandlingActions();
		actions.browserLaunch();
		//actions.verifyRightClick();
		//actions.verifyMouseOver();
		actions.verifyDragAndDrop();
		
		
		
		/*try {
			actions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
