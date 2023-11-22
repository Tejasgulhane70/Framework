package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	//click on organization
     @FindBy(xpath="//a[text()='Organizations']")
     private WebElement Organization;
     
     //click on organization plus button
     @FindBy(xpath="//img[@title='Create Organization...']")
     private WebElement plusbtn;
     
     //click on contact
     @FindBy(xpath="//a[text()='Contacts']")
     private WebElement Contact;
     
     @FindBy(xpath="//img[@title='Create Contact...']")
     private WebElement ContactPlusbtn;
     
     
     
     

	public WebElement getContactPlusbtn() {
		return ContactPlusbtn;
	}



	public WebElement getContact() {
		return Contact;
	}



	public WebElement getPlusbtn() 
	{
		return plusbtn;
	}



	public WebElement getOrganization() 
	{
		return Organization;
	}

	
     

}
