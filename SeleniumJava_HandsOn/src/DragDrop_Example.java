import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01np9rv34z9pcb9qvoj5254zb778988.node0");
		
		WebElement DragableBox = driver.findElement(By.id("form:drag_content"));
		WebElement DropableBox = driver.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(driver);
		
		//actions.clickAndHold(DragableBox).moveToElement(DropableBox).release(DropableBox).build().perform();
		actions.dragAndDrop(DragableBox, DropableBox).build().perform();
		


	}

}
