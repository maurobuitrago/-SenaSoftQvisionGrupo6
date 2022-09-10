package com.co.qvision.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {

    @Managed
    WebDriver hisDriver;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jonathan");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^The user is about to join$")
    public void theUserIsAboutToJoin() {

    }


    @When("^he enter the credentials$")
    public void heEnterTheCredentials() {

    }

    @Then("^he join successful$")
    public void heJoinSuccessful() {

    }


}
