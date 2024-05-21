package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    
	   WebElement username = driver.findElement(By.name("q"));
	   username.sendKeys("western tops");
	   username.submit();
	   

		//switch window
		String vaish=driver.getWindowHandle();
		driver.switchTo().window(vaish);
	   
	   //top img click
	   driver.findElement(By.linkText("Casual Regular Sleeves Printed Women Pink Top")).click();
	   Thread.sleep(1000);
	   
	   //login button
       //driver.findElement(By.xpath("//a[@class='UL9nZx']")).click();
	   //Thread.sleep(1000);
	   
	   //size button select
	   //driver.findElement(By.xpath("//a[@class='CDDksN io5kcR zmLe5G dpZEpc']")).click();
	   
	   //pincode
	   //driver.findElement(By.xpath("//input[@class='tsvU86']")).click();
		
	   //String currentwindowHandle1 = driver.getWindowHandle();
	   //driver.switchTo().window(currentwindowHandle1);
	   
	  //add to cart button
	  driver.findElement(By.xpath("//a[@class='_9Wy27C']")).click();
	  Thread.sleep(1000);
	   
	   //[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input
		Thread.sleep(100);
		//WebElement login=driver.findElement(By.className("r4vIwl Jr-g+f"));
		driver.findElement(By.xpath("//div[@class='UL9nZx']")).click();
		//*[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input
		//login.sendKeys("vaishnavishelke39@gmail.com");
		
	   
	   
	}

}
