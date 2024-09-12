package ReusableComponents;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Configuration.ExtentFactory;

import Orpage.Loginpage;
import Orpage.NewCustomer;


public class BussinessComponents extends TechnicalComponents {
public static Loginpage lp;
public static NewCustomer Nw;


public static void LauchingBrowser(String url) {
	TechnicalComponents.Navigateurl(url);
	lp=new Loginpage(driver);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"results are verified");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void LoginCredential() {
	lp.EnterUsername(lp.username,"mngr588949");
	lp.Enterpassword(lp.password,"dypAnAz");
	lp.LoginButton(lp.Login);
	
}
public void Customer() {
	Nw=new NewCustomer(driver);
	Nw.Banknewcustomer(Nw.New);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"results are verified");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void NewCustomerApplication() {
	Nw=new NewCustomer(driver);
	Nw.Name(Nw.customername,"S.Althaf");
	Nw.Radio(Nw.Radiobutton);
	Nw.Selectdate(Nw.Date,"17-10-1991");
	Nw.Writeaddress(Nw.Address,"D.No:6/19,Nanadamuri Nager,Kayandurgam Road,Ananatapur");
	Nw.CityName(Nw.City,"Ananatapur");
	Nw.SelectState(Nw.State,"Andhra Pradesh");
	Nw.PinNumber(Nw.pin,"543001");
	Nw.MobileNumber(Nw.Mobile,"7032618224");
	Nw.Mails(Nw.Email,"Shaikalthaf7032618224@gmail.com");
	Nw.Customerpassword(Nw.Password,"2213");
	Nw.Submiited(Nw.submit);
}
public void handlingAlert() {
	Nw=new NewCustomer(driver);
	Nw.Actionsclass(driver);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"results are verified");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Credentail(String username,String password) {
	
	lp.EnterUsername(lp.username,username);
	lp.Enterpassword(lp.password, password);
	lp.LoginButton(lp.Login);
}
public void datareading(String username,String password) {
	lp.EnterUsername(lp.username,username);
	lp.Enterpassword(lp.password, password);
	lp.LoginButton(lp.Login);
}
public void NEWACCOUNT() {
	Nw=new NewCustomer(driver);
	Nw.AccountNew(Nw.NewAccount);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"results are verified");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Customeridnewaccount() {
	Nw=new NewCustomer(driver);
	Nw.cusid(Nw.id,"mngr588949");
	Nw.Typesaccount(Nw.AccountType,"Savings");
	Nw.DepositeAmount(Nw.Deopsite,"50000");
	Nw.SUBMIT(Nw.Submitted);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"results are verified");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
}
