package com.co.qvision.tasks;

import com.co.qvision.models.RegisterCredentials;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
    RegisterCredentials variables;
    public Register(RegisterCredentials variables) {
        this.variables = variables;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(RegisterPage.btn_Register));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(variables.getUsername()).into(RegisterPage.TXT_Username));
        actor.attemptsTo(Enter.theValue(variables.getEmail()).into(RegisterPage.TXT_Email));
        actor.attemptsTo(Enter.theValue(variables.getPassword()).into(RegisterPage.TXT_Password));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(RegisterPage.check_box));
        actor.attemptsTo(Click.on(RegisterPage.check_box2));
        actor.attemptsTo(Click.on(RegisterPage.Btn_Signup));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static Register enter (RegisterCredentials variables){
        return Tasks.instrumented(Register.class,variables);
    }
}
