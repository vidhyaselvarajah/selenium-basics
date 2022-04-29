import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquery {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		Thread.sleep(3000);
		//selectChoice(driver,"choice 3");
		//selectChoice(driver,"choice 1","choice 2 2","choice 4","choice 6");
		selectChoice(driver,"all");

	}


public static void selectChoice(WebDriver driver,String... value)
{
	List<WebElement> choices=driver.findElements(By.xpath("//div[@id='comboTree381159DropDownContainer']/ul//li"));
	System.out.println(choices.size());
	if(value[0].equals("all"))
	{
		for(WebElement item:choices)
		{
			item.click();
			break;
		}
	}
		else 
		{
		for(WebElement item:choices)
		{
			String text=item.getText();
			for(String val:value)
			{
			if(text.equals(val))
			{
				item.click();
				break;
			}
			}
		}
		}
	
}
}


