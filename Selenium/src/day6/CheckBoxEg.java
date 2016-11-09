package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("Gandesharath");
		driver.findElement(By.id("next")).click();
		
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		
		if (check.isSelected())
		{
			check.click();
			
		}
		else
		{
			System.out.println("It is already in unselected position");
		}
	}

}
