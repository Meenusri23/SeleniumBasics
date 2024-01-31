import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\DRIVERS\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formstone.it/components/tooltip/");
		
		driver.manage().window().maximize();
		
		WebElement tooltip  = driver.findElement(By.xpath("//*[@id=\"example-0\"]/div/div[1]"));
		String tootltipValue = tooltip.getAttribute("data-title");
		System.out.println(tootltipValue);
		
		

	}

}
