package q6;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class questionSix {
  String driverPath = "insert gecko.exe driver path here";
  @Test
  public void executeSessionOne() {
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys("Driver 1");
  }
  @Test
  public void executeSessionTwo() {
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys("Driver 2");
  }
  @Test
  public void executeSessionThree() {
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys("Driver 3");
  }
}
