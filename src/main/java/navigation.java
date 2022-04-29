import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.get("https://www.snapdeal.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
		

       
	}


}
