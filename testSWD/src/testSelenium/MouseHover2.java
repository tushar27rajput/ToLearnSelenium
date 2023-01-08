package testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 
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
		        driver.get("https://demoqa.com/slider/");
		        
		        Thread.sleep(3000);
		        
		        WebElement slider=driver.findElement(By.xpath("//*[@class='range-slider range-slider--primary']"));
		        Actions action = new Actions(driver);
		        action.moveToElement(slider, 50, 0).perform();
		        slider.click();

	}

}
