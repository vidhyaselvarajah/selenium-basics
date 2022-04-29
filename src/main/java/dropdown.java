import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement name=driver.findElement(By.name("Name"));
        name.sendKeys("abc");
		WebElement country=driver.findElement(By.cssSelector("#Form_submitForm_Country"));
		Select drpcountry=new Select(country);
		//drpcountry.selectByValue("6");
		List<WebElement> options=drpcountry.getOptions();
		for(WebElement Country :options)
		{
			if(Country.getText().equalsIgnoreCase("canada"))
			{
				Country.click();
				break;
			}
		}
	}

}
