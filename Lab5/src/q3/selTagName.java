package q3;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class selTagName {
	public String baseUrl = "http://www.facebook.com";
	  String driverPath = "C:\\Users\\hihim\\OneDrive\\Desktop\\w2022labs\\coe891labs\\resources\\geckodriver.exe";
	  public WebDriver driver;
		
	  @Test
	  public void vgetTagName() {
		  System.out.println("launching firefox browser");
		  System.setProperty("webdriver.gecko.driver", driverPath);
		  driver = new FirefoxDriver();
		  driver.get(baseUrl);
		  WebElement element = driver.findElement(By.id("email"));
		  String actualTagName = element.getTagName();
		  System.out.println("The tag name of 'email' is: " + actualTagName);
		  //driver.close();
	  }
}
