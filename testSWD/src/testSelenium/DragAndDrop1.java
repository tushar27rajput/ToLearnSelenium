package testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 
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
        driver.get("https://demoqa.com/droppable/");
        
        WebElement from=driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement to=driver.findElement(By.xpath("//*[@id='droppable']"));
        
        Actions action = new Actions(driver);
        action.dragAndDrop(from, to).perform();
        
        String toText = to.getText();
        System.out.println(toText);
        
        if(toText.equals("Dropped!")) 
        {
			System.out.println("PASS: Source is dropped to target as expected");
		}
        else 
		{
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	}

}
