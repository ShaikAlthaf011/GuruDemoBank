package ReusableComponents;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders extends ExcelUtils {
@DataProvider(name="logindata")
public String[][] getData() throws IOException{
	ExcelUtils ex=new ExcelUtils();
	return ex.getData();
	
}
}
