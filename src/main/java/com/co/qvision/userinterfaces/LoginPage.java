package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_CLICK_ACC = Target.the("enter accounts")
            .locatedBy("//div[@class='myaccount']");
    public static final Target TXT_ID = Target.the("enter username")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_PASS = Target.the("enter username")
            .locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN = Target.the("Intro")
            .locatedBy("//button[text()='Acceder']");



}
