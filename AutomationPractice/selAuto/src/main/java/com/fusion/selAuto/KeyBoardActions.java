package com.fusion.selAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		
		Actions act = new Actions(driver);
		
		WebElement FN = driver.findElement(By.id("firstName"));
		
		WebElement LN = driver.findElement(By.id("lastName"));
		
		WebElement email = driver.findElement(By.id("userEmail"));
		
		
		act.click(FN).keyDown(Keys.SHIFT).sendKeys("shiv").keyUp(Keys.SHIFT).sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("sirname").keyUp(Keys.SHIFT).build().perform();
		
		//copy FN and paste to email
		//act.click(FN).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).click(email).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
