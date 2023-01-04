package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;
/**
 * @see TC2_SearchHotelStep class has snippets of TC2_SearchHotel.feature
 * @author JAGADESWARAN
 * @date 27/12/2022
 */
public class TC2_SearchHotelStep 
{
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @see Method to enter all fields in search hotel page
	 * @param ddnLocation
	 * @param ddnHotels
	 * @param ddnRoomType
	 * @param ddnRoomNos
	 * @param txtCheckInDate
	 * @param txtCheckOutDate
	 * @param ddnAdultRoom
	 * @param ddnChildRoom
	 */
	@When("User should enter all fields {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldEnterAllFieldsAnd(String ddnLocation, String ddnHotels, String ddnRoomType, String ddnRoomNos, String txtCheckInDate, String txtCheckOutDate, String ddnAdultRoom, String ddnChildRoom) {
	      pom.getSearchHotelPage().searchHotel(ddnLocation, ddnHotels, ddnRoomType, ddnRoomNos, txtCheckInDate, txtCheckOutDate, ddnAdultRoom, ddnChildRoom);
	      
	}
	/**
	 * @see Method to verify after search success message in select hotel page
	 * @param expSelectHotelMessage
	 */
	@Then("User should verify after search success message {string}")
	public void userShouldVerifyAfterSearchSuccessMessage(String expSelectHotelMessage) {
	      WebElement textSelectHotelMessage = pom.getSelectHotelPage().getTextSelectHotelMessage();
	      String actSelectHotelMessage = textSelectHotelMessage.getText();
	      Assert.assertEquals("Verify after search hotel success message", expSelectHotelMessage, actSelectHotelMessage); 
		  HooksClass.sc.log("Verify after search hotel success message: "+"Expected value: "+expSelectHotelMessage+" Actual value: "+actSelectHotelMessage);

	}
	/**
	 * @see Method to enter only mandatory fields in search hotel page
	 * @param ddnLocation
	 * @param ddnRoomNos
	 * @param txtCheckInDate
	 * @param txtCheckOutDate
	 * @param ddnAdultRoom
	 */

	@When("User should enter only mandatory fields {string},{string},{string},{string} and {string}")
	public void userShouldEnterOnlyMandatoryFieldsAnd(String ddnLocation, String ddnRoomNos,String txtCheckInDate,String txtCheckOutDate,String ddnAdultRoom) {
	    pom.getSearchHotelPage().searchHotel(ddnLocation, ddnRoomNos, txtCheckInDate, txtCheckOutDate, ddnAdultRoom);
	}
	/**
	 * @see Method to verify after Search appearance of the date error message in search hotel page
	 * @param expCheckInDateErrorMessage
	 * @param expCheckOutDateErrorMessage
	 */
	@Then("User should verify after Search appearance of the date error message {string},{string}")
	public void userShouldVerifyAfterSearchAppearanceOfTheDateErrorMessage(String expCheckInDateErrorMessage, String expCheckOutDateErrorMessage) {
	   WebElement textErrorCheckInDateMessage = pom.getSearchHotelPage().getTextErrorCheckInDateMessage();
	   String actCheckInDateErrorMessage = textErrorCheckInDateMessage.getText();
	   Assert.assertEquals("Verify after searching by giving invalid check in date,invalid checkin date error message", expCheckInDateErrorMessage, actCheckInDateErrorMessage);
	   HooksClass.sc.log("Verify after searching by giving invalid check in date,invalid checkin date error message: "+"Expected value: "+expCheckInDateErrorMessage+" Actual value: "+actCheckInDateErrorMessage);
	   WebElement textErrorCheckOutDateMessage = pom.getSearchHotelPage().getTextErrorCheckOutDateMessage();
	   String actCheckOutDateErrorMessage = textErrorCheckOutDateMessage.getText();
	   Assert.assertEquals("Verify after searching by giving invalid check out date,invalid checkout date error message", expCheckOutDateErrorMessage, actCheckOutDateErrorMessage);
	   HooksClass.sc.log("Verify after searching by giving invalid check out date,invalid checkout date error message: "+"Expected value: "+expCheckOutDateErrorMessage+" Actual value: "+actCheckOutDateErrorMessage);
	}
	/**
	 * @see Method to Search without entering any of the fields in search hotel page
	 */
	
	@When("User should go for Search without entering any of the fields")
	public void userShouldGoForSearchWithoutEnteringAnyOfTheFields() {
	    pom.getSearchHotelPage().searchHotel();
	}
	/**
	 * @see Method to verify after Search error message in search hotel page
	 * @param expSelectLocationErrorMessage
	 */
	@Then("User should verify after Search error message {string}")
	public void userShouldVerifyAfterSearchErrorMessage(String expSelectLocationErrorMessage) {
	   WebElement textErrorSelectLocactionMessage = pom.getSearchHotelPage().getTextErrorSelectLocactionMessage();
	   String actSelectLocationErrorMessage = textErrorSelectLocactionMessage.getText();
	   Assert.assertEquals("Verify after searching without entering any fields,select location error message", expSelectLocationErrorMessage, actSelectLocationErrorMessage);
	   HooksClass.sc.log("Verify after searching without entering any fields,select location error message: "+"Expected value: "+expSelectLocationErrorMessage+" Actual value: "+actSelectLocationErrorMessage);
	}












	
	



	
	
	
}
