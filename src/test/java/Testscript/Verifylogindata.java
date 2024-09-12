package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import Configuration.LoginDataProvider;
import ReusableComponents.BussinessComponents;

public class Verifylogindata extends BussinessComponents {
	@Test(dataProvider="logindata",dataProviderClass=LoginDataProvider.class)
public void  Verifylogindata(String username,String password) throws IOException {
	String url=Configuration.BrowserConfiguration.BrowserOpen("url");
	LauchingBrowser(url);
	Credentail(username,password);
}
}
