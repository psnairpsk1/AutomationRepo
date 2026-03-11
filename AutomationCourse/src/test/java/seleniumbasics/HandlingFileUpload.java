package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
public void verifyFileUploadUsingSendkeys()
{
	driver.navigate().to("https://demo.guru99.com/test/upload/");
	WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
	uploadFile.sendKeys("C:\\Users\\ASUS\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\Test.pdf");
	WebElement accept = driver.findElement(By.id("terms"));
	accept.click();
	WebElement submit = driver.findElement(By.id("submitbutton"));
	submit.click();
	
	}

public void verifyFileUploadUsingRobot() throws AWTException
{
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement selectFile = driver.findElement(By.id("pickfiles"));
	selectFile.click();
	StringSelection select = new StringSelection("C:\\Users\\ASUS\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\Test.pdf");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
    Robot robot = new Robot();
    robot.delay(2500);

    robot.keyPress(KeyEvent.VK_ENTER); 
    robot.keyRelease(KeyEvent.VK_ENTER); 
    robot.keyPress(KeyEvent.VK_CONTROL); 
    robot.keyPress(KeyEvent.VK_V); 
    robot.keyRelease(KeyEvent.VK_CONTROL); 
    robot.keyRelease(KeyEvent.VK_V); 
    robot.keyPress(KeyEvent.VK_ENTER); 
    robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload fileupload = new HandlingFileUpload();
		fileupload.browserLaunch();
		fileupload.verifyFileUploadUsingSendkeys();
		try {
			fileupload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    


	}

}
