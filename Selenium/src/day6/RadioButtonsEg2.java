package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radios=block.findElements(By.name("group1"));
		
		System.out.println(radios.size());

		for (int i = 0; i < radios.size(); i++)
		{
			String rText=radios.get(i).getAttribute("value");
			System.out.println(rText);
			if (rText.equalsIgnoreCase("Cheese")) 
			{
				radios.get(i).click();
				break;
			}
		}
		
		List<WebElement> radios1=block.findElements(By.name("group2"));
		
		System.out.println(radios1.size());

		for (int i = 0; i < radios1.size(); i++)
		{
			String rText=radios1.get(i).getAttribute("value");
			System.out.println(rText);
			if (rText.equalsIgnoreCase("Beer")) 
			{
				radios1.get(i).click();
				break;
			}
		}
	}

}
