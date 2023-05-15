package BlackKitestechnology.BKT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
	    
		LandingPage LandingPage = new LandingPage(driver);
		LandingPage.url();
		LandingPage.windowMaximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		LandingPage.LoginAction("hardik@xyz.com","Hardik@123*");
		
		ProductListingPage ProductListingPage = new ProductListingPage(driver);
		
		ProductListingPage.Labelheight();
		ProductListingPage.LabelWidth();
		ProductListingPage.scroll();
		
		ProductDetailPage ProductDetailPage = new ProductDetailPage(driver);
		ProductDetailPage.View();
		ProductDetailPage.AddTocart();
		ProductDetailPage.GotoCartPage();
		ProductDetailPage.AddButton();
		
		Paymentpage PaymentPage = new Paymentpage(driver);
		PaymentPage.scroll();
		PaymentPage.CVV("123");
		PaymentPage.NameonCard("Hardik Rajput");
		PaymentPage.CouponCode("123");
		PaymentPage.Button();
		Thread.sleep(7000);
		PaymentPage.EnterCountry("india");
		WebElement india= driver.findElement(By.xpath("(//*[@class='ng-star-inserted'])[4]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(india).click().perform();
		PaymentPage.Order();
	
	}

}
