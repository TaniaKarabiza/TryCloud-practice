package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class US4_AccessingFilesModule_StepDefinitions {

  DashboardPage dashboardPage=new DashboardPage();
  LoginPage loginPage=new LoginPage();
  FilesPage filesPage=new FilesPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

      loginPage.login();

    }


  @When("the user clicks the {string} module")
  public void theUserClicksTheModule(String moduleName) {

      dashboardPage.clickingToMenuModule(moduleName);


  }

  @Then("verify the page title is \"Files - Trycloud QA.\"")
  public void verifyThePageTitleIsFilesTrycloudQA(){

      String expectedTitle="Files - Trycloud QA.";
    BrowserUtils.sleep(10);
    Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

}

  @And("user click the top-left checkbox of the table")
  public void userClickTheTopLeftCheckboxOfTheTable() {

      BrowserUtils.sleep(2);
      filesPage.selectAllCheckBox.click();


  }

  @Then("verify all the files are selected")
  public void verifyAllTheFilesAreSelected() {
    for (WebElement each : filesPage.checkBoxes) {
      Assert.assertTrue(each.isSelected());

    }


  }

  }
