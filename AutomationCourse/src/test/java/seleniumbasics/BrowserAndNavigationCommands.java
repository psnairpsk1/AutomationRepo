package seleniumbasics;

public class BrowserAndNavigationCommands extends Base {
	public void verifyBrowserCommands()
	{
		//to get the title of a page
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to get window handleid
		String handleId = driver.getWindowHandle();//if multiple window id's need to find,then use driver.getWindowHandles() 
		System.out.println(handleId);
		
		//To find the source code of a page
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		
	
	}
	
	public void verifyNavigationCommands()
	{
		//ToMethode for navigate to one page to another page within same application or navigate to diffrent application from one application
		driver.navigate().to("https://www.amazon.in/");
		
		//to go backward or return to the same page
		driver.navigate().back();
		
		//to go forward again and reach to same old page that is https://www.amazon.in/ we use forward method
		driver.navigate().forward();
		
		//to refresh the page
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands browser = new BrowserAndNavigationCommands();
		browser.browserLaunch();
		//browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
		
		
		
		

	}


}
