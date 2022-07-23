package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/outlinefeature"},
                             glue= {"stepDefination"},
                             plugin={"pretty","html:target/cucumber/reports.html",
		                        "json:target/cucumber/report.json"},              
publish =true )
public class OutlineRunner {

}
