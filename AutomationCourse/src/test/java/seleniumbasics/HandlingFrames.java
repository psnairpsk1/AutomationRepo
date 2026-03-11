package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public void verifyFrame()
	{
		driver.navigate().to("https://demoqa.com/frames");
		//in order to use findElements we need to use List or collections
		List <WebElement>totalframe = driver.findElements(By.tagName("iframe"));
		//to find the count of elements.
		System.out.println(totalframe.size());
		
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		driver.switchTo().defaultContent();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingFrames frames = new HandlingFrames();
		frames.browserLaunch();
		frames.verifyFrame();

	}

}
