package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {


    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   // @FindBy(xpath = "//input[@id='select_all_files']")
   @FindBy(xpath = "(//th[@id='headerSelection'])[1]")
    public WebElement selectAllCheckBox;


    @FindBy(xpath = "//td[@class='selection']//input[@type='checkbox']")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIconButton;

    //@FindBy(xpath = "//span[.='Upload file']")
    //@FindBy(xpath = "//label[@data-action='upload']")
    @FindBy(xpath = "//div[@class='hiddenuploadfield']//input")
   // @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(css = "#file_upload_start")
    public WebElement hiddenFileUpload;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement commentInputBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement commentSubmit;


    @FindBy(xpath = "//button[normalize-space(text())='Settings']")
    public WebElement settingsButton;


    public void clickToActionIcon(String folderName){

        String actionFromFolder="//tr[@data-file='"+folderName+"']//a[@class='action action-menu permanent']";

        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath(actionFromFolder)).click();

    }

    public void clickToAnyAction(String actionName){

        String locatingActionOption="//div[@class='fileActionsMenu popovermenu bubble open menu']//span[.='"+actionName+"']";
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath(locatingActionOption)).click();


    }

    public void clickToLeftSideSubModule(String subModuleName){

        String locateSubModule="//a[.='"+subModuleName+"']";

        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath(locateSubModule)).click();


    }

    public void clickToOptionUnderAddIcon(String optionName){

        String locateOption="//span[.='"+optionName+"']";
        Driver.getDriver().findElement(By.xpath(locateOption)).click();

    }

    public void clickOnOptionUnderDetails(String optionName){

        optionName=optionName.toLowerCase();
        String locateAnOption="//a[contains(@id,'"+optionName+"')]";
        Driver.getDriver().findElement(By.xpath(locateAnOption)).click();

    }

    public void verifyIfTheMessageIsDisplayed(String expectedMessage){

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//div[.='"+expectedMessage+"'])[1]")).isDisplayed());


    }






}
