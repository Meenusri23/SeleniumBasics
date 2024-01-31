import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		
		WebElement Input = driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div[1]/div/"));
		Input.sendKeys("z");
		
		List<WebElement> AutoComplete = driver.findElements(By.xpath("/html/body/section/div[1]/div[2]/div[1]/div/input"));
		
		for (WebElement webElement : AutoComplete) {
			if(webElement.getText().equals("Zimbabwe"))
			{
				webElement.click();
				
			}
			
			
		}
		
		

	}

}
