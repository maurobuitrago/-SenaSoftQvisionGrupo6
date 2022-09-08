package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target btn_Register = Target.the("enter accounts")
            .locatedBy("//div[@class='myaccount']");
    public static final Target TXT_Username = Target.the("enter username")
            .locatedBy("//input[@id='reg_username']");
    public static final Target TXT_Email = Target.the("enter username")
            .locatedBy("//input[@id='reg_email']");
    public static final Target TXT_Password = Target.the("enter username")
            .locatedBy("//input[@id='reg_password']");
    public static final Target Btn_Signup = Target.the("enter username")
            .locatedBy("//button[text()='Acceder']");
    public static final Target check_box = Target.the("Chechk box")
            .locatedBy("//input[@id='newsletter_authorization']");
    public static final Target check_box2=  Target.the("Chechk box2")
            .locatedBy("//input[@id='privacy_policy_reg']");




}
