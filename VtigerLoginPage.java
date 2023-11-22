package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VtigerLoginPage 
{
	
	
	@FindBy(name="user_name")
	private WebElement username;
	//we cannot acces the webelemnt in any class of same pkg
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	
	//user should not do anymodification  that perpose we use getterd method
	public WebElement getUsername() 
	
	{
		return username;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getLoginbutton() 
	{
		return loginbutton;
	}

	
	
	
	

}
