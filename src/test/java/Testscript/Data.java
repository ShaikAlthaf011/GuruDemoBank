package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import ReusableComponents.BussinessComponents;
import ReusableComponents.DataProviders;

public class Data extends BussinessComponents {
@Test(dataProvider="logindata",dataProviderClass=DataProviders.class)
public void Data(String username,String password) throws IOException {
	String url=Configuration.BrowserConfiguration.BrowserOpen("url");
	LauchingBrowser(url);
	datareading(username,password);
}
}
