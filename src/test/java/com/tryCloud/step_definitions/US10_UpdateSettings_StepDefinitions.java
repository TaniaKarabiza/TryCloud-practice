package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.File;

public class US10_UpdateSettings_StepDefinitions {

    FilesPage filesPage=new FilesPage();

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {

        filesPage.settingsButton.click();

    }


    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {



    }

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {

    }

    @And("user  uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {

    }

    @And("user refresh the page")
    public void userRefreshThePage() {

    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {
    }
}
