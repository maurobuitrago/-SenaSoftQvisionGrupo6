package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RecorridoPage {
    public static final Target btn_account = Target.the("enter accounts")
            .locatedBy("//div[@class='myaccount']");
    public static final Target TXT_Username = Target.the("enter username")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_Password = Target.the("enter username")
            .locatedBy("//input[@id='password']");
    public static final Target Btn_Login = Target.the("enter username")
            .locatedBy("//button[text()='Acceder']");
    public static final Target btn_accesorios=Target.the("Accesorios")
            .locatedBy("//*[@id='menu-item-8']");

    public static final Target btn_bolsos=Target.the("bolsos")
            .locatedBy("//*[@class=\"woocommerce-LoopProduct-link woocommerce-loop-product__link\"]");
    public static final Target val_button=Target.the("Comprar Ahora")
            .locatedBy("//*[@class=\"buy_now_link\"]");
    public static final Target scroll1=Target.the("div")
            .locatedBy("//*[@class=\"cart-collaterals\"]");
    public static final Target fin_button=Target.the("Finalizar Compra")
            .locatedBy("//*[@class=\"checkout-button button alt wc-forward\"]");


}
