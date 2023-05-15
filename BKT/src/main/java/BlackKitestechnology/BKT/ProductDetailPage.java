package BlackKitestechnology.BKT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
WebDriver driver;
	
	public ProductDetailPage(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
  //PageFactory
	@FindBy(xpath="(//*[@class='btn w-40 rounded'])[1]")
	WebElement view;
	
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])")
    WebElement addTocart;	
			
			 
	@FindBy(xpath="(//*[@class='btn btn-custom'])[3]")
    WebElement gotoCartPage ;
			
			
	@FindBy(xpath="(//*[@class='btn btn-primary'])[2]")
    WebElement addButton ;	
			
			
		
	
//Action Method
	
	public void View()
	{
		view.click();
	}
	
	public void AddTocart()
	{
		addTocart.click();
	}
	public void GotoCartPage()
	{
		gotoCartPage.click();
	}
	public void AddButton()
	{
		addButton.click();
	}
	
	
}