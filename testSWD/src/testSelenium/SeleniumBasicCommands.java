package testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasicCommands 
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
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        
      //Fetch the text "This is sample text!" and print it on the console
    	//Use the id of the div to locate it and then fecth text using the getText() method
        String sampleText=driver.findElement(By.xpath("//*[contains(text(),'This is sample text!')]")).getText();
        
        System.out.println(sampleText);
        
      //Waiting for 3 seconds just for the user to efficiently check automation
    	//Its not mandatory though
        Thread.sleep(3000);
        
        
      //Using linkText locator to find the link and then using click() to click on it
        
       // driver.findElement(By.linkText("This is a link")).click();
        
        //Thread.sleep(3000);
        
        
      //Finding textbox using id locator and then using send keys to write in it
        driver.findElement(By.id("fname")).sendKeys("Tushar Rajput");
        
        Thread.sleep(3000);
        
        
      //Clear the text written in the textbox
        driver.findElement(By.id("fname")).clear();
        
        Thread.sleep(3000);
        
      //Clicking on button using click() command
        driver.findElement(By.xpath("//*[@id='idOfButton']")).click();
        
        Thread.sleep(3000);
        
      //Find radio button by name and check it using click() function
        driver.findElement(By.xpath("//*[@id='male']")).click();
        
        Thread.sleep(3000);
        
      //Find checkbox by cssSelector and check it using click() function
        driver.findElement(By.xpath("//*[@value='Automation']")).click();
        
        Thread.sleep(3000);
        
      //Using Select class for for selecting value from dropdown
        Select dropdownlist=new Select(driver.findElement(By.xpath("//*[@id='testingDropdown']")));
        dropdownlist.selectByValue("Automation");
        
        Thread.sleep(3000);
        driver.close();
	}

}
