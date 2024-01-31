import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		//Input Name
		
		WebElement Name = driver.findElement(By.id("j_idt88:name"));
		Name.sendKeys("Meenakshi Srinivasan");
		
		//Append Text
		
		WebElement Appendtext = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		Appendtext.sendKeys(" is beautiful city");
		
		//Retrieve text from TextBox
		
		WebElement RetrieveBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String RetrieveText = RetrieveBox.getAttribute("value");
		System.out.println(RetrieveText);
		
		//Clear Text in the TextBox
		WebElement ClearText = driver.findElement(By.id("j_idt88:j_idt95"));
		ClearText.clear();
		
		//Check if the textBox is Disabled
		 WebElement Disabled = driver.findElement(By.id("j_idt88:j_idt93"));
		 boolean DisabledBox = Disabled.isEnabled();
		 System.out.println(DisabledBox);
		
		
	}

}
