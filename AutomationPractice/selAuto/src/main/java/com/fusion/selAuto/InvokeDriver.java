package com.fusion.selAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to manage browser automatically rather than adding exec in jar
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

	}

}
