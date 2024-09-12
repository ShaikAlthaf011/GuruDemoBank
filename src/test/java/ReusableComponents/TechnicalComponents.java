package ReusableComponents;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import Configuration.BrowserConfiguration;

public class TechnicalComponents extends BrowserConfiguration {
public static void Navigateurl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
}
public static void click(WebElement element) {
	element.click();
}
public static void send(WebElement element,String Text) {
	element.sendKeys(Text);
}
public static void Actionsclass(WebDriver driver) {
	Alert ac=driver.switchTo().alert();
	ac.accept();
	
}
public static String takescreenshot() {
	String filepath="";
	try {
		ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		String screenshotName=(d.getDate() < 10 ? "0" + d.getDate() : d.getDate()) + " " + 
	            (d.getMonth() + 1 < 10 ? "0" + (d.getMonth() + 1) : (d.getMonth() + 1)) + "_" + 
	            (1900 + d.getYear()) + "_" + 
	            (d.getHours() < 10 ? "0" + d.getHours() : d.getHours()) + "_" + 
	            (d.getSeconds() < 10 ? "0" + d.getSeconds() : d.getSeconds());
		filepath=System.getProperty("user.dir")+"/reports/screenshot/"+screenshotName+".jpg";
	    Files.copy(f,  new File(filepath));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return filepath;
}
public static void select(WebElement element,String Text) {
	Select sc=new Select(element);
	sc.selectByVisibleText(Text);
	
	
}
}
