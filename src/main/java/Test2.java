
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//driver.close();
		//WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//System.out.println(search.isDisplayed());
		//System.out.println(search.isEnabled());
		WebElement female=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		System.out.println(female.isSelected());
		female.click();
		Thread.sleep(3000);
		System.out.println(female.isSelected());
		

       
	}

}
