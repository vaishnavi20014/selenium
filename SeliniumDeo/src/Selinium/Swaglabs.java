package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorme.driver", "driver\\chormedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		username.submit();
		Thread.sleep(1000);
		
		WebElement username1 = driver.findElement(By.id("password"));
		username1.sendKeys("secret_sauce");
		username1.submit();
		Thread.sleep(1000);
		
		WebElement username2 = driver.findElement(By.id("login-button"));
		username1.click();
		
		String vaish=driver.getWindowHandle();
		driver.switchTo().window(vaish);
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(1000);
		
		String currentwindowHandle1 =driver.getWindowHandle();
		driver.findElement(By.xpath())
		}

}
 