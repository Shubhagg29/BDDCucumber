package MyHooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {

	//public static WebDriver driver;
	@Before()
	public void setUp(){
		System.out.println("<<<------cucumber Learning------->.>>>");
	}
	   @After()
		public void tearDown() {
		   System.out.println("<<<------Closing  browser------->.>>>");	
		//driver.close();
		   System.out.println("<<<------ Browser Closed------->.>>>");	
		
	}
}
