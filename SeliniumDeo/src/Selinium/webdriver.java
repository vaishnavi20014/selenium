package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String text1=driver.getTitle();
		System.out.println("return title of web pages"+text1);
		
		String text2=driver.getCurrentUrl();
		System.out.println("return current URL of webpage"+text2);
		
		String text3=driver.getPageSource();
		System.out.println("return HTML code of  webpages"+text3);
		
		//navigate command
		
		//driver.navigate 

	}

}
