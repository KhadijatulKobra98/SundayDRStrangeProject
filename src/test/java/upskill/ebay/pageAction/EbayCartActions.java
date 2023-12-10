package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsobj;
	
	public EbayCartActions(){
		EbayCartLocatorsobj = new EbayCartLocators ();
		PageFactory.initElements(SetupDrivers.driver,EbayCartLocatorsobj);
	}
	public void Switchwindow(){
		for(String winHandle: SetupDrivers.driver.getWindowHandles()){
		SetupDrivers.driver.switchTo().window(winHandle);
	}}
	public void DDSize() throws Exception{
		Select Dropdown = new Select(EbayCartLocatorsobj.ddsize);
		//Dropdown.selectByVisibleText("Big & Tall");
		Dropdown.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		Thread.sleep(2000);
		
	}
	public void DDMenSize() throws Exception{
		Select Dropdown = new Select(EbayCartLocatorsobj.ddmensize);
		//Dropdown.selectByVisibleText("8XLT");
		Dropdown.selectByVisibleText(ReadExcelSheet.getMapData("MenSize"));
		Thread.sleep(2000);
}
	public void DDShades() throws Exception{
		Select Dropdown = new Select(EbayCartLocatorsobj.ddshades);
		//Dropdown.selectByVisibleText("Black");
		Dropdown.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
		Thread.sleep(2000);}
	public void ShirtQuantity() throws Exception{
		EbayCartLocatorsobj.cbxquantity.clear();
		//EbayCartLocatorsobj.cbxquantity.sendKeys("2");
		EbayCartLocatorsobj.cbxquantity.sendKeys(ReadExcelSheet.getMapData("Quantity"));
	}
	public void AddtoCart(){
		EbayCartLocatorsobj.addtocart.click();
	}}
