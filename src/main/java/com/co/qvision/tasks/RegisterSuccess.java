package com.co.qvision.tasks;

import com.co.qvision.interactions.WaitElement;
import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterSuccess implements Task {

    Credentials credentials;

    public RegisterSuccess(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getId_User()).into(RegisterPage.TXT_ID));
        actor.attemptsTo(Enter.theValue(credentials.getEmail()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(WaitElement.untilBeEnable(RegisterPage.BTN_LOGIN));
        //Esto es una espera Explicita: actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }


    public static RegisterSuccess enter(Credentials credentials) {
        return Tasks.instrumented(RegisterSuccess.class, credentials);
    }

}
