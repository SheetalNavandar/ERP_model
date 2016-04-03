package MyERP;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ERP_first 
{
	WebDriver driver;
	


public static void openURL(WebDriver driver)
{
	driver.get("http://dms.saleseos.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("submit")).click();
	driver.manage().window().maximize();
	
}

public static void createLead(WebDriver driver)
{
	
	WebElement menu=driver.findElement(By.className("mainnav")).findElement(By.className("mainnav-menu"));
	List<WebElement> menulist=menu.findElements(By.tagName("a"));
	for(WebElement list:menulist)
	{
		String str=list.getText();
		System.out.println(str);
		if(str.equalsIgnoreCase("Master"))
		{
			list.click();
			break;
		
		}
		
	}
	List<WebElement> master_list= driver.findElement(By.className("mainnav-menu")).findElements(By.tagName("li")).get(1).findElement(By.className("dropdown-menu")).findElements(By.tagName("li"));
	for(WebElement master:master_list)
	{
		String mas=master.getText();
		if(mas.equalsIgnoreCase("Lead"))
		{
//			
			master.click();
			break;
		}
		
	}
//	System.out.println(driver.findElement(By.className("heading-block")).getText());
	//driver.findElement(By.xpath(".//*[text()=' Click Here To Add New Lead']")).click();
	driver.findElement(By.className("heading-block")).findElement(By.tagName("a")).click();
	/*String newWindow=driver.getWindowHandle();
	driver.
	Alert obj = driver.switchTo().alert();
	driver.switchTo().alert();
	System.out.println(driver.getTitle());
	driver.findElement(By.className("modal-body")).findElement(By.className("row")).findElement(By.className("col-sm-6")).findElement(By.id("client_name")).sendKeys("Sheetal");
	System.out.println("sucess");*/
	driver.findElement(By.name("client_name")).sendKeys("sheetal");
	//driver.findElement(By.id("client_company")).sendKeys("Tanish");
	//driver.findElement(By.id("client_employee")).click();
	Select ref_delaer= new Select(driver.findElement(By.xpath("//select[@name='client_dealer']")));
	ref_delaer.selectByVisibleText("Other");
	//Select emp= new Select (driver.findElement(By.xpath("//select[@id='client_employee']")));
	//emp.selectByValue("21");
	driver.findElement(By.xpath("//input[@value='54']")).click();
	driver.findElement(By.name("client_address")).sendKeys("c-504,Magnolia,Baner-Pashan link road,Pune");
	driver.findElement(By.name("client_address1")).sendKeys("c-504,Magnolia,Baner-Pashan link road,Pune");
	Select country=new Select(driver.findElement(By.xpath("//select[@name='client_country']")));
	country.selectByVisibleText("India");
	Select state= new Select(driver.findElement(By.id("txtState")));
	WebDriverWait w= new WebDriverWait(driver, 30);
	w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("txtState")), "select"));
	state.selectByVisibleText("Maharashtra");
	Select city= new Select(driver.findElement(By.id("txtCity")));
	w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("txtCity")), "select"));
	city.selectByVisibleText("Pune");
	Select pincode= new Select(driver.findElement(By.id("txtPincode")));
	w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("txtPincode")), "select"));
	pincode.selectByVisibleText("select");
	driver.findElement(By.name("client_contact")).sendKeys("9823013573");
	driver.findElement(By.name("client_contact1")).sendKeys("9823013715");
	
	driver.findElement(By.name("client_email")).sendKeys("karwasheetal@gmail.com");
	Select leadType=new Select(driver.findElement(By.id("type_lead")));
	leadType.selectByValue("Type 1");
	Select quality= new Select(driver.findElement(By.id("quality")));
	quality.selectByVisibleText("Good");
	Select source= new Select(driver.findElement(By.id("source")));
	source.selectByVisibleText("Website");
	
	
	driver.findElement(By.id("submit")).click();
	System.out.println("Lead Created");
	List<WebElement> modal=driver.findElement(By.id("modal-admin")).findElement(By.className("modal-content")).findElement(By.className("modal-body")).findElements(By.className("row"));
	System.out.println(modal.size());
	//String modal=driver.findElement(By.className("modal-open")).findElement(By.className("modal-body")).findElement(By.className("row")).getText();
	//System.out.println(modal);
}



public static void makeQuotation(WebDriver driver)
{
	
	WebElement menu=driver.findElement(By.className("mainnav")).findElement(By.className("mainnav-menu"));
	List<WebElement> menulist=menu.findElements(By.tagName("a"));
	for(WebElement list:menulist)
	{
		String str=list.getText();
		//System.out.println(str);
		if(str.equalsIgnoreCase("Quotation"))
		{
			list.click();
			break;
		
		}
	}
	
	List<WebElement> list=menu.findElements(By.tagName("li"));
	System.out.println(list.size());
	for(WebElement quotation :list)
	{
		String str1=quotation.getText();
		if(str1.equalsIgnoreCase("Make Quotation"))
		{
			quotation.click();
			break;
		}
	}
	WebDriverWait w= new WebDriverWait(driver,30);
	w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='heading-block']/a")));
	System.out.println("hi:");
	driver.findElement(By.className("heading-block")).findElement(By.tagName("a")).click();
	Select quot= new Select(driver.findElement(By.name("quot_make")));
	quot.selectByVisibleText("Client");
	Select clit= new Select(driver.findElement(By.name("client")));
	clit.selectByVisibleText("sheetal");
	Select priority= new Select(driver.findElement(By.name("priority")));
	priority.selectByVisibleText("Medium");
	Select terms= new Select(driver.findElement(By.name("terms")));
	terms.selectByVisibleText("Select Terms & Condition");

	
	Select product= new Select(driver.findElement(By.xpath("//td[@class='admin']/select[@id='uom']")));
	product.selectByVisibleText("Pipe");
	driver.findElement(By.xpath("//td[@class='admin']/input[@id='qu_1']")).sendKeys("10");

	driver.findElement(By.xpath("//td[@class='admin']/input[@id='pr_1']")).sendKeys("25");
	driver.findElement(By.xpath("//input[@id='addrow1']")).click();
	System.out.println("row added");
			
}
public static void approveQuotation(WebDriver driver,String client)
{
	WebElement menu=driver.findElement(By.className("mainnav")).findElement(By.className("mainnav-menu"));
	List<WebElement> menulist=menu.findElements(By.tagName("a"));
	for(WebElement list:menulist)
	{
		String str=list.getText();
		System.out.println(str);
		if(str.equalsIgnoreCase("Quotation"))
		{
			list.click();
			break;
		
		}
	}
	
	List<WebElement> list=driver.findElement(By.className("mainnav")).findElement(By.className("mainnav-menu")).findElements(By.tagName("li"));
	for(WebElement quotation:list)
	{
		if((quotation.getText()).equalsIgnoreCase("Approve Quotation"))
		{
			quotation.click();
		}
		//String str1=quotation.getText();
		//System.out.println(str1);
	}
	//driver.findElement(By.id("DataTables_Table_0")).findElement(By.tagName("tbody")).f
	
	/*List<WebElement> list=menu.findElements(By.tagName("li"));
	System.out.println(list.size());
	for(WebElement quotation :list)
	{
		String str1=quotation.findElement(By.tagName("a")).getText();
		//String str1=quotation.getText();
		System.out.println(str1);
		if(str1.equalsIgnoreCase(" Approve Quotation"))
		{
			quotation.click();
			break;
		}
	}*/
	//driver.findElement(By.id("wrapper")).findElement(By.className("content")).findElement(By.id("DataTables_Table_0_wrapper")).findElement(By.id("DataTables_Table_0"));
	
	//driver.findElement(By.id("wrapper")).findElement(By.className("content"));
	
	List<WebElement> check= driver.findElements(By.xpath("//div[@id='wrapper']//div[@class='content']//div[@class='portlet-body']//div[@id='DataTables_Table_0_wrapper']//div[@class='row']//tbody//tr"));
		
	for(WebElement ck:check)
	{
		List<WebElement>checkbox=ck.findElements(By.tagName("td"));
		for(WebElement cc:checkbox)
		{
			WebElement checkb=cc.findElement(By.name("checkboxstatus[9]"));
			if((cc.getText()).equalsIgnoreCase("sheetal- Client"))
			{
				checkb.click();
			}
		}
	}
	
	System.out.println("Hi");
	
	
	
}
}