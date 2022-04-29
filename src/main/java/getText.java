import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getText {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement email=driver.findElement(By.xpath("//label[contains(text(),'Email:')]"));
		System.out.println(email.getAttribute("for"));
		//email.clear();
		//email.sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		System.out.println(email.getText());		
	}

}
