package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInWithPwdPage 
{

	@FindBy(xpath="//input[@name='password']") private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement signIn;

	
	public PBSignInWithPwdPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setPBSignInWithPwdPagePWD(String passoword) 
	{
		pwd.sendKeys(passoword);
	}
	
	public void clickPBSignInWithPwdPageSignIn() 
	{
		signIn.click();
	}


}
