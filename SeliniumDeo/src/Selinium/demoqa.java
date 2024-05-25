package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		//date of birth
		WebElement datepicker=driver.findElement(By.className("form-control react-datepicker-ignore-onclickoutside"));
		WebElement selectDay =driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--025 react-datepicker__day--weekend']"));
		selectDay.click();
		
		//subjects
		//WebElement sub = driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
		//sub.sendKeys("Mca");
		//Thread.sleep(1000);
		
		WebElement Sub = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
		Sub.sendKeys("english");
		Thread.sleep(1000);
		
		//dropdown
		//WebElement state=driver.findElement(By.className("css-19bqh2r"));
	    //Select selectstate = new Select(state);
		
		WebElement Colour = driver.findElement(By.id("oldSelectMenu"));
		Select selectColour=new Select(Colour);
		
		// selecting by visible text
		selectColour.selectByVisibleText("Aqua");
		Thread.sleep(100);
		selectColour.selectByVisibleText("Black");
		Thread.sleep(2000);
		

	}

}
