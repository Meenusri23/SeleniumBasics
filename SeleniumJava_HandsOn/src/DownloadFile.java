import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/FileDownload.html");

		WebElement Download = driver.findElement(By.linkText("Download"));
		Download.click();

		Thread.sleep(3000);



		File fileLoc = new File("C:\\Users\\Drago\\Downloads");
		File[] File_List = fileLoc.listFiles();
		for (File file : File_List) {
			if(file.getName().equals("samplefile.pdf"))
			{
				System.out.println("File is downloaded");
				break;
			}
			

		}

	}

}
