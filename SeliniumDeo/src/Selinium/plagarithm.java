package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class plagarithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorme.driver","driver//chormedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.check-plagiarism.com/#google%20vignette");
		
		//upload file
		WebElement Upload= driver.findElement(By.xpath("//p[text()='Upload File']"));
		Upload.click();
		//upload
	    Upload.sendKeys("file:///E:/Resume__Vaishanavi__Shelke.pdf");
		//check plagarism
		driver.findElement(By.xpath("//a[@id='checkPlag']")).click();
		

	}

}
