package com.stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/**
 * @see  TC4_BookHotelStep class has snippets of TC4_BookHotel.feature
 * @author JAGADESWARAN
 * @date 27/12/2022
 */
public class TC4_BookHotelStep {
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @see Method to enter all fields in book a hotel page
	 * @param txtFirstName
	 * @param txtLastName
	 * @param txtAddress
	 * @param dataTable
	 */

	@When("User should enter all fields {string},{string} and {string}")
	public void userShouldEnterAllFieldsAnd(String txtFirstName, String txtLastName, String txtAddress,
			io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> cardDetails = dataTable.asMaps();
		Map<String, String> map = cardDetails.get(2);
		String cardNo = map.get("cardNo");
		String cardType = map.get("cardType");
		String month = map.get("month");
		String year = map.get("year");
		String CVVNo = map.get("CVVNo");
		pom.getBookHotelPage().bookHotel(txtFirstName, txtLastName, txtAddress, cardNo, cardType, month, year, CVVNo);
	}
	/**
	 * @see Method to verify after booking hotel success message in booking confirmation page
	 * @param expBookingConfirmationMessage
	 */

	@Then("User should verify after booking hotel success message {string} and save the generated order Id")
	public void userShouldVerifyAfterBookingHotelSuccessMessageAndSaveTheGeneratedOrderId(
			String expBookingConfirmationMessage) {
	    WebElement textBookHotelMessage = pom.getBookingConfirmPage().getTextBookHotelMessage();
		String actBookingConfirmationMessage = textBookHotelMessage.getText();
		Assert.assertEquals("Verify after clicking booknow success message",expBookingConfirmationMessage , actBookingConfirmationMessage);
	    HooksClass.sc.log("Verify after clicking booknow success message: "+"Expected value: "+expBookingConfirmationMessage+" Actual value: "+actBookingConfirmationMessage);
	}
	/**
	 * @see Method to Book hotel without entering any fields in book hotel page
	 */

	@When("User should Book hotel without entering any fields")
	public void userShouldBookHotelWithoutEnteringAnyFields() {
		pom.getBookHotelPage().bookHotel();

	}
	/**
	 * @see Method to verify error message after book hotel without entering any fields in book a hotel page
	 * @param expFirstNameErrorMessage
	 * @param expLastNameErrorMessage
	 * @param expAddressErrorMessage
	 * @param expCardNumberErrorMessage
	 * @param expCardTypeErrorMessage
	 * @param expExpiryMonthErrorMessage
	 * @param expCVVNumberErrorMessage
	 */

	@Then("User should verify error message after book hotel {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMessageAfterBookHotelAnd(String expFirstNameErrorMessage,
			String expLastNameErrorMessage, String expAddressErrorMessage, String expCardNumberErrorMessage,
			String expCardTypeErrorMessage, String expExpiryMonthErrorMessage, String expCVVNumberErrorMessage) {
		WebElement textErrorFirstNameMessage = pom.getBookHotelPage().getTextErrorFirstNameMessage();
		String actFirstNameErrorMessage = textErrorFirstNameMessage.getText();
		Assert.assertEquals("Verify after clicking booknow without entering First name error message", expFirstNameErrorMessage,
				actFirstNameErrorMessage);
	    HooksClass.sc.log("Verify after clicking booknow without entering First name error message: "+"Expected value: "+expFirstNameErrorMessage+" Actual value: "+actFirstNameErrorMessage);
		WebElement textErrorLastNameMessage = pom.getBookHotelPage().getTextErrorLastNameMessage();
		String actLastNameErrorMessage = textErrorLastNameMessage.getText();
		Assert.assertEquals("Verify After Clicking booknow without entering Last name error message", expLastNameErrorMessage,
				actLastNameErrorMessage);
	    HooksClass.sc.log("Verify After Clicking booknow without entering Last name error message: "+"Expected value: "+expLastNameErrorMessage+" Actual value: "+actLastNameErrorMessage);
		WebElement textErrorAddressMessage = pom.getBookHotelPage().getTextErrorAddressMessage();
		String actAddressErrorMessage = textErrorAddressMessage.getText();
		Assert.assertEquals("Verify After Clicking booknow without entering Address error message", expAddressErrorMessage,
				actAddressErrorMessage);
	    HooksClass.sc.log("Verify After Clicking booknow without entering Address error message: "+"Expected value: "+expAddressErrorMessage+" Actual value: "+actAddressErrorMessage);
		WebElement textErrorCardNumberMessage = pom.getBookHotelPage().getTextErrorCardNumberMessage();
		String actCardNumberErrorMessage = textErrorCardNumberMessage.getText();
		Assert.assertEquals("Verify After Clicking booknow without entering Card number error message", expCardNumberErrorMessage,
				actCardNumberErrorMessage);
	    HooksClass.sc.log("Verify After Clicking booknow without entering Card number error message: "+"Expected value: "+expCardNumberErrorMessage+" Actual value: "+actCardNumberErrorMessage);
		WebElement textErrorCardTypeMessage = pom.getBookHotelPage().getTextErrorCardTypeMessage();
		String actCardTypeErrorMessage = textErrorCardTypeMessage.getText();
		Assert.assertEquals("Verify After Clicking booknow without entering Card Type error message", expCardTypeErrorMessage,
				actCardTypeErrorMessage);
	    HooksClass.sc.log("Verify After Clicking booknow without entering Card Type error message: "+"Expected value: "+expCardTypeErrorMessage+" Actual value: "+actCardTypeErrorMessage);
		WebElement textErrorExpiryMonthMessage = pom.getBookHotelPage().getTextErrorExpiryMonthMessage();
		String actExpiryMonthErrorMessage = textErrorExpiryMonthMessage.getText();
		Assert.assertEquals("Verify After Clicking booknow without entering expiry month error message", expExpiryMonthErrorMessage,
				actExpiryMonthErrorMessage);
	    HooksClass.sc.log("Verify After Clicking booknow without entering expiry month error message: "+"Expected value: "+expExpiryMonthErrorMessage+" Actual value: "+actExpiryMonthErrorMessage);
		WebElement textErrorCVVNumberMessage = pom.getBookHotelPage().getTextErrorCVVNumberMessage();
		String actCVVNumberErrorMessage = textErrorCVVNumberMessage.getText();
		Assert.assertEquals("Verify After Clicking booknow without entering CVV error message", expCVVNumberErrorMessage,
				actCVVNumberErrorMessage);
	    HooksClass.sc.log("Verify After Clicking booknow without entering CVV error message: "+"Expected value: "+expCVVNumberErrorMessage+" Actual value: "+actCVVNumberErrorMessage);

	}

}
