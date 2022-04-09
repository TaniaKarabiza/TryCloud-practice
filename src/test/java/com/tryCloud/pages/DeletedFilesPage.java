package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DeletedFilesPage {
    public DeletedFilesPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void locatingAnyDeletedFile(String fileName){

        String locateFile="(//span[.='"+fileName+"'])[1]";
        Assert.assertTrue( Driver.getDriver().findElement(By.xpath(locateFile)).isDisplayed());



    }


}
