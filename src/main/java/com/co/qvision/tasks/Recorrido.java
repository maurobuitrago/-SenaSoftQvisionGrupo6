package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.RecorridoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Recorrido implements Task {
    Credentials credentials;
    public Recorrido(Credentials credentials) {
        this.credentials = credentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RecorridoPage.btn_account));
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(RecorridoPage.TXT_Username));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(RecorridoPage.TXT_Password));
        actor.attemptsTo(Click.on(RecorridoPage.Btn_Login));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(RecorridoPage.btn_accesorios));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(RecorridoPage.btn_bolsos));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(RecorridoPage.val_button));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(RecorridoPage.val_button));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(RecorridoPage.scroll1));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(RecorridoPage.fin_button));
    }
    public static Recorrido enter (Credentials credentials){
        return Tasks.instrumented(Recorrido.class,credentials);
    }
}

