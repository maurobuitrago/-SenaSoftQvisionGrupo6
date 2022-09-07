package com.co.qvision.tasks;

import com.co.qvision.interactions.WaitElement;
import com.co.qvision.models.credentials;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    credentials credentials;

    public Login(credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getId_User()).into(LoginPage.TXT_ID));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASS));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.BTN_LOGIN));
        //Esto es una espera Explicita: actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }


    public static Login enter(credentials credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }

}