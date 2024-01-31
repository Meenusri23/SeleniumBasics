import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Informing system about using CHROME browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		//Creating object for web Driver
		
		WebDriver driver = new ChromeDriver();
		
		//Getting URL 
		
		//driver.get("https://www.google.com/");
		driver.get("https://www.leafground.com/link.xhtml");
		
		//Maximize window
		
		driver.manage().window().maximize();
		
		//Find google search TextBox
		
		driver.findElement(By.className("gLFyf")).sendKeys("Agni"+Keys.ENTER);
		
		//Find 1st link after search results
		
		//clicking on hyperlink text
		
		driver.findElement(By.linkText("Go to Dashboard")).click();
		
		
		
		
		
		//quit browser
		//driver.quit();
		

	}

}
