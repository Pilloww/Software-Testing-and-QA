package q4;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class questionFour {
	public String baseUrl = "https://lambdatest.github.io/sample-todo-app/";
	  String driverPath = "insert gecko.exe driver path here";
	  public WebDriver driver;
	  @Test
	  public void vgetTagName() {
		  System.out.println("launching firefox browser");
		  System.setProperty("webdriver.gecko.driver", driverPath);
		  driver = new FirefoxDriver();
		  driver.get(baseUrl);
		  WebElement element = driver.findElement(By.name("li2"));
		  element.click();
		  WebElement element1 = driver.findElement(By.name("li4"));
		  element1.click();
		  WebElement element2 = driver.findElement(By.id("sampletodotext"));
		  element2.sendKeys("Darien Lee");
		  WebElement element3 = driver.findElement(By.id("addbutton"));
		  element3.click();
		  driver.close();
	  }
}
