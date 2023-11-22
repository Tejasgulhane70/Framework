package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOraganizationPage 
{
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement radiobtn;
	
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement dropdown;
	
	
	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement savebtn;
	
	
	@FindBy(xpath="(//td[@valign='bottom'])[2]")
	private WebElement Signoutimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbutton;
	
	
	

	public WebElement getSignoutbutton() {
		return signoutbutton;
	}





	public void setSignoutbutton(WebElement signoutbutton) {
		this.signoutbutton = signoutbutton;
	}





	public WebElement getSignoutimg() {
		return Signoutimg;
	}





	public void setSignoutimg(WebElement signoutimg) {
		Signoutimg = signoutimg;
	}





	public WebElement getSavebtn() {
		return savebtn;
	}





	public WebElement getRadiobtn() {
		return radiobtn;
	}





	public WebElement getDropdown() {
		return dropdown;
	}





	public WebElement getOrgname() 
	{
		return orgname;
	}

}
