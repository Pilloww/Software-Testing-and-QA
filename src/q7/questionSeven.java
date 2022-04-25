package q7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class questionSeven {
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
		  driver.get("https://gmail.com/");
	  }
	  @Test(priority=3)
	  public void enterUserId() throws InterruptedException {
		  WebElement enterID = driver.findElement(By.name("identifier"));
		  enterID.sendKeys("seleniumtestingryerson@gmail.com");
		  WebElement clickButton = driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
		  clickButton.click();
		  Thread.sleep(5000);
	  }
	  @Test(priority=4)
	  public void enterPassword() throws InterruptedException {
		  WebElement passwordBar = driver.findElement(By.name("password"));
		  passwordBar.sendKeys("S3l3nium!");
		  WebElement clickButton = driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
		  clickButton.click();
		  Thread.sleep(6000);
	  }
	  @Test(priority=5)
	  public void GmailURLVerification() {
		  String actualURL = driver.getCurrentUrl();
		  System.out.println("URL retrieved: "+ actualURL);
		  String expectedURL = "https://mail.google.com/mail/u/0/#inbox";
		  Assert.assertTrue(actualURL.contains(expectedURL));
	  }
	  @Test(priority=6)
	  public void driverexit() {
		  driver.close();
	  }
}
