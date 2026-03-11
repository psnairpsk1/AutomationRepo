package seleniumbasics;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {

	public void verifyDragAndDrop()
	{
		WebElement others = driver.findElement(By.xpath("//a[@id = 'others']"));
		others.click();
		WebElement draggable = driver.findElement(By.xpath("//span[contains(text(),'Draggable n°1')]"));
		WebElement droppable = driver.findElement(By.xpath("//div[@dropzone='move']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).build().perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDrop dragdrop = new DragAndDrop();
		dragdrop.browserLaunch();
		dragdrop.verifyDragAndDrop();

	}

}
