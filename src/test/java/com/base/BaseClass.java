package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 *@author JAGADESWARAN
 * @see BaseClass has all the reusable methods 
 * @date 27/12/2022
 *
 */
public class BaseClass {
	/**
	 * @see Method to perform screenShot
	 * @return byte[]
	 */
	public byte[] screenShot() {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
	}
	/**
	 * @see Method to perform getProjectPath 
	 * @return String
	 */
	public static String getProjectPath()
	{
		String path = System.getProperty("user.dir");
		return path;
	}
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath()+"\\Config\\Config.properties"));
		return (String)properties.getProperty(key);
	}
	/**
	 * @see Method to check element visibility
	 * @param element
	 */
	public void elementVisibility(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	//WebDriver:I
		public static WebDriver driver;
		/**
		 * @see Method to enter Url
		 * @param url
		 */
		public static void url(String url) 
		{
			driver.get(url);
		}
		/**
		 * @see Method to get title
		 * @return String
		 */
		public String getTitle() 
		{
			String title = driver.getTitle();
			return title;
		}
		/**
		 * @see Method to get Current Url
		 * @return String
		 */
		public String getCurentUrl()
		{
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		/**
		 * @see Method to close current window
		 */
		public void close() 
		{
		   driver.close();	
		}
		/**
		 * @see Method to close all window
		 */
		public static void quit() 
		{
			driver.quit();
		}
		/**
		 * @see Method to manage the driver
		 * @return Options
		 */
		public static Options manage() 	
		{
			Options manage = driver.manage();
			return manage;
		}
		/**
		 * @see Method to target the locator
		 * @return TargetLocator
		 */
		public TargetLocator switchTo() 
		{
			TargetLocator switchTo = driver.switchTo();
			return switchTo;
		}
		/**
		 * @see Method to get parenet window id
		 * @return String
		 */
		public String getWindowHandle() 
		{
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}
		/**
		 * Method to get all window id
		 * @return Set<String>
		 */
		public Set<String> getWindowHandles() 
		{
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}
		/**
		 * @see Method to navigate the driver
		 * @return
		 */
		public Navigation navigate() 
		{
			Navigation navigate = driver.navigate();
			return navigate;
		}
		
		//WebElement:I
		/**
		 * @see Method to insert values to webelement
		 * @param element
		 * @param value
		 */
		public void sendKeys(WebElement element,String value) 
		{
			elementVisibility(element);
			element.sendKeys(value);
		}
		/**
		 * @see Method to click webelement
		 * @param element
		 */
		public void click(WebElement element) 
		{
			elementVisibility(element);
			element.click();
		}
		/**
		 * @see Method to get text
		 * @param element
		 * @return
		 */
		public String getText(WebElement element)
		{
			elementVisibility(element);
			String text = element.getText();
			return text.trim();
		}
		/**
		 * @Method to get attribute
		 * @param element
		 * @param name
		 * @return
		 */
		public String getAttribute(WebElement element,String name)
		{
			elementVisibility(element);
			String attribute = element.getAttribute(name);
			return attribute.trim();
		}
		/**
		 * @see Method to check element is displayed or not
		 * @param element
		 * @return
		 */
		public boolean isDisplayed(WebElement element) 
		{
			elementVisibility(element);
			boolean displayed = element.isDisplayed();
			return displayed;
		}
		/**
		 * @see Method to check element is enabled or not
		 * @param element
		 * @return
		 */
		public boolean isEnabled(WebElement element) 
		{
			elementVisibility(element);
			boolean enabled = element.isEnabled();
			return enabled;
		}
		/**
		 * @see Method to check element is selected or not
		 * @param element
		 * @return
		 */
		public boolean isSelected(WebElement element) 
		{
			elementVisibility(element);
			boolean selected = element.isSelected();
			return selected;
		}
		/**
		 * @see Method to launch url with saved cookies
		 * @param url
		 */
		public void to(String url) 
		{
			navigate().to(url);
		}
		/**
		 * @see Method to go to next webpage
		 */
		public void forward() 
		{
			navigate().forward();	
		}
		/**
		 * @see Method to go to back webpage
		 */
		public void back()
		{
			navigate().back();
		}
		/**
		 * @see Method to refresh webpage
		 */
		public void refresh()
		{
			navigate().refresh();
		}
		/**
		 * @see Method to create Actions class
		 * @return
		 */
		public Actions actions()
		{
			Actions actions = new Actions(driver);
			return actions;
		}
		/**
		 * @see Method to perform mouse over action
		 * @param element
		 */
		public void moveToElement(WebElement element) 
		{
			elementVisibility(element);
			actions().moveToElement(element).perform();
		}
		/**
		 * @see Method to perform right click
		 */
		public void contextClick() 
		{
			actions().contextClick().perform();
		}
		/**
		 * @see Method to perform double click
		 */
		public void doubleClick() 
		{
			actions().doubleClick().perform();
		}
		/**
		 * @see Method to drag and drop element
		 * @param source
		 * @param target
		 */
		public void dragAndDrop(WebElement source,WebElement target) 
		{
			elementVisibility(source);
			elementVisibility(target);
			actions().dragAndDrop(source, target).perform();
		}
		
		//Select:C
		/**
		 * @see Method to create object for select class
		 * @param element
		 * @return
		 */
		public Select select(WebElement element)
		{
			elementVisibility(element);
			Select s = new Select(element);
			return s;
		}
		/**
		 * @see Method to select by index in dropdown
		 * @param element
		 * @param index
		 */
	
		public void selectByIndex(WebElement element,int index) 
		{
			elementVisibility(element);
			select(element).selectByIndex(index);
		}
		/**
		 * @see Method to select by value in dropdown
		 * @param element
		 * @param value
		 */
		public void selectByValue(WebElement element,String value) 
		{
			elementVisibility(element);
			select(element).selectByValue(value);
		}
		/**
		 * @see Method to select by visible text in drop down
		 * @param element
		 * @param text
		 */
		public void selectByVisibleText(WebElement element,String text)
		{
			elementVisibility(element);
			select(element).selectByVisibleText(text);
		}
		/**
		 * @see Method to deselect all in drop down
		 * @param element
		 */
		public void deselectAll(WebElement element)
		{
			elementVisibility(element);
			select(element).deselectAll();
		}
		/**
		 * @see Method to get all options from dropdown
		 * @param element
		 * @return List<WebElement>
		 */
		public List<WebElement> getOptions(WebElement element)
		{
			elementVisibility(element);
			List<WebElement> options = select(element).getOptions();
			return options;
		}
		/**
		 * @see Method to check dropdown is multiple select or not
		 * @param element
		 * @return boolean
		 */
		public boolean isMulitiple(WebElement element) 
		{
			elementVisibility(element);
			boolean multiple = select(element).isMultiple();
			return multiple;
		}
		/**
		 * @see Method to get all selected options in dropdown
		 * @param element
		 * @return List<WebElement>
		 */
		public List<WebElement> getAllSelectedOptions(WebElement element)
		{
			elementVisibility(element);
			List<WebElement> allSelectedOptions = select(element).getAllSelectedOptions();
			return allSelectedOptions;
		}
		/**
		 * @see Method to get first selected option in dropdown
		 * @param element
		 * @return
		 */
		public WebElement getFirstSelectedOption(WebElement element)
		{
			elementVisibility(element);
			WebElement firstSelectedOption = select(element).getFirstSelectedOption();
			return firstSelectedOption;
		}
		
		//Alert
		/**
		 * @see Method to switch to alert
		 * @return
		 */
		public Alert alert()
		{
			Alert alert = driver.switchTo().alert();
			return alert;
		}
		/**
		 * @see Method to click ok in alert
		 */
		public void accept() 
		{
			alert().accept();
		}
		/**
		 * @see Method to click cancel in alert
		 */
		public void dismiss() 
		{
			alert().dismiss();
		}
		/**
		 * @see Method to insert values in alert text box
		 * @param text
		 */
		public void alertSendkeys(String text)
		{
			alert().sendKeys(text);
		}
		/**
		 * @see Method to get text from alert
		 * @return String
		 */
		public String alertgetText()
		{
			String text = alert().getText();
			return text;
		}
		/**
		 * @see Method to switch to frame by id or name
		 * @param idOrName
		 * @return WebDriver
		 */
		public WebDriver frame(String idOrName) 
		{
			WebDriver frame = switchTo().frame(idOrName);
			return frame;
		}
		/**
		 * @see Method to switch to frame by index
		 * @param index
		 * @return WebDriver
		 */
		public WebDriver frame(int index)
		{
			WebDriver frame = switchTo().frame(index);
			return frame;
		}
		/**
		 * @see Method to switch to frame by webelement reference
		 * @param frameElement
		 * @return WebDriver
		 */
		public WebDriver frame(WebElement frameElement)
		{
			elementVisibility(frameElement);
			WebDriver frame = switchTo().frame(frameElement);
			return frame;
		}
		/**
		 * @Method to select browser and launch browser
		 * @param browserType
		 */
		public static void getDriver(String browserType)
		{
			switch (browserType) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				break;
			}
			
			
			/**
			 * @see Method to maximize window
			 */
			
		}
		public static void maximizeWindow() 
		{
			manage().window().maximize();
		}
		/*
		 * @see Method to clear values in webelement reference
		 */
		public void clear(WebElement element) {
			elementVisibility(element);
			element.clear();
		}
		/**
		 * @see Method to implicitly wait
		 * @param seconds
		 */
		public static void implicitWait(long seconds) 
		{
			manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		}
		
		/**
		 * @see Method to get data from excel
		 * @param sheetName
		 * @param rowNum
		 * @param cellNum
		 * @return String
		 * @throws IOException
		 */
		/*
		public String getData(String sheetName,int rowNum,int cellNum) throws IOException 
		{
			String value = null;
			File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkTasks\\Excel\\AdactinHotel.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook w = new XSSFWorkbook(stream);
			Sheet s = w.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell cell = r.getCell(cellNum);
			CellType cellType = cell.getCellType();
			switch (cellType) 
			{
			case STRING:
				value = cell.getStringCellValue();
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell))
				{
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					value = dateFormat.format(dateCellValue);
					
				}
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					 long v = (long)numericCellValue;
					 value = String.valueOf(v);
				}
				
				break;

			}
			return value;	
		}*/
		/**
		 * @see Method to update data in excel
		 * @param sheetName
		 * @param rowNum
		 * @param cellNum
		 * @param data
		 * @throws IOException
		 */
		/*public void updateData(String sheetName,int rowNum,int cellNum,String data) throws IOException
		{
			File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkTasks\\Excel\\AdactinHotel.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook w = new XSSFWorkbook(stream);
			Sheet s = w.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell cell = r.createCell(cellNum);
			cell.setCellValue(data);
			FileOutputStream o = new FileOutputStream(file);
			w.write(o);
			
		}
		*/
		
	
}



