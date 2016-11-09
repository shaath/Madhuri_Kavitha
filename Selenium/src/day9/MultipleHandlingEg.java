package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleHandlingEg 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		String wId=driver.getWindowHandle();
//		
//		System.out.println(wId);
		
		
		driver.findElement(By.linkText("Privacy")).click();
		
		driver.findElement(By.linkText("Help")).click();
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String windowId=it.next();
			System.out.println(windowId);
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle()+"-----------------"+driver.getCurrentUrl());
			
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"-----------------"+driver.getCurrentUrl());
				break;
			}
			
			catch (Exception e) 
			{
				System.out.println("Exptected link not avaialble in this page"); 
			}
			
			
		}
		
//		driver.findElement(By.linkText("Terms of Service")).click();
	}

}
