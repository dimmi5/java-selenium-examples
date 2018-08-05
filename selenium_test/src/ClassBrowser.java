import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ClassBrowser {
	private String url_web_site;
	private WebDriver driver;   
	
	public ClassBrowser(String url_web_site) {
		this.url_web_site = url_web_site;
		
	}
	
	public int start_browser(Boolean start_chrome) {
		if(start_chrome) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");			
			driver = new ChromeDriver(options);
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(url_web_site);
		
		return 0;
	}
	
	public int stop_browser() {
		driver.close();
		
		return 0;
	}
	
	public String get_text(String xPath) {
		WebElement we = driver.findElement(By.xpath(xPath));
		return we.getText();
	}
	
	public Boolean is_highlighted(String xPath) {
		WebElement we = driver.findElement(By.xpath(xPath));
		Object o =we.getAttribute("class");
		return we.getAttribute("class").contains("active");
	}
	
	public void click(String pattern) throws Exception {
		WebElement we = null;
		try {
			if(pattern.contains("//"))
				we = driver.findElement(By.xpath(pattern));
			else
				we = driver.findElement(By.id(pattern));
			
			we.click();
			Thread.sleep(1000);
			return;
		}catch(Exception e) {
		}
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(we);
			actions.perform();		
			
			we.click();
			Thread.sleep(1000);
			return;
		}catch(Exception e) {
		}
		
		we.click();
		
		throw(new Exception());
	}
	
	public int mouse_over(String xPath) throws Exception {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(xPath));
		action.moveToElement(we).build().perform();
		Thread.sleep(1000);
		return 0;
	}

	public void set_text(String xPath,String text) {
		WebElement we = driver.findElement(By.xpath(xPath));
		we.sendKeys(text);
	}

	public void set_text(String xPath,Keys key) throws Exception {
		WebElement we = driver.findElement(By.xpath(xPath));
		we.sendKeys(key);
		Thread.sleep(200);
	}
	
}
