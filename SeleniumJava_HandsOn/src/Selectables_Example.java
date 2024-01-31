import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Selectable.html");
		
		List<WebElement> UnorderedList = driver.findElements(By.xpath("//*[@id=\"Serialize\"]/ul/li"));
		//int listCount = UnorderedList.size();
		//System.out.println(listCount);
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).click(UnorderedList.get(0))
		.click(UnorderedList.get(1))
		.click(UnorderedList.get(2)).build().perform();
		
		/*actions.clickAndHold(UnorderedList.get(0));
		actions.clickAndHold(UnorderedList.get(1));
		actions.clickAndHold(UnorderedList.get(2));
		actions.build().perform();*/
		


	}

}
