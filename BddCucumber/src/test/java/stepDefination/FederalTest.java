package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import MyHooks.TestHooks;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FederalTest  {

	
	WebDriver driver;
	
	@Given("I want to Open Chrome Browser")
	public void i_want_to_open_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}

	@Given("Enter Federal URL")
	public void enter_federal_url() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
	}

	@When("I enter {string}  and {string}")
	public void i_enter_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	}

	@When("Click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		
		driver.findElement(By.id("Inpatient Ward")).click();
		Thread.sleep(2000);
		WebElement	ele= driver.findElement(By.id("loginButton")) ;
		
		ele.click();
	}

	@Then("Federal Finance Welcome page displays")
	public void federal_finance_welcome_apge_displays() {
		System.out.println("Button Clicked");
		WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'logo')]"));		
	boolean flag=	logo.isDisplayed();
	Assert.assertTrue(flag);
	driver.close();

	
	}

}
