import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleDropdown {
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com");
		//WebElement close=driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[12]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/img[1]"));
		//close.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")).click();
		List<WebElement> bootstrap=driver.findElements(By.xpath("//body/div[1]/div[1]/div[2]/div[12]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li"));
		System.out.println(bootstrap.size());
		for(WebElement product:bootstrap)
		{
			if(product.getText().equals("Deposits"))
			{
				product.click();
				break;
			}
		}
		
	}

}
