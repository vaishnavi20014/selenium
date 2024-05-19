package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class flipcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    
	   WebElement username = driver.findElement(By.name("q"));
	   username.sendKeys("western tops");
	   username.submit();
	   
	   WebElement username1 = driver.findElement(By.xpath(" //*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img"));
	 //*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img
	   username.click();
	}

}
