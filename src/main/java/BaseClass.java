import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	
	
	public void url(WebDriver driver,String url) {
		driver.get(url);

	}
	
    public void maximise(WebDriver driver) {
    	driver.manage().window().maximize();
		
	}

    public void clk(WebElement element) {
    	element.click();
		
    }
    
    public String toGetTitle(WebDriver driver ) {
    	String title = driver.getTitle();
    	return title;
		
	}
    
    public String enterUrl(WebDriver driver) {
    	String currentUrl = driver.getCurrentUrl();
    	return currentUrl;
		
	}
    
    public String getTexts(WebElement element) {
    	String text = element.getText();
    	return text;
		
	}
    
    public String getAttribute(WebElement element) {
    	String attribute = element.getAttribute("value");
    	return attribute;
		
	}
    
    public void perform(WebDriver driver) { 
    	Actions actions =new Actions(driver);
    	actions.perform();

	}
    
    public void click(WebDriver driver) { 
    	Actions actions =new Actions(driver);
    	actions.click();

	}
    
    public void doubleClick(WebDriver driver) { 
    	Actions actions =new Actions(driver);
    	actions.doubleClick();

	}
    
    public void contextClick(WebDriver driver) {
    	Actions actions= new Actions(driver);
    	actions.contextClick();
		
	}
    
    public void moveToElement(WebDriver driver,WebElement element) {
    	Actions actions= new Actions(driver);
    	actions.moveToElement(element);
		
	}
    
    public void dragAndDrop(WebDriver driver,WebElement element) {
    	Actions actions = new Actions(driver);
    	actions.dragAndDrop(element, element);
	
	}
    
    public void sendKeys(WebDriver driver,WebElement element) {
    	Actions actions= new Actions(driver);
    	actions.sendKeys(element);
		
	}
    
    public void keyUp(WebDriver driver,CharSequence charSequence) {
    	Actions actions= new Actions(driver);
    	actions.keyUp(charSequence);
		
	}
    
    public void keyDown(WebDriver driver,CharSequence charSequence) {
    	Actions actions= new Actions(driver);
    	actions.keyDown(charSequence);
		
	}
    
    public void keyPress(int data) throws AWTException {

		Robot robot = new Robot();
		robot.keyPress(data);
	}
    
    public void keyReleas(int data) throws AWTException {

		Robot robot = new Robot();
		robot.keyRelease(data);
	}
    
    public void switchTo(WebDriver driver) {
    	driver.switchTo();
		
	}
    
    public void accept(Alert alert) {
    	alert.accept();
		
	}
    
    public void reject(Alert alert) {
    	alert.dismiss();
		
	}
    
    public String getTxt(Alert alert,String data) {
    	String text = alert.getText();
    	return text;
		
	}
    
    public void sndKeys(Alert alert,String data) {
    	alert.sendKeys(data);

	}
    
    public void ss(Driver driver,TakesScreenshot screenshot) {
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	}
    
    public void indexSelection(WebElement element,int data) {
    	Select select = new Select(element);
    	select.selectByIndex(data);
         
	}
    
    private void gagag() {
		System.out.println("dsdjknsj");

	}
    
    private void sample() {
		System.out.println("hjsffkcjbd");

	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
