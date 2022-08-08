package Module1_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Library_Files.Utility_Class;
import Library_Files.BASECLASS;
import Module1_Login.PBLoginPage;
import Module1_Login.PBMyProfilePage;
import Module1_Login.PBProfilePage;
import Module1_Login.PBSignInWithMobNumPage;
import Module1_Login.PBSignInWithPwdPage;

public class PBLoginTest extends BASECLASS
{
	int a;
	PBLoginPage Login;
	PBSignInWithMobNumPage MobNum;
	PBSignInWithPwdPage  pwd;
	PBMyProfilePage MYP;
	PBProfilePage  profile;
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
     
		initializeBrowser();
		
		Login=new PBLoginPage(driver);
		MobNum=new PBSignInWithMobNumPage(driver);
		pwd=new PBSignInWithPwdPage(driver);
		MYP=new PBMyProfilePage(driver);
		profile=new PBProfilePage(driver);
		a=10;
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		System.out.println(a);
		Login.clickPBLoginPageSignIN();
		Thread.sleep(3000);
		MobNum.setPBSignInWithMobNumPageMobNum(Library_Files.Utility_Class.getPFData("MobNum"));
		MobNum.clickPBSignInWithMobNumPagesignInWithPwd();
		pwd.setPBSignInWithPwdPagePWD(Library_Files.Utility_Class.getPFData("PWD"));
		pwd.clickPBSignInWithPwdPageSignIn();
		Thread.sleep(3000);
	}
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID = 101;
		Login.mouseOverPBLoginPageMyAcc();
		Thread.sleep(3000);
		MYP.clickPBMyProfilePageMyProfile();
		
		profile.switchToChildWindow();
		
		//profile.verifyPBProfilePagePN(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actName= profile.getPBProfilePageProfilename();
		String expName=Library_Files.Utility_Class.getTD(0, 2);
		Assert.assertEquals(actName, expName,"Failed:both results are not same:");
		
	}
    @AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException 
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			Library_Files.Utility_Class.captureScreenShot(driver, TCID);
		}
		
	}
    @AfterClass
    public void closebrowser() 
    {
    	
		driver.quit();
	}
}
