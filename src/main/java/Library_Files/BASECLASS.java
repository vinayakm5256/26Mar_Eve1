package Library_Files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASECLASS
{
	public WebDriver driver;
	public void initializeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypcd\\Desktop\\MY NOTES TESTING\\26Mar_Eve\\BrowsersFile\\chromedriver.exe");			
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get(Utility_Class.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
		
	}
	
	

}
