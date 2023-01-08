package testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList 
{

	public static void main(String[] args) 
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
		        driver.get("https://artoftesting.com/sampleSiteForSelenium");

		        JavascriptExecutor js = (JavascriptExecutor)driver;
		        js.executeScript("scrollBy(0,500)");
		        
		      //Using Select class for for selecting value from dropdown
		        Select dropdownlist=new Select(driver.findElement(By.xpath("//*[@id='testingDropdown']")));
		        //dropdownlist.selectByValue("Automation");
		        //dropdownlist.selectByIndex(2);
		        dropdownlist.selectByVisibleText("Database Testing");
	}

}
