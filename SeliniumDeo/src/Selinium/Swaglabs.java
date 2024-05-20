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
		
		 String currentwindowHandle1 = driver.getWindowHandle();
	     driver.switchTo().window(currentwindowHandle1);
	     
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(1000);
		
		/* System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	       // System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();// open the browser

	       driver.manage().window().maximize();// maximize the windows
	       driver.get("https://www.saucedemo.com/v1/");
	       WebElement username = driver.findElement(By.id("user-name"));
	       WebElement password = driver.findElement(By.id("password"));

	       Thread.sleep(1000);
	       username.sendKeys("standard_user");
	       
	       Thread.sleep(1000);
	       password.sendKeys("secret_sauce");

	       WebElement Login = driver.findElement(By.id("login-button"));
	       // id="login-button"
	       Login.click();
	       Thread.sleep(1000);
	       // Switch to Product Page
	       String currentwindowHandle = driver.getWindowHandle();
	       driver.switchTo().window(currentwindowHandle);

	       // Sauce Labs Bolt T-Shirt
	       driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
	       Thread.sleep(1000);

	       // Switch to Product Page
	       String currentwindowHandle1 = driver.getWindowHandle();
	       driver.switchTo().window(currentwindowHandle1);

	       // driver.findElement(By.className("btn_primary btn_inventory")).click();
	       driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

	       Thread.sleep(100);*/

	      
		
		}

}
 