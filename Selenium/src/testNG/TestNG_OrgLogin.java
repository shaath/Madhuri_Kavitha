package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Functions.orgMaster;

public class TestNG_OrgLogin 
{
	orgMaster om=new orgMaster();
	public static String res;
	@BeforeMethod
	public void Org_Launch()
	{
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
	}
	@Test
	public void org_Login()
	{
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
	}
	@AfterMethod
	public void org_Logout()
	{
		res=om.org_Logout();
		System.out.println(res);
		om.org_Close();
	}

}
