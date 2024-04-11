package com.fusion.selAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		//if some automation flow taking fix time like altert taking 5sec time
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement alt = driver.findElement(By.id("alert"));
		alt.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement textvisible = driver.findElement(By.id("populate-text"));
		textvisible.click();
		
	//pass driver.findElement(By.xpath("//h2[text()='selenium webdriver']")) directly boz that is visible after so domwill have it 
		//later
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
		System.out.println(driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']")).getText());
		
	}

}
