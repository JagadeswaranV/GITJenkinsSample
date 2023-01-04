package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author JAGADESWARAN
 * @see TestRunnerClass executes all the snippets of feature file by glueing the com.stepdefination package and generates a JVMreport
 * @date 27/12/2022
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = (""), snippets = SnippetType.CAMELCASE, dryRun = false, publish = true, stepNotifications = true, plugin = {
		"pretty",
		"json:target\\output.json" }, features = "src\\test\\resources\\Features", glue = "com.stepdefination")
public class TestRunnerClass extends BaseClass{
	/**
	 * @see Method to create jvm report after class
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		
		Reporting.generateJVMReport(getProjectPath()+getPropertyFileValue("jsonPath"));
		
	}
}
