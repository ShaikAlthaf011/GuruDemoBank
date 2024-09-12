package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import ReusableComponents.BussinessComponents;

public class VerifyNewcustomer extends BussinessComponents {
	@Test //Manger Id : mngr588949
public void VerifyNewcustomer () throws IOException {
	String url=Configuration.BrowserConfiguration.BrowserOpen("url");
	LauchingBrowser(url);
	LoginCredential();
	Customer();
	NewCustomerApplication();
	handlingAlert();
	NEWACCOUNT();
	Customeridnewaccount();
	handlingAlert();
}
}
