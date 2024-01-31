import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_HandsOn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/window.xhtml");
		String OldWindow = driver.getWindowHandle();
		//System.out.println(OldWindow);

		WebElement WindowsBtn1 = driver.findElement(By.id("j_idt88:new"));
		WindowsBtn1.click();
		Set<String> handles = driver.getWindowHandles();

		for (String NewWindow : handles) {

			driver.switchTo().window(NewWindow);
		}

		WebElement Info = driver.findElement(By.xpath("//*[@id=\"right-sidebar-button\"]/i"));
		Info.click();

		driver.close();

		//Move to default window
		driver.switchTo().window(OldWindow);

		WebElement WindowsBtn2 = driver.findElement(By.id("j_idt88:j_idt91"));
		WindowsBtn2.click();
		Thread.sleep(3000);

		//TO FIND NO OF WINDOWS OPENED

		int OpenWindows = driver.getWindowHandles().size();
		System.out.println("No of Windows opened currently are : " +OpenWindows);

		//CLOSE ALL WINDOWS EXCEPT PARENT WINDOW
		WebElement CloseWindow = driver.findElement(By.id("j_idt88:j_idt93"));
		CloseWindow.click();
		Thread.sleep(3000);
		Set<String> handles2 = driver.getWindowHandles();
		for (String Window : handles2) {
			if(!Window.equals(OldWindow))
			{
				driver.switchTo().window(Window);
				driver.close();

			}


		}

		driver.quit();
	}

}
