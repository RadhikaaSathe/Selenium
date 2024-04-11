package com.fusion.selAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Static wait
		Thread.sleep(4000);
		
		//Multiple elements can have same values in big source code
        //Xpath="//tagname[@attribute='value']"
		//<input value="radio1" name="radioButton" class="radioButton" type="radio">
		//"input[@value='radio1']"
		//WebElement radio = driver.findElement(By.xpath("//input[@value='radio1']"));

		//<input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-1f99f73c="">
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		
		////"//*[@placeholder='Password']"
		WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
		password.sendKeys("admin123");
		
		//xpath using text "//tagname[text()='value']"
		//<button type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button" data-v-10d463b7="" data-v-0af708be=""><!----> Login <!----></button>
		//xpath using contains "//tagname[contains(text()='value)]" OR "//tagname[contains(@attribute,'value')]"
		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();
		
		Thread.sleep(3000);
		//for index put xoath in ()[]
        WebElement CI = driver.findElement(By.xpath("(//div[@class='orangehrm-todo-list-item'][2])"));	
        CI.click();
        
        Thread.sleep(3000);
        WebElement child = driver.findElement(By.xpath("(//div[@class='oxd-grid-4 orangehrm-full-width-grid'])[1]/div[2]/div/div[2]"));
		child.click();
        
		driver.navigate().back();
        
		
		//Xpath access-
	}

}
