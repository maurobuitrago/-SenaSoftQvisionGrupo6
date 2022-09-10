package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.LoginCredentials;
import com.co.qvision.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.List;

public class LoginStepDefinitions {
    private Actor jonathan = Actor.named("Jonathan");
    @Managed
    WebDriver hisDriver;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        jonathan.can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^The user is about to join$")
    public void theUserIsAboutToJoin() {
        jonathan.wasAbleTo(Open.url("https://www.bon-bonite.com"));
    }


    @When("^he enter the credentials$")
    public void heEnterTheCredentials(List<LoginCredentials> credentialsList) {
        LoginCredentials loginCredentials;
        loginCredentials = credentialsList.get(0);
        jonathan.attemptsTo(Login.enter(loginCredentials));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^he join successful$")
    public void heJoinSuccessful() {
        JOptionPane.showMessageDialog(null,this.jonathan+" pudo entrar en la plataforma");
    }
    @Then("^he cant join on platform$")
    public void heCantJoinOnPlatform() {
        JOptionPane.showMessageDialog(null,this.jonathan+" no pudo entrar en la plataforma");
    }

}
