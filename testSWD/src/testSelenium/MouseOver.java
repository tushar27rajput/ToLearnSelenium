package testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Set system property for driver executable's path
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tusha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        
        //Create Chrome driver's instance
        WebDriver driver = new ChromeDriver();
        
        //Set implicit wait of 10 seconds
    	//This is required for managing waits in selenium webdriver
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
        //Launch sampleSiteForSelenium
        driver.get("https://demoqa.com/menu/");
        
        Thread.sleep(3000);
        
        WebElement buttonElement = driver.findElement(By.xpath("//*[contains(text(),'Main Item 2')]"));
        Actions action = new Actions(driver);
        action.moveToElement(buttonElement).perform();
        
        
       WebElement subMenuButton=driver.findElement(By.xpath(" //*[contains(text(),'SUB SUB LIST »')]"));
       action.moveToElement(subMenuButton).perform();
       
       WebElement selectMenu=driver.findElement(By.xpath(" //*[contains(text(),'Sub Sub Item 2')]"));
       action.moveToElement(selectMenu).perform();
       

	}

}
