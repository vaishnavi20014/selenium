package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class devmozila {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","driver//chormedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
      
		
		WebElement pet = driver.findElement(By.id("pet-select"));
		Select selectpet=new Select(pet);
		
		// selecting by visible text
		selectpet.selectByVisibleText("Parrot");
		Thread.sleep(1000);
		selectpet.selectByVisibleText("Goldfish");
		Thread.sleep(2000);
	
		 
		//Selecting multiple values by index
	     selectpet.selectByIndex(2);
	     selectpet.selectByIndex(5);
	}

}
