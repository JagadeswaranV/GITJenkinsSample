package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author JAGADESWARAN
 * @see LoginPage class has the locators for TC1_LoginStep class 
 * @date 27/12/2022
 *
 */
public class LoginPage extends BaseClass{
	/**
	 * @see In Constructor intialized webdriver reference
	 */
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtPassword;
	@FindBy(id="login")
	private WebElement btnLogin;
	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement textErrorLoginMessage;
	
	public WebElement getTxtUserName() {
	return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getTextErrorLoginMessage() {
		return textErrorLoginMessage;
	}
	/**
	 * @see Method to perform common steps in login
	 * @param userName
	 * @param password
	 */
	public void loginCommonSteps(String userName,String password) {
		sendKeys(getTxtUserName(),userName);
		sendKeys(getTxtPassword(),password);
	}
	/**
	 * @see Method to perform login
	 * @param userName
	 * @param password
	 */
	public void login(String userName,String password) 
	{
		loginCommonSteps(userName, password);
		click(getBtnLogin());
	}
	/**
	 * @see Method to perform login using enter key
	 * @param userName
	 * @param password
	 * @throws AWTException
	 */
	public void loginWithEnterKey(String userName,String password) throws AWTException {
		loginCommonSteps(userName, password);
		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	

}
