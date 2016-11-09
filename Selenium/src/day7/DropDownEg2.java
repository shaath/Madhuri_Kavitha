package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		Select f=new Select(fdrop);
		
		List<WebElement> flist=f.getOptions();
		
		System.out.println(flist.size());
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select t=new Select(tdrop);
		
		
		for (int i = 0; i < flist.size(); i++) 
		{
			f.selectByIndex(i);
			String fcity=flist.get(i).getText();
			System.out.println(fcity);
			
			List<WebElement> tlist=t.getOptions();
			
			for (int j = 0; j < tlist.size(); j++)
			{
				t.selectByIndex(j);
				
				String tcity=tlist.get(i).getText();
				
				if (fcity.equalsIgnoreCase(tcity))
				{
					flag=true;
					break;
				}
				
			}
			if (flag==true)
			{
				break;
				
			}
			
		}
		
		if (flag==true) 
		{
			System.out.println("Fail");
			
		}
		else
		{
			System.out.println("Pass");
		}

	}

}
