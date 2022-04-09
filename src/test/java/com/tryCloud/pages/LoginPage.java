package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement inputUserName;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    public void login(String userName, String password){

        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));

        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginButton.click();

    }

    public void login(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        inputUserName.sendKeys(ConfigurationReader.getProperty("username3"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }


}
