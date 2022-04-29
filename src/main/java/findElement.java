import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElement {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("abc");
		List<WebElement> info=driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]/div[1]//a"));
		System.out.print(info.size());
		System.out.println(info.isEmpty());
		for(WebElement a:info)
		{
			System.out.println(a.getText());
		}
	}

}
