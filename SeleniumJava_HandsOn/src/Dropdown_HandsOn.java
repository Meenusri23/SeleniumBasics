import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/select.xhtml");

		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		//SEND KEYS TO DROPDOWN
		Dropdown.sendKeys("Cypress");

		//USING SELECT CLASS FOR DROPDOWN, CREATING OBJECT FOR SELECT CLASS
		Select select = new Select(Dropdown);

		//SELECT VALUE BY INDEX
		select.selectByIndex(0);

		//Thread.sleep(2000);

		//SELECT BY VISIBLE TEXT
		select.selectByVisibleText("Puppeteer");
		
		//GET ALL OPTIONS IN DROPDOWN
		List<WebElement> Options = select.getOptions();
		int Count = Options.size();
		System.out.println("Number of options in the dropdown is : " +Count );
		
		//MULTI SELECT BOX
		
		/*WebElement MultiSelect = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]"));
		Select multiselectOptions = new Select(MultiSelect);
		multiselectOptions.selectByIndex(0);
		multiselectOptions.selectByIndex(2);
		multiselectOptions.selectByIndex(3);*/
		
		



	}

}
