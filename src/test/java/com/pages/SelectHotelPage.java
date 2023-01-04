package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 *@author JAGADESWARAN
 * @see SelectHotelPage class has the locators for TC3_SelectHotelStep class 
 * @date 27/12/2022
 *
 */
public class SelectHotelPage extends BaseClass{
	/**
	 * @see In Constructor intialized webdriver reference
	 */
	public SelectHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rdoHotel;
	@FindBy(id="continue")
	private WebElement btnContinue;
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement textSelectHotelMessage;
	@FindBy(id="radiobutton_span")
	private WebElement textErrorSelectHotelMessage;
	
	public WebElement getRdoHotel() {
		return rdoHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getTextSelectHotelMessage() {
		return textSelectHotelMessage;
	}
	public WebElement getTextErrorSelectHotelMessage() {
		return textErrorSelectHotelMessage;
	}
	/**
	 * @see Method to select a hotel and click continue
	 */
	public void selectHotel()
	{
		click(getRdoHotel());
		click(getBtnContinue());
	}
	/**
	 * @see Method to not select a hotel and click continue
	 */
	public void clickContinue() {
		click(getBtnContinue());
	}

}
