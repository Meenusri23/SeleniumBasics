import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/frame.xhtml");

		//Switch to frames
		driver.switchTo().frame(0);
		WebElement FrameBtn1 = driver.findElement(By.id("Click"));
		FrameBtn1.click();
		String TextClicked = driver.findElement(By.id("Click")).getText();
		System.out.println(TextClicked);
		
		driver.switchTo().defaultContent();
		
		
		//Nested Frames
		/*driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement FrameBtn2 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		FrameBtn2.click();
		
		driver.switchTo().defaultContent();	*/	

		//Count No.of.Frames
		List<WebElement> FrameCount = driver.findElements(By.tagName("iframe"));
		int Count = FrameCount.size();
		System.out.println("No of frames in this Page is : " +Count);


	}

}
