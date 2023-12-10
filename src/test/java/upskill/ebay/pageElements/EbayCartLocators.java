package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	@FindBy(xpath="//select[@selectboxlabel='Size Type']")
	public WebElement ddsize;
	
	@FindBy(xpath="//select[@selectboxid='1001']")
	public WebElement ddmensize;
	
	@FindBy(xpath="//select[@selectboxlabel='Shade']")
	public WebElement ddshades;
	
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement cbxquantity;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	public WebElement addtocart;
	
}
