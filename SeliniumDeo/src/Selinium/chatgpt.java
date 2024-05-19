package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chatgpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		driver.get("https://chatgpt.com/");
		
		WebElement element1 = driver.findElement(By.id("radix-:r7:"));
		WebElement element = driver.findElement(By.id("prompt-textarea"));
		
		element1.sendKeys("what is automation ");
		element1.submit();
		
		////*[@id="prompt-textarea"]
		//*[@id="radix-:r7:"]/div/div/button[1]/div
		//*[@id="radix-:r7:"]/div/div/button[1]

	}

}
