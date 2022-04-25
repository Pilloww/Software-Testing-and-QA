package q2;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class selTitle {
  public String baseUrl = "http://demo.guru99.com/test/newtours/";
  String driverPath = "C:\\Users\\hihim\\OneDrive\\Desktop\\w2022labs\\coe891labs\\resources\\geckodriver.exe";
  public WebDriver driver;
	
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("launching firefox browser");
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.close();
  }
}
