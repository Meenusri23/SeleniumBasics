import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		

		WebElement UploadFile = driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
		UploadFile.click();

		//Thread.sleep(3000);
		//Using string selection class to transfer a plain text (here we transfer file location)

		StringSelection FilePath = new StringSelection("C:\\Users\\Drago\\Downloads\\samplefile.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		//WebElement UploadComplete = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/button[3]"));
		//UploadComplete.click();






	}

}
