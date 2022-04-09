package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;


    public void clickingToMenuModule(String moduleName){

       // String locatingModule="(//a[@class='active'])[1]//span[normalize-space()='"+moduleName+"']";
        String locatingModule="(//a[@aria-label='"+moduleName+"'])[1]";


        BrowserUtils.sleep(10);
        Driver.getDriver().findElement(By.xpath(locatingModule)).click();

    }


}
