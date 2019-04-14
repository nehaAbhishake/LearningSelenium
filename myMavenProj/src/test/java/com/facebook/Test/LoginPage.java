package com.facebook.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver ldriver) 
	{
		this.driver = ldriver;
	}

	@FindBy(how = How.ID,using = "email")
	WebElement uName;
	
	@FindBy(how = How.ID,using = "")
	WebElement pwd;
	
	@FindBy(how=How.ID,using = "u_0_2")
	WebElement LoginButton;
}
