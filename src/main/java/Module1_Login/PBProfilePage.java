package Module1_Login;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{

	@FindBy(xpath="//div[@class='sc-ckVGcZ kWpXlQ']") private WebElement profileName;
	//div[@class='sc-ckVGcZ kWpXlQ']
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	
	public void switchToChildWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public String getPBProfilePageProfilename() 
	{
		String actPN = profileName.getText();
		return actPN;
	}
//	public void verifyPBProfilePagePN(String expPN)
//	{
//		String actPN = profileName.getText();
//		if(actPN.equals(expPN)) 
//		{
//			System.out.println("Pass");
//		}
//		else 
//		{
//			System.out.println("Fail");
//		}		
//	}
	
//	public void switchtoMainpage()
//	{
//		Set<String> mainpageid = driver1.getWindowHandles();
//		ArrayList<String> al=new ArrayList<String>(mainpageid);
//		driver1.switchTo().window(al.get(0));
//	}
	

}
