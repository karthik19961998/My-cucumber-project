package com.abc.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\karthik\\SELINIUM\\cucumberframework\\src\\test\\java\\com\\abc\\feature\\Login.feature",
		glue = "com.abc.stepdefinition",
		dryRun = false
		)

public class facebookrunner {

}
