package MyERP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatedTest {

	public static void main(String[] args) 
	
	{
		WebDriver driver= new FirefoxDriver();
		ERP_first.openURL(driver);
	//	ERP_first.createLead(driver);
	//	ERP_first.makeQuotation(driver);
		ERP_first.approveQuotation(driver,"sheetal- Client");

	}

}
