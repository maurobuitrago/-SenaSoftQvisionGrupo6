package com.co.qvision.stepsdefinitions;


import com.co.qvision.tasks.Navigate;
import com.co.qvision.tasks.Recorrido;
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

public class NavigateStepDefinitions {
    private Actor jonathan =Actor.named("Jonathan");
    @Managed
    WebDriver hisDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        jonathan.can(BrowseTheWeb.with(hisDriver));

    }
    @Given("^the user is on the page$")
    public void theUserIsOnThePage() {
        jonathan.wasAbleTo(Open.url("https://www.bon-bonite.com/"));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    @When("^the user navigate in all items of sidebar$")
    public void theUserNavigateInAllItemsOfSidebar() {
        jonathan.attemptsTo(Navigate.navegar());
    }


    @Then("^he would finish to navigate$")
    public void heWouldFinishToNavigate() {
        JOptionPane.showMessageDialog( null,this.jonathan+" navego por la pagina zapatos");

    }



}
