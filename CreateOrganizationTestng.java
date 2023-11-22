package Base_Class_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import COMMON_UTILS1.BaseClass;
import COMMON_UTILS1.BaseClass1;
import COMMON_UTILS1.ExcelUtils;
import COMMON_UTILS1.FileUtils;
import COMMON_UTILS1.WebDriverUtils;
import POM.CreateOraganizationPage;
import POM.HomePage;
import POM.VtigerLoginPage;

public class CreateOrganizationTestng extends BaseClass1
{
	
	@Test
	public void Organization() throws EncryptedDocumentException, IOException, InterruptedException

	   {
	        
			//create object of fileutils class
		   FileUtils futils = new FileUtils();
		   WebDriverUtils wutils = new WebDriverUtils();
		   
		   //login the webpage to take data from propertyfile
		 
	       //pagefactory it is a class and init element it is a method it is also called as subset of pom 
		  //pass the webfriverreferance and 
	        
	        //homepage 
	        HomePage hp = new HomePage();
	        PageFactory.initElements(driver, hp);
	        //click on organization
	        hp.getOrganization().click();
	        //click on plus button
	        hp.getPlusbtn().click();
	        
	        
	       //organizationPage //get data from excelsheet
	        
	       ExcelUtils eutils = new ExcelUtils();
	       
	       String data1 = eutils.getDataFromExcelFile1("Sheet1", 1, 0);
	       CreateOraganizationPage org = new CreateOraganizationPage();
	       PageFactory.initElements(driver, org);
	       org.getOrgname().sendKeys(data1);
	        //click on radio Group button
	       org.getRadiobtn().click();
	        
	       //select dropdown by visible text
	        String Group = eutils.getDataFromExcelFile1("Sheet1", 1, 1);
	        wutils.handledropdown(org.getDropdown(), Group);
	        
	        //screenshot
	        wutils.screenshotwebpage(driver);
	        
	        //click on save button
	        org.getSavebtn().click();
	        
	        Thread.sleep(4000);
	        
	        
	        
	        
	        
	        
	        
	        

		
	}
	
	
	

}
