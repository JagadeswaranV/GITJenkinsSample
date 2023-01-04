package com.stepdefination;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
/**
 * 
 * @author JAGADESWARAN
 * @see HooksClass used to perform before and after scenario 
 * @date 27/12/2022
 *
 */
public class HooksClass extends BaseClass {
	/**
	 * @see Method to perform before scenario
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	static Scenario sc;
	@Before
	public void beforeScenario(Scenario scenario) throws FileNotFoundException, IOException
	{
		   getDriver(getPropertyFileValue("browser"));
		   url(getPropertyFileValue("url"));
		   maximizeWindow();
		   implicitWait(30);
		   sc=scenario;
	}
	/**
	 * @see Method to perform after scenario
	 * @param scenario
	 */
	@After
	public void afterScenario(Scenario scenario)
	{
		scenario.attach(screenShot(), "img/png", "Every scenario");
		quit();
	}
	
	

}
