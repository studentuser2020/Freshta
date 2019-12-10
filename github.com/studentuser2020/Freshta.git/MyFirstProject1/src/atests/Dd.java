package atests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faron\\OneDrive\\Desktop\\Browser Drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://orbitz.com");
	    driver.    
	    	    
		WebElement roomdw = driver.findElement(By.xpath("//*[@id='package-rooms-hp-package']"));
	   Select room = new Select(roomdw);
	   //room.selectByIndex(2);  
	  // room.deselectByValue("2");
	   //room.deselectByVisibleText("2");
	   
	   WebElement pclass = driver.findElement(By.xpath("//*[@id='package-advanced-preferred-class-hp-package']"));
	   Select pclass1 = new Select(pclass);
	   //pclass.selectByIndex
	    
	   
	   
	   
	   
	   
	}

}
