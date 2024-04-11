package com.fusion.selAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		WebElement search1 = driver.findElement(By.xpath("//a[@href='/search']"));
		search1.click();
		
		Thread.sleep(3000);
		WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
		search2.sendKeys("bi");
		
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//button[@class='_37IIF']"));
		
		for( WebElement item : suggestions) {
			
			if(item.getText().equals("Hyderabadi Biryani")) 
			item.click();
			break;
		}
		

	}

}
