package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FavoritesPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US5_AddAnyFileToFavorites_StepDefinitions {

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

    @When("the user clicks action-icon  from any file on the page {string}")
    public void theUserClicksActionIconFromAnyFileOnThePage(String fileName) {

        filesPage.clickToActionIcon(fileName);


    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String actionOption) {

        filesPage.clickToAnyAction(actionOption);

    }

    @And("user clicks the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String subModuleName) {

        filesPage.clickToLeftSideSubModule(subModuleName);

    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {

        String expectedFile="Talk";
        favoritesPage.verifyingTheFileIsInFavorites(expectedFile);



    }
}
