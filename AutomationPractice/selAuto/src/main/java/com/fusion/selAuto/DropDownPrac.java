package com.fusion.selAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPrac {

	public static void main(String[] args) {
		
		
//		<select id="dropdown-class-example" name="dropdown-class-example">
//        <option value="">Select</option>
//        <option value="option1">Option1</option>
//       <option value="option2">Option2</option>
//       <option value="option3">Option3</option>
//   </select>
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		//dropdown.click();
		
		
		Select sel = new Select(dropdown);
		
		//sel.selectByIndex(1);
		sel.selectByValue("option2");
       //sel.selectByVisibleText("option3");
		
		
		
		
		

	}

}
