import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/sorting/#Simple%20List");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"Simple List\"]")).click();
		
		Thread.sleep(3000);
		
		WebElement Sort = driver.findElement(By.xpath("//*[@id=\"sortable\"]"));
		List<WebElement> list = Sort.findElements(By.tagName("li"));
		System.out.println(list);
		WebElement From = list.get(5);
		WebElement To = list.get(2);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(From);
		actions.moveToElement(To);
		actions.release();
		actions.build().perform();
		

	}

}
