package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import ReusableComponents.BussinessComponents;

public class Verifyurl extends BussinessComponents {
	//Manger Id : mngr588949
@Test
public void Verifyurl() throws IOException {
	String url=Configuration.BrowserConfiguration.BrowserOpen("url");
	LauchingBrowser(url);
	LoginCredential();
}
}
