package BlackKitestechnology.BKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//Page Factory
     @FindBy(id="userEmail")
     WebElement UserName;

     @FindBy(id="userPassword")
     WebElement Pw;
     
     @FindBy(id="login")
     WebElement Loginbtn;
     
     
     
//Action Method
     public void url()
 	{
 		driver.get("https://rahulshettyacademy.com/client");
 	}
     
     public void windowMaximize()
     {
    	 driver.manage().window().maximize();
     }
 	
     
    public void LoginAction(String name, String PW)
    {
    	UserName.sendKeys(name);
    	Pw.sendKeys(PW);
    	Loginbtn.click();
    }
}
