package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;


import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;
/**
 * @see TC3_SelectHotelStep class has snippets of TC3_SelectHotel.feature
 * @author JAGADESWARAN
 * @date 27/12/2022
 *
 */
public class TC3_SelectHotelStep extends BaseClass
{
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @see Method to select a specific hotel and click continue in select hotel page
	 */
	@Then("User should select a specific hotel and click continue")
	public void userShouldSelectASpecificHotelAndClickContinue() {
	    pom.getSelectHotelPage().selectHotel();
	}
	/**
	 * @see Method to verify after clicking continue success message in book a hotel page
	 * @param expBookAHotelMessage
	 */
	@Then("User should verify after clicking continue success message {string}")
	public void userShouldVerifyAfterClickingContinueSuccessMessage(String expBookAHotelMessage) {
	    WebElement textBookHotelMessage = pom.getBookHotelPage().getTextBookHotelMessage();
	   String actBookAHotelMessage = textBookHotelMessage.getText();
	   Assert.assertEquals("Verify After Clicking Continue SuccessMessage", expBookAHotelMessage, actBookAHotelMessage);
	   HooksClass.sc.log("Verify After Clicking Continue SuccessMessage: "+"Expected value: "+expBookAHotelMessage+" Actual value: "+actBookAHotelMessage);
	}
	/**
	 * @see Method to not select a specific hotel and click continue in select hotel page
	 */

	
	@Then("User should not select a specific hotel and click continue")
	public void userShouldNotSelectASpecificHotelAndClickContinue() {
	    pom.getSelectHotelPage().clickContinue();
	}
	/**
	 * @see Method to verify after continue without selecting hotel appearance of the error message in select hotel page
	 * @param expSelectAHotelErrorMessage
	 */
	@Then("User should verify after continue appearance of the error message {string}")
	public void userShouldVerifyAfterContinueAppearanceOfTheErrorMessage(String expSelectAHotelErrorMessage) {
	     WebElement textErrorSelectHotelMessage = pom.getSelectHotelPage().getTextErrorSelectHotelMessage();
	    String actSelectAHotelErrorMessage = textErrorSelectHotelMessage.getText();
	    Assert.assertEquals("Verify After Clicking Continue without selecting a hotel,Select a hotel error message", expSelectAHotelErrorMessage, actSelectAHotelErrorMessage);
	    HooksClass.sc.log("Verify After Clicking Continue without selecting a hotel,Select a hotel error message: "+"Expected value: "+expSelectAHotelErrorMessage+" Actual value: "+actSelectAHotelErrorMessage);
	}






	




}
