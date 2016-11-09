package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		//manage()
		driver.manage().window().maximize();
		//findElement
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.name("Email")).clear();
		
		driver.findElement(By.name("signIn")).click();
//		Sleeper.sleepTightInSeconds(5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signIn")));
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("#signIn")).click();
		//close()
		driver.close();
	}

}
