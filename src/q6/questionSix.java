package q6;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class questionSix {
  String driverPath = "C:\\Users\\hihim\\OneDrive\\Desktop\\w2022labs\\coe891labs\\resources\\geckodriver.exe";
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
