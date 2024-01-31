import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		WebElement Calendar = driver.findElement(By.id("datepicker1"));
		Calendar.click();
		//Calendar.sendKeys("03/12/2024"+Keys.ENTER);
		WebElement nextbtn = driver.findElement(By.xpath("//a[@title ='Next']"));
		nextbtn.click();
		WebElement Date_Selected = driver.findElement(By.xpath("//a[contains(text(), '15')]"));
		Date_Selected.click();

	}

}
