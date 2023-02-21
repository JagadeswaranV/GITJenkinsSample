package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 *@author JAGADESWARAN
 * @see Used to maintain booking confirm page wed elements 
 * @date 27/12/2022
 *
 *
 */
public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement getOrderNo;
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement textBookHotelMessage;

	public WebElement getGetOrderNo() {
		return getOrderNo;
	}
	
	public WebElement getTextBookHotelMessage() {
		return textBookHotelMessage;
	}
/**
 * @see Method to get the order id of booked hotel
 * @return String
 */

	public String getOrderId()
	{
		String orderId = getAttribute(getGetOrderNo(),"value");
		return orderId;
	}

}
