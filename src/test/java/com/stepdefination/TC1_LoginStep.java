package com.stepdefination;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author JAGADESWARAN
 * @see TC1_LoginStep class has snippets of TC1_Login.feature 
 * @date 27/12/2022
 */
public class TC1_LoginStep extends BaseClass
{
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * @see Method to launch browser and open adactin login page
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Given("User is on the Adactin page")
	public void userIsOnTheAdactinPage() throws FileNotFoundException, IOException {
	
	}
	/**
	 * @see Method to enter username,password and click login
	 * @param txtUserName
	 * @param txtPassword
	 */
	@When("User should perform Login {string},{string}")
	public void userShouldPerformLogin(String txtUserName, String txtPassword) {
	   pom.getLoginPage().login(txtUserName, txtPassword);
	}
	
	/**
	 * @see Method to enter username,password and click Enter key
	 * @param txtUserName
	 * @param txtPassword
	 * @throws AWTException
	 */
	
	@When("User should perform Login {string},{string} with Enter Key")
	public void userShouldPerformLoginWithEnterKey(String txtUserName, String txtPassword) throws AWTException {
	   pom.getLoginPage().loginWithEnterKey(txtUserName, txtPassword);
	}
	/**
	 * @see Method to verify after login with Invalid Credential error message
	 * @param expLoginErrorMessage
	 */

	@Then("User should verify after login with Invalid Credential error message contains {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialErrorMessageContains(String expLoginErrorMessage) {
	  WebElement textErrorLoginMessage = pom.getLoginPage().getTextErrorLoginMessage();
	    String actLoginErrorMessage = getText(textErrorLoginMessage);
	    boolean result = actLoginErrorMessage.contains(expLoginErrorMessage);
	    Assert.assertTrue("Verify after login with invalid credentials error message contains", result);
	    HooksClass.sc.log("Verify after login with invalid credentials error message contains: "+"Expected value: "+expLoginErrorMessage+" Actual value: "+actLoginErrorMessage);

	}







}
