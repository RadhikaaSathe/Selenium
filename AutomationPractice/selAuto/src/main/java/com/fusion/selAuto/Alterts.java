package com.fusion.selAuto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alterts {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//We can't inspect Alterts
		//<input id="alertbtn" class="btn-style" value="Alert" onclick="displayAlert()" type="submit">
		
		WebElement altertbtn = driver.findElement(By.id("alertbtn"));
		altertbtn.click();
		Thread.sleep(20000);
		
		//How to handel alerts
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		WebElement confirmbtn = driver.findElement(By.id("confirmbtn"));
		confirmbtn.click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		String alttext=alt.getText();
		System.out.println(alttext);
		
		alt.dismiss();

	}

}
