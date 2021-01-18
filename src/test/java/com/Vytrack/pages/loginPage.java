package com.Vytrack.pages;

import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "prependedInput")
    @CacheLookup
    public WebElement UserNameBox;

    @FindBy(id = "prependedInput2")
    @CacheLookup
    public WebElement UserPasswordBox;

    @FindBy(id = "_submit")
    @CacheLookup
    public WebElement LoginButton;

    public void login(String username, String password){

        UserNameBox.sendKeys(username);
        UserPasswordBox.sendKeys(password);
        LoginButton.click();

    }

    public void loginAsDriver(){
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        UserNameBox.sendKeys(username);
        UserPasswordBox.sendKeys(password);
        LoginButton.click();

    }





}
