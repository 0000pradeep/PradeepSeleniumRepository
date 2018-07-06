package Pradeep1_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
  WebDriver driver;
	@Test
  public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Latest drivers servers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("test completed and tested");
		driver.close();
		
  }
}
