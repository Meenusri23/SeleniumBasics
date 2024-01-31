import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement Btn = driver.findElement(By.id("j_idt88:j_idt91"));
		Btn.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Confirm or Reject alert
		
		WebElement Btn2 = driver.findElement(By.id("j_idt88:j_idt93"));
		Btn2.click();
		alert.dismiss();
		
		//Prompt box (enter value in alert)
		
		WebElement Btn3 = driver.findElement(By.id("j_idt88:j_idt104"));
		Btn3.click();
		alert.sendKeys("I am able to give value in prompt box");
		alert.accept();
		
		


	}

}
