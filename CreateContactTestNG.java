package Base_Class_POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import COMMON_UTILS1.BaseClass;
import COMMON_UTILS1.ExcelUtils;
import COMMON_UTILS1.FileUtils;
import COMMON_UTILS1.WebDriverUtils;
import POM.CreateContactPage;
import POM.HomePage;
import POM.VtigerLoginPage;

public class CreateContactTestNG extends BaseClass
{
	@Test
	public void contact() throws IOException, InterruptedException
	{
	
	    	
	    	FileUtils futils = new FileUtils(); //  --->1st home page take a data from propertyfile
	    	WebDriverUtils wutils = new WebDriverUtils();//-->call a webdriver methods
	    	ExcelUtils eutils = new ExcelUtils();//---> 3rd contact page take a data from excelfile
	    	
	    
	          Thread.sleep(2000);	
	    	//2nd homepage
	    	HomePage hp = new HomePage();
	    	PageFactory.initElements(driver, hp);
	    	//click on contact
	    	hp.getContact().click();
	    	Reporter.log("Click on Contact Module"); //to pass the string in html report 
	    	//click on plus icon
	    	hp.getContactPlusbtn().click();
	    	Reporter.log("Click on Plus Image");
	    	
	    	//3RD createContactPage
	    	CreateContactPage cp = new CreateContactPage();
	    	PageFactory.initElements(driver, cp);
	    	
	    	//handle 1st dropdown with taken data from excel sheet
	    	String exceldata1 = eutils.getDataFromExcelFile2("Sheet1", 1, 0);
	    	//dirct call the dropdownhandle method in webdrivrutils class
	    	wutils.handledropdown(cp.getDropdown1(), exceldata1);
	    	Reporter.log("Handle the Dropdown of First Name");
	    	
	    	
	    	//pass the data of firstname textfield taken from excelsheet
	    	String exceldata2 = eutils.getDataFromExcelFile2("Sheet1", 1, 1);
	    	cp.getFirstnametf().sendKeys(exceldata2);
	    	Reporter.log("Enter the First Name");
	    	
	    	//pass the data of lastname textfield taken from excelsheet
	    	String exceldata3 = eutils.getDataFromExcelFile2("Sheet1", 1, 2);
	    	cp.getLastnametf().sendKeys(exceldata3);
	    	Reporter.log("Enter the Last Name");

	    	
	    	//click on contact plus button
	    	 cp.getContactbtnplus().click();
		    	Reporter.log("Click on Organization Plus icon");

	    	 
	    	 Thread.sleep(4000);
	    	 //paretnts to child
	    	// wutils.switchtoparenttochild(driver);
	    	 //switch to for cotrol parrnt to child (multiple child) taken url of child from excel
	    	String childurl = eutils.getDataFromExcelFile2("Sheet1", 1, 7);
	    	wutils.swithchtowindow(driver, childurl);

	 	   
	 	     //PASS THE ORGANIZATION NAME IN SEARCH TEXTFIELD
	 	     String orgname1 = eutils.getDataFromExcelFile2("Sheet1",1,5);
	 	     cp.getContacttf().sendKeys(orgname1);
		    	Reporter.log("pass the organization name");

	 	     
	 	    //CLICK ON SEARCH BUTTON
	 	     cp.getSearchbtn().click();
		    	Reporter.log("Click on Search Button");

	 	     
	 	    //CLICK ON ORGNAME 
	 	     cp.getContactText().click();
	 	     Thread.sleep(2000);
		    	Reporter.log("Click on Data");

	 	    
	 	    //transfer the control child to parent
	 	     
	 	    wutils.switchtochildtoparent(driver);
	 	  
	    	//click on group radiobutton
	    	cp.getRadiobtn().click();
	    	Reporter.log("Click on Radio Button");

	    	
	    	//handle dropdown by visible text 
	    	String exceldata4 =eutils.getDataFromExcelFile2("Sheet1", 1, 3);
	    	wutils.handledropdown(cp.getGroupdropdown(), exceldata4);
	    	Reporter.log("Handle the Assign To Dropdown");

	    	
	    	Thread.sleep(2000);
	    	
	    	//-----to take screenshot of webpage screenshot call method-------->
//	    	
//	    	wutils.screenshotwebpage(driver);
//	   	    Thread.sleep(2000);
//	   	    
//	   	  //to perfrom scrolling
//	   	    wutils.scrolling(driver);
//	   	   
//	   	   //click on choose file uploading 
//	   	    WebElement e1 =  driver.findElement(By.xpath("//input[@type='file']"));
//	   	    
//	   	    Actions act = new Actions(driver);
//	   	    act.click(e1).perform();
//	   	  
//	   	    Runtime.getRuntime().exec("C:\\Autoiteditorr....22\\VtigerPOM.exe");
//	   	   
	      
	    	
	    	
	    	
			
		}

		
	}
	
	

