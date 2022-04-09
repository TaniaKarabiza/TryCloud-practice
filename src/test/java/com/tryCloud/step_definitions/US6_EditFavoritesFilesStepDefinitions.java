package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FavoritesPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;

public class US6_EditFavoritesFilesStepDefinitions {

    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();
    FilesPage filesPage=new FilesPage();
    FavoritesPage favoritesPage=new FavoritesPage();
/*
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        loginPage.login();

    }


    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String moduleName) {

        dashboardPage.clickingToMenuModule(moduleName);


    }

*/

    @When("the users click action-icon from any file {string} on the page to remove")
    public void theUsersClickActionIconFromAnyFileOnThePageToRemove(String fileName) {

        filesPage.clickToActionIcon("Talk");
    }
    /*
    @And("user choose the {string} option")
    public void userChooseTheOption(String actionOption) {

        filesPage.clickToAnyAction(actionOption);

    }

     @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String subModuleName) {

        filesPage.clickToLeftSideSubModule("submoduleName");

    }

     */
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verifyThatTheFileIsRemovedFromTheFavoritesSubModuleSTable() {
        String expectedFile="Talk";

        favoritesPage.verifyingTheTitleIsRemovedFromFavorites(expectedFile);

    }

    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
       filesPage.addIconButton.click();
        
    }

    @And("users uploads file with the {string} option")
    public void usersUploadsFileWithTheUploadFileOption(String option){

        /*
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

       // js.executeScript("document.querySelector(\"div[class='hiddenuploadfield']\").style.display='block'");
       // js.executeScript("document.querySelector('div[class=hiddenuploadfield']>input').style.display='block'");
      //  WebElement el=Driver.getDriver().findElement(By.cssSelector("div[class='hiddenuploadfield']"));
        BrowserUtils.sleep(6);
        WebElement el=Driver.getDriver().findElement(By.xpath("//div[@class='hiddenuploadfield']//input"));
        BrowserUtils.sleep(6);
       // ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();",el);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.visibility='visible';",el);
        BrowserUtils.sleep(6);
        el.sendKeys("\"C:\\Users\\tania\\OneDrive\\Рабочий стол\\Selenium.txt\"");

       // js.executeScript("arguments[0].sendKeys("\"C:\Users\tania\OneDrive\Рабочий стол\Selenium.txt\""),el);
       // js.executeScript("arguments[0].display='block';",el);
       // el.sendKeys("\"C:\\Users\\tania\\OneDrive\\Рабочий стол\\Selenium.txt\"");


       // el.click();

       //filesPage.uploadFile.click();
       // Driver.getDriver().switchTo().activeElement().sendKeys(getFile());
        //filesPage.uploadFile.sendKeys("\"C:\\Users\\tania\\OneDrive\\Рабочий стол\\Selenium.txt\"");

        BrowserUtils.sleep(5);



        //"Selenium.txt"

         */

        BrowserUtils.waitFor(5);
        filesPage.hiddenFileUpload.sendKeys("C:\\Users\\tania\\OneDrive\\Рабочий стол\\Selenium.txt");

    }

    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {




    }
    String getFile(){

        return new File("\"C:\\Users\\tania\\OneDrive\\Рабочий стол\\Selenium.txt\"").getAbsolutePath();

    }


}
