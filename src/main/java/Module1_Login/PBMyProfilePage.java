package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage 
{
@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
//span[text()=' My profile ']
// @FindBy(xpath="//span[text()='Sign out']") private WebElement SignOut;
//	
// @FindBy (xpath="//a[text()='Support']") private WebElement support;
// 
//@FindBy(xpath="(//span[@class='strong'])[1]")private  WebElement policy;

    WebDriver driver1; 
	
	public PBMyProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void clickPBMyProfilePageMyProfile() 
	{
		MyProfile.click();
	}
	
//	public void clickPBMyProfilePageSignOut () 
//	{
//		SignOut.click();
//	}
//
//	public void mouseOverPBLoginPagesupport() 
//	{
//		Actions act=new Actions(driver1);
//		act.moveToElement(support).perform();		
//	}
//	
//	public void clickPBMyProfilePagepolicy() 
//	{
//		policy.click();
//	}
	
	
}
