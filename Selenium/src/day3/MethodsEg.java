package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg
{
	public static void main(String[] args) 
	{
		String expval="gmail";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		//getTitle()
//		System.out.println(driver.getTitle());
//		String actval=driver.getTitle();
		//Validation
//		if (expval.equalsIgnoreCase(actval)) 
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		//getCurrenturl()
//		System.out.println(driver.getCurrentUrl());
		
		
		//getPageSource()
		
		System.out.println(driver.getPageSource());
		//quit()
		driver.quit();
	}

}
