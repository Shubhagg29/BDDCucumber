package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@target/failedrerun.txt"},
         glue= {"stepDefination","MyHooks"},
         plugin={"pretty","html:target/cucumber/reports.html",
                  "json:target/cucumber/report.json",
                   "rerun:target/failedrerun.txt"},              
          publish =true )
public class FailedReRun {

}
