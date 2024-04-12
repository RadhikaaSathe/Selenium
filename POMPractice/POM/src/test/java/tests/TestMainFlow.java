package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPrac.POM.DashBoard;
import POMPrac.POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMainFlow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		LoginPage loginPage = new LoginPage(driver);
		DashBoard dashboard = new DashBoard(driver);
		loginPage.setLogin();
		dashboard.setDashBoard();
		driver.quit();
	}

}
