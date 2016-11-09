package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Functions.orgMaster;

public class testNG_Empreg 
{
	orgMaster om=new orgMaster();
	String res;
	@BeforeTest
	public void org_Launch()
	{
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
	}
	@BeforeMethod
	public void org_Login()
	{
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
	}
	
	@Test
	public void org_Empreg()
	{
		res=om.org_EmpReg("Sharath", "Chandra");
		System.out.println(res);
	}
	@AfterMethod
	public void org_Logout()
	{
		res=om.org_Logout();
		System.out.println(res);
	}
	@AfterTest
	public void org_Close()
	{
		om.org_Close();
	}
	
}
