package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target btn_account = Target.the("join the accounts")
            .locatedBy("//div[@class='myaccount']");
    public static final Target txt_username = Target.the("enter credential username")
            .locatedBy("//*[@id=\"username\"]");

    public static final Target txt_password = Target.the ("enter credential password")
            .locatedBy("//*[@id=\"password\"]");

    public static final Target btn_login = Target.the("login into")
            .locatedBy("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button");
}
