package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(cat).build().perform();
		Thread.sleep(5000);
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span"));
		
		act.moveToElement(books).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[3]/div[1]/div/a[8]/span")).click();
	}

}