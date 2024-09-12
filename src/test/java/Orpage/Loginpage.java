package Orpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class Loginpage extends TechnicalComponents {

@FindBy(xpath="//input[@name='uid']")
public WebElement username;

@FindBy(xpath="//input[@name='password']")
public WebElement password;

@FindBy(xpath="//input[@name='btnLogin']")
public WebElement Login;

	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void EnterUsername(WebElement element,String Text) {
	TechnicalComponents.send(element, Text);
}
public void Enterpassword(WebElement element,String Text) {
	TechnicalComponents.send(element, Text);
}
public void LoginButton(WebElement element) {
	TechnicalComponents.click(element);
}

}
