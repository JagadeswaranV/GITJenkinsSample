package com.stepdefination;



import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/***
 * 
 * @author JAGADESWARAN
 * @see In CommonStep class common methods are scripted
 * @date 27/12/2022
 * 
 */

public class CommonStep extends BaseClass
{
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @see method to verify after login success message
	 * @param expLoginSuccessMessage
	 */
	@Then("User should verify after login Success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginSuccessMessage) {
	    WebElement textLoginMessage = pom.getSearchHotelPage().getTextLoginMessage();
	    String actLoginSuccessMessage = getAttribute(textLoginMessage, "value");
	    Assert.assertEquals("Verify after login success message", expLoginSuccessMessage, actLoginSuccessMessage);
	    HooksClass.sc.log("Verify after login success message: "+"Expected value: "+expLoginSuccessMessage+" Actual value: "+actLoginSuccessMessage);
	}

}
