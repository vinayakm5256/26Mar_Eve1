package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInWithMobNumPage 
{

	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;

	
	public PBSignInWithMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  setPBSignInWithMobNumPageMobNum(String MOBNumer)
	{
		mobNum.sendKeys(MOBNumer);
	}
	
	public void clickPBSignInWithMobNumPagesignInWithPwd()
	{
		signInWithPwd.click();
	}


}
