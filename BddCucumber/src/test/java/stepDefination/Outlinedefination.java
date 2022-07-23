package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Outlinedefination {

	WebDriver driver;

	@Given("Launch the Chrome Browser")
	public void launch_the_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("Enter OpenCrm Bse URL")
	public void enter_open_crm_bse_url() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
	}

	@When("enter {string}  and {string}")
	public void enter_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("Click on enter login button")
	public void click_on_enter_login_button() throws InterruptedException {
		driver.findElement(By.id("Laboratory")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("loginButton"));

		ele.click();

	}

	@Then("Open Crm home page displays")
	public void open_crm_home_page_displays() {
		// Write code here that turns the phrase above into concrete actions
	//	System.out.println("Button Clicked");
		WebElement Title = driver.findElement(By.xpath("//h4[contains(text(),'Logged in as Super User (admin) at Laboratory.')]"));
		boolean flag=Title.isDisplayed();
		Assert.assertTrue(flag);
		driver.close();
	}

}
