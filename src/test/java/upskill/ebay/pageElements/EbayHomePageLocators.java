package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	
	@FindBy(xpath="//input[@value = 'Search']")
	public WebElement btnSearch;
	

    @FindBy(xpath="//input[@aria-label='Search for anything']")
	public WebElement txtbxSearch;
    
    @FindBy(xpath="//a[@title = 'My eBay']")
	public WebElement linkmyebay;
    @FindBy(xpath="//a[contains(text(),'Summary')]")
   	public WebElement linksummary;
 
  
	}


