package BlackKitestechnology.AbstractComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AbstractComponents {
WebDriver driver;
	
	public AbstractComponents(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions action = new Actions(driver);
	
	
	
	public void implicitwait() 
	{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void Scroll(String argument)
	{
     js.executeScript(argument);
	}
	
	public void MouseAction(WebElement Element )
	{
		Actions action = new Actions(driver);
		action.moveToElement(Element).click().perform();
	}
	
}
