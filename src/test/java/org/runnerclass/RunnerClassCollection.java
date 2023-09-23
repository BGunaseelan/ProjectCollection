package org.runnerclass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium\\Git Clone\\ProjectCollection\\FeatureFiles\\example1.feature", 
				glue = "org.stepdefinitions", dryRun = false)
public class RunnerClassCollection {

}
