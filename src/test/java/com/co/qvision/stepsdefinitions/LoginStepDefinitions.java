package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.credentials;
import com.co.qvision.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinitions {


        @Managed
        WebDriver hisBrowser;

        @Before
        public void setUp(){


            OnStage.setTheStage(new OnlineCast());
            OnStage.theActorCalled("Santiago");
            OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

        }
        @Given("^the user needs to login$")
        public void theUserNeedsToLogin() {
            OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

        @When("^the user enter data$")
        public void theUserEnterData(List<credentials> credentialsList) {
            credentials credentials;
            credentials = credentialsList.get(0);
            OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Then("^register successful$")
        public void registerSuccessful() {

        }


    }

