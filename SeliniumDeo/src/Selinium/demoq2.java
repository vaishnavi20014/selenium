package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorme.driver","driver//chormedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		//upload filebutton
	    WebElement upload = driver.findElement(By.xpath("//input[@id='uploadFile']"));
	       
	    //upload.click(); not Required
	    upload.sendKeys("E:\\NOTES\\\4.HTML_5_Notes");
	     

	}

}
