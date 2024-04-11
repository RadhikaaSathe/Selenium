package com.fusion.selAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		//before find element switch to inside frame first
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		WebElement frameText = driver.findElement(By.xpath("//h1[@class='post-title entry-title'][1]"));
        String fText = frameText.getText();
        System.out.println(fText);
        
        //how to get out of frame 
        driver.switchTo().defaultContent();
        
	}

}
