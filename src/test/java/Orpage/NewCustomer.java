package Orpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class NewCustomer extends TechnicalComponents {

	@FindBy(xpath="//ul[@class='menusubnav']/li[2]/a")
	public WebElement New;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement customername;
	
	@FindBy(xpath="//input[@name='rad1']")
	public WebElement Radiobutton;
	
	@FindBy(xpath="//input[@id='dob']")
	public WebElement Date;
	
	@FindBy(xpath="//textarea")
	public WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	public WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	public WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	public WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	public WebElement Mobile;
	
	@FindBy(xpath="//input[@name='emailid']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath="//input[@value='Submit']")
	public WebElement submit;
	
	@FindBy(xpath="//ul[@class='menusubnav']/li[5]")
	public WebElement NewAccount;
	
	@FindBy(xpath="//input[@name='cusid']")
	public WebElement id;
	
	@FindBy(xpath="//select[@name='selaccount']")
	public WebElement AccountType;
	
	@FindBy(xpath="//input[@name='inideposit']")
	public WebElement Deopsite;
	
	@FindBy(xpath="//input[@name='button2']")
	public WebElement Submitted;
	
	public NewCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
   public void Banknewcustomer(WebElement element) {
	   TechnicalComponents.click(element);
   }
   public void Name(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void Radio(WebElement element) {
	   TechnicalComponents.click(element);
   }
   public void Selectdate(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void Writeaddress(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void CityName(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void SelectState(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void PinNumber(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void MobileNumber(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void Mails(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void Customerpassword(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void Submiited(WebElement element) {
	   TechnicalComponents.click(element);
   }
   public void AccountNew(WebElement element) {
	   TechnicalComponents.click(element);
   }
   public void cusid(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void Typesaccount(WebElement element,String Text) {
	   TechnicalComponents.select(element,Text);
   }
   public void DepositeAmount(WebElement element,String Text) {
	   TechnicalComponents.send(element, Text);
   }
   public void SUBMIT(WebElement element) {
	   TechnicalComponents.click(element);
   }
}
