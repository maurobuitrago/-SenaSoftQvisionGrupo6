package com.co.qvision.tasks;

import com.co.qvision.models.LoginCredentials;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    LoginCredentials loginCredentials;

    public Login(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        actor.attemptsTo(Click.on(LoginPage.btn_account));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        actor.attemptsTo(Enter.theValue(loginCredentials.getUsername()).into(LoginPage.txt_username));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        actor.attemptsTo(Enter.theValue(loginCredentials.getPassword()).into(LoginPage.txt_password));
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(LoginPage.btn_login));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Login enter(LoginCredentials loginCredentials){
        return Tasks.instrumented(Login.class, loginCredentials);
    }


}
