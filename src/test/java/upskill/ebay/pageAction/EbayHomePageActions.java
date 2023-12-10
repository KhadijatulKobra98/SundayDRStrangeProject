package upskill.ebay.pageAction;

	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomePageLocators;
	import upskill.utilities.SetupDrivers;

	public class EbayHomePageActions{
		
	 EbayHomePageLocators EbayHomePageLocatorsobj;
		
		
		public EbayHomePageActions(){
			
			 EbayHomePageLocatorsobj= new EbayHomePageLocators();
			PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsobj);
			
		}
		
		public void searchShoes(){
			EbayHomePageLocatorsobj.txtbxSearch.sendKeys("shoes");
			EbayHomePageLocatorsobj.btnSearch.click();

		}
		public void searchPants(){
			EbayHomePageLocatorsobj.txtbxSearch.sendKeys("Pants");
			EbayHomePageLocatorsobj.btnSearch.click();

		}
		public void searchShirts(){
			EbayHomePageLocatorsobj.txtbxSearch.sendKeys("Shirts");
			EbayHomePageLocatorsobj.btnSearch.click();
		}
		public void SearchItems(String items) {
			EbayHomePageLocatorsobj.txtbxSearch.sendKeys(items);
			EbayHomePageLocatorsobj.btnSearch.click();
			
			
		}
		public void SearchBigTshirt(){
			EbayHomePageLocatorsobj.txtbxSearch.sendKeys("Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT.");
			EbayHomePageLocatorsobj.btnSearch.click();
		}
		public void MouseHoverebay() throws Exception{
			Actions action = new Actions(SetupDrivers.driver);
			action.moveToElement(EbayHomePageLocatorsobj.linkmyebay);
			action.perform();
			Thread.sleep(4000);
		}
		public void Clicksummary() throws Exception{
			
			WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 2);
			explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomePageLocatorsobj.linksummary));
			
			EbayHomePageLocatorsobj.linksummary.isEnabled();
			EbayHomePageLocatorsobj.linksummary.click();
			Thread.sleep(4000);
		}
		public void keyboardKeys(){
			EbayHomePageLocatorsobj.btnSearch.sendKeys(Keys.ENTER);
			EbayHomePageLocatorsobj.btnSearch.sendKeys(Keys.UP);
			EbayHomePageLocatorsobj.btnSearch.sendKeys(Keys.DOWN);
			EbayHomePageLocatorsobj.btnSearch.sendKeys(Keys.CLEAR);
			EbayHomePageLocatorsobj.btnSearch.sendKeys(Keys.DELETE);
		}
	
	public void synchronization(){
		/*	Selenium Wait : 
				1. Implicit wait(Global), 
				2. Explicit wait(Conditional), 
				3. Fluent wait(intermittent) */
			
		//Implicit Wait
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomePageLocatorsobj.btnSearch));
		
		//Fluent Wait
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								
		fluentWait.withTimeout(10, TimeUnit.SECONDS);
		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
	}
	}
