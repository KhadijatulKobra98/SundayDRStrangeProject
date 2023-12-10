package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	//Validate shoes items
	
	@FindBy(xpath="//span[contains(text(),'Shoes')]")
    public WebElement txtShoes;
	
	//validate pants items
	
	@FindBy(xpath="//span[contains(text(),'Pants')]")
    public WebElement txtPants;
	
	//validate shirt items
	
	@FindBy(xpath="//span[contains(text(),'Shirts')]")
    public WebElement txtShirts;
	
	//Checkbox Brand Nike
	@FindBy(xpath="//input[@aria-label='Nike']")
    public WebElement cbxBrandNike;
    
    //Checkbox Brand adidas
    
	@FindBy(xpath="//input[@aria-label='adidas']")
    public WebElement cbxBrandAdidas ;
	
	//Checkbox Brand  Unbranded
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
    public WebElement cbxBrandUnbranded ;
	
	//Checkbox Color Black
	@FindBy(xpath="//input[@aria-label='Black']")
    public WebElement cbxClrBlack ;
	
	// Checkbox Color White
	@FindBy(xpath = "//input[@aria-label='White']")
	public WebElement cbxClrWhite;
	// Checkbox Color Blue
	@FindBy(xpath = "//input[@aria-label='Blue']")
	public WebElement cbxClrBlue;
	
	@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With')]")
   	public WebElement linkshirt;
    

}
