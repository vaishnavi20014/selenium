package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

   public static void main(String[] args) {

       System.out.println("hi");

   System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
   WebDriver driver = new EdgeDriver();


//ChromeDriver driver = new ChromeDriver();

//create varibale for child class and assigning it
//to variable of parent class : upcating
   
     
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       System.out.println(driver.getPageSource());
       System.out.println(driver.getTitle());
   }

}
