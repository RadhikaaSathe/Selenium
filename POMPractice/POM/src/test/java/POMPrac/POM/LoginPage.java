package POMPrac.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
//	WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
//	////"//*[@placeholder='Password']"
//	WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
//	WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By user = By.xpath("//input[@name='username']");
	By Pass = By.xpath("//*[@placeholder='Password']");
	By loginBtn = By.xpath("//button[text()=' Login ']");

	public void setLogin() {
		driver.findElement(user).sendKeys("Admin");
		driver.findElement(Pass).sendKeys("admin123");
		driver.findElement(loginBtn).click();

	}

}
