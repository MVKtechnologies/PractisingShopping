package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium .WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownSelect {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "/Users/vamshimantha/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.get("https://www.google.com/");

		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement selectDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		
		driver.findElement(By.id("divpaxinfo")).click(); //passengers selection
		
		for (int i=1;i<5;i++ )
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//driver.quit();
		driver.close();
		
		
		
	}
	
	

}
