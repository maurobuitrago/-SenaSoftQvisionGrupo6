package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.RegisterCredentials;
import com.co.qvision.tasks.Register;
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

public class RegisterStepDefinitions {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){


        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Santiago");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }
    @Given("^correct intro$")
    public void theUserNeedToLogin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/?utm_source=google&utm_medium=cpc&utm_campaign=Bonbonite_Google_Search_Brand&utm_term=%7Bkeywords%3A%7D&utm_content=ad_text_marca&gclid=Cj0KCQjw39uYBhCLARIsAD_SzMQWAEfU3kZyuIwGm8_icPApQzqJkrTT7gCv-S-uQPZAUnHR_R0OT1QaAoz4EALw_wcB"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("^enter the variables")
    public void theUserLooksAtTheProducts(List<RegisterCredentials> credentialsList) {
            RegisterCredentials variables;
            variables = credentialsList.get(0);
            OnStage.theActorInTheSpotlight().attemptsTo(Register.enter(variables));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    @Then("^finish$")
    public void buyAProduct() {
        System.out.println("Variable 'Then' confirmado como completado");
    }

}
