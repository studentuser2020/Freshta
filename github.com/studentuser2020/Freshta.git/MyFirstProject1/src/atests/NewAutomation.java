package atests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAutomation {

	//@SuppressWarnings("null")
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\faron\\OneDrive\\Desktop\\Browser Drivers\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\faron\\OneDrive\\Desktop\\Browser Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https)://https://javascript.info/alert-prompt-confirm");
      //html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[2]/div/div[2]/pre"));
    
   // sa.click();
    
    Alert sa1 = driver.switchTo().alert(); 
    
    String sa1text = sa1.getText();
    System.out.println(sa1);
    
    sa1.accept();
    
    
	//driver.close();
    
    // extra mine dis adv. of byid (Its dynamic not static - dy = changing dynamic - not static 
    // Dis of by name - = not every element will have the same name. it will find the first element. m 
	
	//WebDriver driver = null;
	//driver.get("https://facebook.com");
	//String etitle = "Facebook - Log In or Sign Up";
	//String atitle = driver.getTitle();
	//if (etitle.equals(atitle)) {
		//System.out.println("Test case 1,2&3 Passed");
	}
	//else 
	//{ System.out.println("Test case 1&2 failed");

	
	
	
    //driver.get("https://amazon.com");
    //driver.get("https://orbitz.com");
    
   
	//WebElement roomdw = driver.findElement(By.xpath("//*[@id='package-rooms-hp-package']"));
   	//Select room = new Select(roomdw);
    //room.selectByIndex(2);  
    
    
    
	 
	
	//driver.manage().window().maximize();
	
	//String ascurll = driver.getCurrentUrl();
	
	//System.out.println(ascurll); 
	
	//String apsource = driver.getPageSource();
	//System.out.println(apsource);
	
	//driver.getPageSource()
	
	
	//Sting acurll = driver.getCurrent);
	
	//try {
		//Thread.sleep(100);
		
		
	    //driver.navigate().refresh();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().to("https://.google.com"); */
		
		//WebElement e1 = driver.findElement(By.id("email"));
	// e1.sendKeys("abc"); 
    //el.clear(); 
    
	
	/*WebElement e1 = driver.findElement(By.name("email"));
	
		e1.sendKeys("abc");;*/
		
		// link and partial linktest//
		//WebElement falink = driver.findElement(By.linkText("Forgot account"));
   // String linkvalue = falink.getAttribute("href");
    
   //String afvalue = falink.getCssValue("font-family");
   //System.out.println
   
  // Webelementb   
    
   
		
		
		//WebElement falink = driver.findElement(By.linkText("Forgot account?"));
		//WebElement falink1 = driver.findElement(By.partialLinkText("Forgot account"));
		//falink1.click();
		
		
		//List <WebElement> links = driver.findElements(By.tagName("a"));
		
		//for (WebElement link : links) {
			//System.out.println(link.getAttribute("href")); 		
			
		
		//WebElement falink = driver.findElement(By.linkText("Start here."));
		//falink.click();
		//WebElement e1 = driver.findElement(By.id("ap_customer_name"));
	
	
		// e1.sendKeys("Freshta");
	
	
	
	} 
	
	
	
	
	 
	    
	
	 


