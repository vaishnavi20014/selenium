package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("");
	    
	   
	    WebElement username1 = driver.findElement(By.name("password"));
	    username1.sendKeys("");
	    
	    driver.findElement(By.id("loginForm")).click();

	}

}
