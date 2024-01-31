import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node057wiwqyeji8h1ry3dr5ao86gy78107.node0");
		
		//GET BUTTON POSITION
		WebElement BtnPosition = driver.findElement(By.id("j_idt88:j_idt94"));
		Point XYPosition = BtnPosition.getLocation();
		int xpoint = XYPosition.getX();
		int ypoint = XYPosition.getY();
		System.out.println("X value is : " +xpoint +" Y value is : "+ypoint);
		
		//FIND BUTTON COLOR
		
		WebElement BtnColor = driver.findElement(By.id("j_idt88:j_idt96"));
		String ButtonClr = BtnColor.getCssValue("background");
		System.out.println("Button color is: " +ButtonClr);
		
		//FIND BUTTON HEIGHT AND WIDTH 
		WebElement BtnSize = driver.findElement(By.id("j_idt88:j_idt98"));
		int BtnHeight = BtnSize.getSize().getHeight();
		int BtnWidth =  BtnSize.getSize().getWidth();
		System.out.println("Button height is : "+BtnHeight + " Button width is : "+BtnWidth);
		
		//CHECK IF BUTTON IS DISABLED
		WebElement BtnDisabled = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean Disabled = BtnDisabled.isDisplayed();
		System.out.println("Button Disabled is " +Disabled);
		
		//CLICK BUTTON
		WebElement BtnClick = driver.findElement(By.id("j_idt88:j_idt90"));
		BtnClick.click();
		
		

	}

}
