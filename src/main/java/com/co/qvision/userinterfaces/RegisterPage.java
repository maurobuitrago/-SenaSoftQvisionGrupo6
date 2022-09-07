package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target btn_account = Target.the("enter accounts")
            .locatedBy("//*[@id=\"wrapper\"]/header/div[1]/div[2]/div[1]/a");
    public static final Target TXT_ID = Target.the("enter username")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_EMAIL = Target.the("enter username")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_PASSWORD = Target.the("enter username")
            .locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN = Target.the("enter username")
            .locatedBy("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button");



}
