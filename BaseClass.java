package COMMON_UTILS1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.CreateContactPage;
import POM.CreateOraganizationPage;
import POM.VtigerLoginPage;

public class BaseClass 
{
	
	 public WebDriver driver ;
	  
	  FileUtils futils = new FileUtils();
      JavaUtils jutils = new JavaUtils();
	  WebDriverUtils wutils = new WebDriverUtils();
      ExcelUtils eutils = new ExcelUtils();


	@BeforeSuite
	public void BSconfig()
	{
		System.out.println("Connect to data base");
	}
		
		
	@BeforeClass
	public void BCconfig() throws IOException
	{
		
		   String BROWSER =   futils.getDataFromPropertyFile2("Browser");
		   String URL =   futils.getDataFromPropertyFile2("url");
		   
		   
		   if(BROWSER.equals("Chrome"))
			{
				
				driver = new ChromeDriver();
			}
			else if(BROWSER.equals("Edge"))
			{
				driver= new EdgeDriver();
			}
			else 
			{
			  driver= new FirefoxDriver();
			}
		   
		   driver.get(URL);
     
	        WebDriverUtils wutils = new WebDriverUtils();
	        //maximize the window
	        wutils.maximize(driver);
	        //to apply implicit wait
	        wutils.ImplicitWait(driver);
		
	}
	
	
	@BeforeMethod
	public void BMconfig() throws IOException
	{
		 String USERNAME  = futils.getDataFromPropertyFile2("username");
		  String PASSWORD= futils.getDataFromPropertyFile2("password");
		
		//1st loginpage //login to application 
    	VtigerLoginPage vlp= new VtigerLoginPage();
    	//for each and every class we can call this method 
    	PageFactory.initElements(driver, vlp);
    	vlp.getUsername().sendKeys(USERNAME);
    	vlp.getPassword().sendKeys(PASSWORD);
    	vlp.getLoginbutton().click();

		
		
	}
	
	@AfterMethod
	public void AMconfig() throws InterruptedException
	{
		
		
    	CreateContactPage cp = new CreateContactPage();
    	PageFactory.initElements(driver, cp);
    	//mousehover on admin img
    	wutils.Action(driver, cp.getSignoutimg());
    	//click on signout
    	cp.getSignoutbutton().click();
		
	}
	
	@AfterClass
	public void ACconfig()
	{
		driver.close();
	}
	
	
	@AfterSuite
	public void ASconfig()
	{
		System.out.println("DisConnect to data base");
		
		
	}
		
		
	}
	
	

