import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Informing system about using CHROME browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		//Creating object for web Driver
		
		WebDriver driver = new ChromeDriver();
		
		//Getting URL 
		
		driver.get("https://www.google.com/");
		//driver.get("https://www.leafground.com/link.xhtml");
		
		//Maximize window
		
		driver.manage().window().maximize();
		
		//Find google search TextBox
		
		driver.findElement(By.className("gLFyf")).sendKeys("Agni"+Keys.ENTER);
		//Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
		//Find 1st link after search results
		
		//clicking on hyperlink text
		
		//driver.findElement(By.linkText("Physiological aspects of Agni - PMC")).click();
		
		
		
		
		
		
		//quit browser
		//driver.quit();
		

	}

}
