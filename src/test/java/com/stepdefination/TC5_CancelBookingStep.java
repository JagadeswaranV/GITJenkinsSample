package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;
/**
 * @see TC5_CancelBookingStep class has snippets of TC5_CancelBooking.feature
 * @author JAGADESWARAN
 * @date 27/12/2022
 *
 */

public class TC5_CancelBookingStep 
{
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @see Method to open Booked Itenary page and cancel generated order id 
	 */
	@Then("User should open Booked Itenary page and cancel generated order id")
	public void userShouldOpenBookedItenaryPageAndCancelGeneratedOrderId() {
		String generatedOrderId = pom.getBookingConfirmPage().getOrderId();
		pom.getCancelBookingPage().cancelOrderId(generatedOrderId);
	    
	}
	/**
	 * @see Methtod to verify cancel order id success message
	 * @param expBookingCancelledSuccessMessage
	 */
	@Then("User should verify cancel order id success message {string}")
	public void userShouldVerifyCancelOrderIdSuccessMessage(String expBookingCancelledSuccessMessage) {
	    WebElement textCancelBookingMessage = pom.getCancelBookingPage().getTextCancelBookingMessage();
	    String actBookingCancelledSuccessMessage = textCancelBookingMessage.getText();
	    Assert.assertEquals("Verify After Clicking Continue cancel order id success message", expBookingCancelledSuccessMessage, actBookingCancelledSuccessMessage);
	    HooksClass.sc.log("Verify After Clicking Continue cancel order id success message: "+"Expected value: "+expBookingCancelledSuccessMessage+" Actual value: "+actBookingCancelledSuccessMessage);
	}
	/**
	 * @see Method to open Booked Itenary page and cancel existing order id
	 * @param existingOrderId
	 */

	@Then("User should open Booked Itenary page and cancel existing order id {string}")
	public void userShouldOpenBookedItenaryPageAndCancelExistingOrderId(String existingOrderId) {
	   pom.getCancelBookingPage().cancelOrderId(existingOrderId);
	}
	
}
