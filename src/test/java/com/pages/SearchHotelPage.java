package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 *@author JAGADESWARAN
 * @see SearchHotelPage class has the locators for TC2_SearchHotelStep class 
 * @date 27/12/2022
 *
 */
public class SearchHotelPage extends BaseClass{
	/**
	 * @see In Constructor intialized webdriver reference
	 */
	public SearchHotelPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement ddnLocation;
	@FindBy(id="hotels")
	private WebElement ddnHotels;
	@FindBy(id="room_type")
	private WebElement ddnRoomType;
	@FindBy(id="room_nos")
	private WebElement ddnRoomNos;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement txtCheckInDate;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement ddnAdultRoom;
	@FindBy(id="child_room")
	private WebElement ddnChildRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	@FindBy(id="username_show")
	private WebElement textLoginMessage;
	@FindBy(id="checkin_span")
	private WebElement textErrorCheckInDateMessage;
	@FindBy(id="checkout_span")
	private WebElement textErrorCheckOutDateMessage;
	@FindBy(id="location_span")
	private WebElement textErrorSelectLocactionMessage;
	
	
	
	public WebElement getDdnLocation() {
		return ddnLocation;
	}
	public WebElement getDdnHotels() {
		return ddnHotels;
	}
	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}
	public WebElement getDdnRoomNos() {
		return ddnRoomNos;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getDdnAdultRoom() {
		return ddnAdultRoom;
	}
	public WebElement getDdnChildRoom() {
		return ddnChildRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public WebElement getTextLoginMessage() {
		return textLoginMessage;
	}
	public WebElement getTextErrorCheckInDateMessage() {
		return textErrorCheckInDateMessage;
	}
	public WebElement getTextErrorCheckOutDateMessage() {
		return textErrorCheckOutDateMessage;
	}
	public WebElement getTextErrorSelectLocactionMessage() {
		return textErrorSelectLocactionMessage;
	}
	/**
	 * @see Method to perform common steps in search hotel page
	 * @param ddnLocation
	 * @param ddnRoomNos
	 * @param txtCheckInDate
	 * @param txtCheckOutDate
	 * @param ddnAdultRoom
	 */
	public void searchHotelCommonSteps(String ddnLocation, String ddnRoomNos,String txtCheckInDate,String txtCheckOutDate,String ddnAdultRoom) {
		selectByVisibleText(getDdnLocation(),ddnLocation );
		selectByVisibleText(getDdnRoomNos(),ddnRoomNos);
		clear(getTxtCheckInDate());
		sendKeys(getTxtCheckInDate(), txtCheckInDate);
		clear(getTxtCheckOutDate());
		sendKeys(getTxtCheckOutDate(), txtCheckOutDate);
		selectByVisibleText(getDdnAdultRoom(),ddnAdultRoom );
		
	}
	/**
	 * @see Method to click submit in search hotel page
	 */
	public void searchButton() {
		click(getBtnSubmit());
	}
	/**
	 * @see Method to enter all fields in search hotel page
	 * @param ddLocation
	 * @param ddnHotels
	 * @param ddnRoomType
	 * @param ddnRoomNos
	 * @param txtCheckInDate
	 * @param txtCheckOutDate
	 * @param ddnAdultRoom
	 * @param ddnChildRoom
	 */
	public void searchHotel(String ddLocation,String ddnHotels, String ddnRoomType, String ddnRoomNos,String txtCheckInDate,String txtCheckOutDate,String ddnAdultRoom,String ddnChildRoom) 
	{
		searchHotelCommonSteps(ddLocation, ddnRoomNos, txtCheckInDate, txtCheckOutDate, ddnAdultRoom);
		selectByVisibleText(getDdnHotels(),ddnHotels );
		selectByVisibleText(getDdnRoomType(),ddnRoomType );
		selectByVisibleText(getDdnChildRoom(),ddnChildRoom );
		searchButton();
	}
	/**
	 * @see Method to enter mandatory fields in search hotel page
	 * @param ddnLocation
	 * @param ddnRoomNos
	 * @param txtCheckInDate
	 * @param txtCheckOutDate
	 * @param ddnAdultRoom
	 */
	public void searchHotel(String ddnLocation, String ddnRoomNos,String txtCheckInDate,String txtCheckOutDate,String ddnAdultRoom) {
		searchHotelCommonSteps(ddnLocation, ddnRoomNos, txtCheckInDate, txtCheckOutDate, ddnAdultRoom);
		searchButton();
	}
	/**
	 * @see Method to submit without entering any fields in search hotel page
	 */
	public void searchHotel() {
		 searchButton();
	}
	
	
}
