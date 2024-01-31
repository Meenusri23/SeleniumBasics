import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node01ufreixwrca4215n06k85oo0ee78438.node0");
		
		WebElement Radiobtn = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[3]/div/div[2]/span"));
		Radiobtn.click();

	}

}
