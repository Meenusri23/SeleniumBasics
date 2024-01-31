import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> Columns = driver.findElements(By.tagName("th"));
		int Clmn_Size = Columns.size();
		System.out.println(Clmn_Size);

		List<WebElement> Rows = driver.findElements(By.tagName("tr"));
		int row_Size = Rows.size();
		System.out.println(row_Size);


		WebElement GetContact = driver.findElement(By.xpath("//td[normalize-space()='Island Trading']//following::td[1]"));
		String Name = GetContact.getText();
		System.out.println(Name);


		List<WebElement> Clmn2_Value = driver.findElements(By.xpath("//td[2]"));

		List<String> ColumnList = new ArrayList<String>();

		for (WebElement webElement : Clmn2_Value) {
			String RowValue = webElement.getText();
			ColumnList.add(RowValue);

		}
		System.out.println("All values in 2nd column\n" +ColumnList);
	}

}
