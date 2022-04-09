package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FavoritesPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US9_WriteCommentsToFiles_StepDefinitions {

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

    @When("the user clicks action-icon  from any file on the page {string}")
    public void theUserClicksActionIconFromAnyFileOnThePage(String fileName) {

        filesPage.clickToActionIcon(fileName);


    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String actionOption) {

        filesPage.clickToAnyAction(actionOption);

    }

     */

    @And("user write a comment inside the input box")
    public void userWriteACommentInsideTheInputBox() {
        filesPage.clickOnOptionUnderDetails("Comments");
        filesPage.commentInputBox.sendKeys("Hello");
        BrowserUtils.sleep(5);


    }


    @And("user click the submit button to post it")
    public void userClickTheSubmitButtonToPostIt() {

        filesPage.commentSubmit.click();
        BrowserUtils.sleep(2);
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verifyTheCommentIsDisplayedInTheCommentSection() {
      filesPage.verifyIfTheMessageIsDisplayed("Hello");

    }


}
