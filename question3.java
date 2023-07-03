import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  Question3{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","src//main//resources//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS) ;
		//Thread.sleep(4000);
		System.out.println("passed!!!!");
		if(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/a/picture/img")).isDisplayed()) {
			System.out.println("Logo is present");
		}
		
		
	}

}
