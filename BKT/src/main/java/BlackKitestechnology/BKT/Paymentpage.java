package BlackKitestechnology.BKT;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
	
	WebDriver driver;
 public Paymentpage(WebDriver driver) 
 {
    this.driver=driver;
    PageFactory.initElements(driver, this);
    
}

//PageFactory
	@FindBy(xpath="(//*[@class='input txt'])[1]")
   WebElement cvv;

  @FindBy(xpath="(//*[@class='input txt'])[2]")
   WebElement NAmeonCard;
	
  @FindBy(name="coupon")
  WebElement Couponcode;

  @FindBy(xpath="//*[@class='btn btn-primary mt-1']")
  WebElement Btn;
  
  @FindBy(xpath="//*[@placeholder='Select Country']")
  WebElement Country;
	
  @FindBy(xpath="//*[@class='btnn action__submit ng-star-inserted']")
  WebElement PlaceOrder;
  

  

//Action Method
 
 public void CVV(String CVV)
 {
	cvv.sendKeys(CVV);
 }
	
 public void NameonCard(String Holdername)
 {
	  NAmeonCard.sendKeys(Holdername);
 }
 
 public void CouponCode(String code)
 {
	  Couponcode.sendKeys(code);
 }
	
 public void Button()
 {
	  Btn.click();
 }   
	
 public void EnterCountry(String countryName)
 {
	  Country.sendKeys(countryName);
 }
	
 public void Order()
 {
	  PlaceOrder.click();
	   
 }
	
 public void scroll() {
	 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scroll(0,500)");
			 
 }
	
	
	
	
	
	
}
