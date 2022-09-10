package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.NavigatePage;
import com.co.qvision.userinterfaces.RecorridoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Navigate implements Task {


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(NavigatePage.btn_sidebar));
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(NavigatePage.btn_zapatos));
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(NavigatePage.btn_zap_todos));
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(NavigatePage.move_zap_scroll_down_1));
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(NavigatePage.move_zap_scroll_down_2));
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(NavigatePage.move_zap_scroll_down_3));
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(NavigatePage.move_zap_scroll_down_4));
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(NavigatePage.move_zap_scroll_down_5));
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(NavigatePage.move_zap_scroll_down_6));
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(NavigatePage.btn_bot_bar));
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


    }

    public static Navigate navegar(){
        return Tasks.instrumented(Navigate.class);
    }

}
