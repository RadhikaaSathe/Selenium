package com.fusion.selAuto;

import java.util.Set;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
			WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//To change control to new window that we open from automation
		//getWindowHandle() gives us unique code of window 
		String mainWindow = driver.getWindowHandle();
		
		System.out.println(mainWindow);
		
		WebElement newWindowBtn = driver.findElement(By.id("openwindow"));
		newWindowBtn.click();
		
	   Set<String> winHandles = driver.getWindowHandles();
	   for(String s: winHandles) {
		   //if we want to compare with multiple window compare with title driver.getTitle()
		   if(!s.equals(mainWindow))
		   driver.switchTo().window(s);
	   }
	   
	   Thread.sleep(2000);
	   WebElement btn = driver.findElement(By.xpath("//a[text()='Access all our Courses']"));
	   btn.click();
	}

}
