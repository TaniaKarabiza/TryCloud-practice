package com.tryCloud.step_definitions;

import com.tryCloud.pages.*;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US8_DeleteFileFolder_StepDefinitions {


    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();
    FilesPage filesPage=new FilesPage();
    FavoritesPage favoritesPage=new FavoritesPage();
    DeletedFilesPage deletedFilesPage=new DeletedFilesPage();

/*
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        loginPage.login();

    }


    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String moduleName) {

        dashboardPage.clickingToMenuModule(moduleName);


    }

    @When("the users click action-icon from any file on the page to remove")
    public void theUsersClickActionIconFromAnyFileOnThePageToRemove() {

        filesPage.clickToActionIcon("Talk");
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String actionOption) {

        filesPage.clickToAnyAction(actionOption);

    }

    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String subModuleName) {

        filesPage.clickToLeftSideSubModule("submoduleName");

    }


 */


    @Then("Verify the deleted file is displayed on the page.")
    public void verifyTheDeletedFileIsDisplayedOnThePage() {

        BrowserUtils.sleep(5);
        //Assert.assertTrue(deletedFilesPage.locatingAnyDeletedFile("Tasks").isDisplayed());

        deletedFilesPage.locatingAnyDeletedFile("Tasks");
    }



}
