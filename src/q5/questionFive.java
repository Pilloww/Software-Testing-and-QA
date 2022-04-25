package q5;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class questionFive {
  String driverPath = "C:\\Users\\hihim\\OneDrive\\Desktop\\w2022labs\\coe891labs\\resources\\geckodriver.exe";
  public WebDriver driver;
  @Test(priority=1)
  public void openBrowser() {
	  System.out.println("launching firefox browser");
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
  }
  @Test(priority=2)
  public void launchGoogle() {
	  driver.get("https://www.google.ca/");
  }
  @Test(priority=3)
  public void performSearchAndClick1stLink() throws InterruptedException {
	  WebElement searchBar = driver.findElement(By.name("q"));
	  searchBar.sendKeys("Facebook");
	  searchBar.submit();
	  Thread.sleep(5000);
  }
  @Test(priority=4)
  public void FaceBookPageTitleVerification() {
	  String actualTitle = driver.getTitle();
	  System.out.println("Title retrieved: "+ actualTitle);
	  String expectedTitle = "Facebook - Google Search";
	  Assert.assertTrue(actualTitle.contains(expectedTitle));
  }
  @Test(priority=5)
  public void driverexit() {
	  driver.close();
  }
}
