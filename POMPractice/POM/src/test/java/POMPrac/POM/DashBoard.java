package POMPrac.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashBoard {
	WebDriver driver;
	
	public DashBoard(WebDriver driver) {
		this.driver = driver;
		//whenever we do it with FindBy we have to add this line
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Time at Work']")
	static
	WebElement time;
	
	@FindBy(xpath="//p[text()='My Actions']")
	static
	WebElement myAction;
	
	public   void setDashBoard() {
		String s1= time.getText();
		String s2 = myAction.getText();
		
		Assert.assertEquals(s1,"Time at Work");
		System.out.println("Time at work present");
		Assert.assertEquals(s2,"My Actions");
		System.out.println("My action presnt");
		
	}
}
