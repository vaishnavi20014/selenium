package Selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chorme.driver","driver//chormedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		TakesScreenshot ts =((TakesScreenshot)driver);
		File src =((TakesScreenshot)ts).getScreenshotAs(OutputType.FILE);
		File des =new File("F:\\screenshot\\instagram.avw.png");
		FileHandler.copy(src, des);
		
	}

}
