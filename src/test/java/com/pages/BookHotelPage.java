package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.java.sl.In;
/**
 * 
 *@author JAGADESWARAN
 * @see BookHotelPage class has the locators for TC4_BookHotelStep class 
 * @date 27/12/2022
 *
 */
public class BookHotelPage extends BaseClass {
	/**
	 * @see In Constructor intialized webdriver reference
	 */
	public BookHotelPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCardNum;
	@FindBy(id="cc_type")
	private WebElement ddnCardType;
	@FindBy(id="cc_exp_month")
	private WebElement ddnExpiryMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ddnExpiryYear;
	@FindBy(id="cc_cvv")
	private WebElement txtCvvNumber;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	@FindBy(xpath="(//td[@class='login_title'])[2]")
	private WebElement textBookHotelMessage;
	@FindBy(id="first_name_span")
	private WebElement textErrorFirstNameMessage;
	@FindBy(id="last_name_span")
	private WebElement textErrorLastNameMessage;
	@FindBy(id="address_span")
	private WebElement textErrorAddressMessage;
	@FindBy(id="cc_num_span")
	private WebElement textErrorCardNumberMessage;
	@FindBy(id="cc_type_span")
	private WebElement textErrorCardTypeMessage;
	@FindBy(id="cc_expiry_span")
	private WebElement textErrorExpiryMonthMessage;
	@FindBy(id="cc_cvv_span")
	private WebElement textErrorCVVNumberMessage;
	
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCardNum() {
		return txtCardNum;
	}
	public WebElement getDdnCardType() {
		return ddnCardType;
	}
	public WebElement getDdnExpiryMonth() {
		return ddnExpiryMonth;
	}
	public WebElement getDdnExpiryYear() {
		return ddnExpiryYear;
	}
	public WebElement getTxtCvvNumber() {
		return txtCvvNumber;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getTextBookHotelMessage() {
		return textBookHotelMessage;
	}
	public WebElement getTextErrorFirstNameMessage() {
		return textErrorFirstNameMessage;
	}
	public WebElement getTextErrorLastNameMessage() {
		return textErrorLastNameMessage;
	}
	public WebElement getTextErrorAddressMessage() {
		return textErrorAddressMessage;
	}
	public WebElement getTextErrorCardNumberMessage() {
		return textErrorCardNumberMessage;
	}
	public WebElement getTextErrorCardTypeMessage() {
		return textErrorCardTypeMessage;
	}
	public WebElement getTextErrorExpiryMonthMessage() {
		return textErrorExpiryMonthMessage;
	}
	public WebElement getTextErrorCVVNumberMessage() {
		return textErrorCVVNumberMessage;
	}
	/**
	 * @see Method to enter all fields and book in Book a hotel page
	 * @param txtFirstName
	 * @param txtLastName
	 * @param txtAddress
	 * @param txtCcNum
	 * @param ddCcType
	 * @param ddCcMonth
	 * @param ddCcYear
	 * @param txtCcCvv
	 */
	public void bookHotel(String txtFirstName,String txtLastName,String txtAddress,String txtCcNum,String ddCcType,String ddCcMonth,String ddCcYear,String txtCcCvv) 
	{
		sendKeys(getTxtFirstName(), txtFirstName);
		sendKeys(getTxtLastName(),txtLastName );
		sendKeys(getTxtAddress(), txtAddress);
		sendKeys(getTxtCardNum(), txtCcNum);
		selectByVisibleText(getDdnCardType(),ddCcType );
		selectByVisibleText(getDdnExpiryMonth(),ddCcMonth );
		selectByVisibleText(getDdnExpiryYear(),ddCcYear );
		sendKeys(getTxtCvvNumber(),txtCcCvv );
		click(getBtnBookNow());	
	}
	/**
	 * @see Method to not enter any fields and book in book a hotel page
	 */
	public void bookHotel() {
		click(getBtnBookNow());	
	}
	

}
