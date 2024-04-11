package com.fusion.selAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions act = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement drop = driver.findElement(By.id("trash"));
		
		//act.dragAndDrop(drag, drop).build().perform();
		//act.clickAndHold(drag).release(drop).build().perform();
		act.clickAndHold(drag).moveToElement(drop).build().perform();		

	}

}
