package com.fusion.selAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) {

		// TO perform acttion of mouse and keyboard we have action class
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		// use action class pass driver
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

		// build() build multiple actions and perform
		act.moveToElement(link).build().perform();
		//to right click context click
		act.moveToElement(link).contextClick().build().perform();
		

	}

}
