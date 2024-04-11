package com.fusion.selAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitPract {

	public static void main(String[] args) throws InterruptedException {

		//selenium speed is faster than browser so we need wait 
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicite wait will work on every element if some element is getting within 2sec thats not prob but if element is 
		//not getting even after 10 sec then there will be execp
		//no need of Thread.sleep after this 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//Locators are nothing but to locate html elemetnt that is webElement 
		//findElement(By.id(""))The first matching element on the current page
		WebElement user = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.className("btn_action"));
		
		
		//TO directly perform action of enting username password and login click
		user.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		login.click();
		
		//for css selector we can take any atribute
		WebElement bag= driver.findElement(By.cssSelector("#item_4_title_link"));
		bag.click();
		
		WebElement hrburger = driver.findElement(By.className("bm-burger-button"));
		hrburger.click();
		
		//there is slight delay when we click hrburger button so for that we have to delay 
		//Thread.sleep(2000);
		WebElement about = driver.findElement(By.linkText("About"));
        about.click();
        
        
        //to navigate back
      // Thread.sleep(2000);
       driver.navigate().back();
       
       WebElement log = driver.findElement(By.partialLinkText("Log"));
       log.click();
        
		
	}

}
