package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContactPage 
{
    @FindBy(xpath="//select[@name='salutationtype']")
	private WebElement dropdown1;
    
    @FindBy(name="firstname")
    private WebElement firstnametf;
    
    @FindBy(name="lastname")
    private WebElement lastnametf;
    
    @FindBy(xpath="(//input[@name='assigntype'])[2]")
    private WebElement radiobtn;
    
    @FindBy(name="assigned_group_id")
    private WebElement Groupdropdown;
    
    @FindBy(xpath="(//input[@name='button'])[1]")
    private WebElement Savebtn;
    
    //mousehover on img
    @FindBy(xpath="(//td[@valign='bottom'])[2]")
	private WebElement Signoutimg;
	
    //click on signout
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbutton;
    
	
	

	public WebElement getSignoutimg() {
		return Signoutimg;
	}

	public WebElement getSignoutbutton() {
		return signoutbutton;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

	public WebElement getDropdown1() {
		return dropdown1;
	}

	public WebElement getFirstnametf() {
		return firstnametf;
	}

	public WebElement getLastnametf() {
		return lastnametf;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getGroupdropdown() {
		return Groupdropdown;
	}
	
	
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement Contactbtnplus;


	@FindBy(id="search_txt")
	private WebElement contacttf;
	
	@FindBy(name="search")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[text()='Qspider']")
	private WebElement contactText;


	public WebElement getContactText() {
		return contactText;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getContacttf() {
		return contacttf;
	}

	public WebElement getContactbtnplus() {
		return Contactbtnplus;
	}

}
