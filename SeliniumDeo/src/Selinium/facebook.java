package Selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    
    WebElement username = driver.findElement(By.id("email"));
    username.sendKeys("");
    
    Thread.sleep(100);
    WebElement username1 = driver.findElement(By.id("pass"));
    username1.sendKeys("");
    
    driver.findElement(By.name("login")).click();
    
    

	}

}
