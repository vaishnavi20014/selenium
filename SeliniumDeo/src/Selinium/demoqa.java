package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","driver//chormedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//firstName
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("vaishnavi");
		Thread.sleep(1000);
		//lastName
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("shelke");
		Thread.sleep(1000);
		//Email
		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("vaishnavishelke39gmail.com");
		Thread.sleep(1000);
		//genderbtn
	    driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
	    //radiobtn.click();
		//userNumber
		WebElement no = driver.findElement(By.id("userNumber"));
		no.sendKeys("9850757659");
		Thread.sleep(1000);
		////input[@id='dateOfBirthInput']
		
		
		
		

	}

}
