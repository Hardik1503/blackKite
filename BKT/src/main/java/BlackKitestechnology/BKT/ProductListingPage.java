package BlackKitestechnology.BKT;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class ProductListingPage{

	
	WebDriver driver;
	
	public ProductListingPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   
	//PageFactory
	 @FindBy(xpath="(//*[text()='zara coat 3'])")
     WebElement Productname;

	 //Action Method
	 
	 public void clickProduct()
	 {
		 Productname.click();
	 }

	 public void Labelheight()
	 {
		System.out.println(Productname.getRect().getDimension().getHeight());	
	 }
	 
	 public void LabelWidth()
	 {
		 System.out.println(Productname.getRect().getDimension().getWidth());
		
	 }
	 
	 public void scroll() {
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scroll(0,500)");
				 
	}
	 
}
