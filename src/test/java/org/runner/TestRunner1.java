package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="org.test.StepDefination",
dryRun=false,
plugin= {"pretty","html:C:\\Users\\Ajit Kannan\\eclipse-workspace\\org.test.Travelcucumber\\src\\test\\Ak.html"}
)
public class TestRunner1 {

}
