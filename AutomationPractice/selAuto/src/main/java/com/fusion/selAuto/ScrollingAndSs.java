package com.fusion.selAuto;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class ScrollingAndSs {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.amazon.in/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//for scrolling we will use javaScript executer class
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,300)");
		
		//WebElement mobile = driver.findElement(By.xpath("//span[text()='Up to 70% off | Top home products']"));
		
         //scrolling by particular location
		
		
		WebElement mobile = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView()", mobile);
		
		SS();
		
	driver.quit();
		
	}
	public static void SS() throws IOException {	
		//ScreenShot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter timestamp = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
		String formatedDatetime =dateTime.format(timestamp);
		System.out.println(formatedDatetime);
		
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		
		String path= "screenshot/img"+formatedDatetime+".png";
		FileUtils.copyFile(screenshot,new File(path));
		
	}

}
