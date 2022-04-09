package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoritesPage {

    public FavoritesPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void verifyingTheFileIsInFavorites(String fileName){


        BrowserUtils.sleep(5);
        String locatingTheFile="(//tbody//tr//td//span[.='"+fileName+"'])[4]";

       // BrowserUtils.sleep(5);
        WebElement locatingTheFileAsAnElement=Driver.getDriver().findElement(By.xpath(locatingTheFile));
        Assert.assertTrue(locatingTheFileAsAnElement.isDisplayed());


    }

    public void verifyingTheTitleIsRemovedFromFavorites(String fileName){

        try {
            BrowserUtils.sleep(5);
            String locatingTheFile="(//tbody//tr//td//span[.='"+fileName+"'])[4]";
            WebElement locatingTheFileAsAnElement=Driver.getDriver().findElement(By.xpath(locatingTheFile));
            Assert.assertTrue(!(locatingTheFileAsAnElement.isDisplayed()));
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }



    }

}
