package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorome.driver","driver//choromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		
		//first name
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("vaishnavi");
		Thread.sleep(1000);
		
		//last name
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("shelke");
		Thread.sleep(1000);
		
		//gender btn
		WebElement radiobtn = driver.findElement(By.id("sex-1"));
		radiobtn.click();	
		
		//video
		WebElement videobtn = driver.findElement(By.id("ez-video-ez-4998_html5_api"));
		videobtn.click();
		
		//experience btn
		WebElement expbtn = driver.findElement(By.name("exp"));
		expbtn.click();
		
		//date
		WebElement date = driver.findElement(By.id("datepicker"));
		lastname.sendKeys("21-5-2024");
		Thread.sleep(1000);
		
		
		//profession btn
	    WebElement probtn = driver.findElement(By.id("profession-1"));
		probtn.click();	
		
		//automation tool
		WebElement tool = driver.findElement(By.id("tool-2"));
		tool.click();	
		
		//Continents
		WebElement Continents = driver.findElement(By.id("continents"));
		Continents.click();	
	}

}
