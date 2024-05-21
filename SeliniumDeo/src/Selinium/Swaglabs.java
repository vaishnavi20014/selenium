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
		
		//username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		
		//password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		//login button
		WebElement Button = driver.findElement(By.id("login-button"));
		Button.click();
		
		//switch window
		String vaish=driver.getWindowHandle();
		driver.switchTo().window(vaish);
		
		//select Bag code
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(1000);
		
		 String currentwindowHandle1 = driver.getWindowHandle();
	     driver.switchTo().window(currentwindowHandle1);
	    
	    //add to cart button
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(1000);
		
		//add icon item
		driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
		Thread.sleep(1000);
		
		//checkout button
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		//driver.findElement(By.xpath("//input[@id='first-name']")).click();
		
		//first name
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("first-name");
		Thread.sleep(1000);
		
		//last name
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("last-name");
		Thread.sleep(1000);
		
		//code
		WebElement code = driver.findElement(By.id("postal-code"));
		code.sendKeys("postal-code");
		Thread.sleep(1000);
		
		//continue button
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		Thread.sleep(1000);
		
		//finish button
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
		
		}

}
 