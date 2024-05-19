package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("identifier"));
	    username.sendKeys("vaishnavishelke39@gmail.com");
	    driver.findElement(By.id("identifierNext")).click();

	 
	    WebElement username1 = driver.findElement(By.name("passwd"));
	    username1.sendKeys("");
	  //*[@id="password"]/div[1]/div/div[1]/input
	    
	    driver.findElement(By.name("loginForm")).click();

	}

}
