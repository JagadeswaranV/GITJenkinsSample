package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.java.sl.In;
/**
 * 
 *@author JAGADESWARAN
 * @see CancelBookingPage class has the locators for TC5_CancelBookingStep class 
 * @date 27/12/2022
 *
 */
public class CancelBookingPage extends BaseClass {
	/**
	 * @see In Constructor intialized webdriver reference
	 */
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnBookedItenaray;
	@FindBy(id="order_id_text")
	private WebElement txtOrderId;
	@FindBy(id="search_hotel_id")
	private WebElement btnGo;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement btnCancelOrderId;
	@FindBy(id="search_result_error")
	private WebElement textCancelBookingMessage;
	
	
	public WebElement getBtnBookedItenaray() {
		return btnBookedItenaray;
	}
	public WebElement getTxtOrderId() {
		return txtOrderId;
	}
	public WebElement getBtnGo() {
		return btnGo;
	}
	public WebElement getBtnCancelOrderId() {
		return btnCancelOrderId;
	}
	public WebElement getTextCancelBookingMessage() {
		return textCancelBookingMessage;
	}
	/**
	 * @see Method to cancel order id
	 * @param orderId
	 */
	public void cancelOrderId(String orderId) {
		click(getBtnBookedItenaray());
		sendKeys(getTxtOrderId(), orderId);
		click(getBtnGo());
		click(getBtnCancelOrderId());
		accept();
	}
	
	
}
