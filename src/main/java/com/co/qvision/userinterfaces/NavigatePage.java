package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NavigatePage {
    public static final Target btn_sidebar = Target.the("push sliderbar")
            .locatedBy("//*[@id=\"burger\"]");
    public static final Target btn_zapatos = Target.the ("push todos")
            .locatedBy("//*[@id=\"menu-item-17053\"]/a");
    public static final Target btn_zap_todos = Target.the ("enter Page zapatos")
            .locatedBy("//*[@id=\"menu-item-17057\"]/a");

    public static final Target btn_zap_exit = Target.the ("Exit sidebar")
            .locatedBy("//*[@id='burger']");

    public static final Target move_zap_scroll_down_1 = Target.the("down botton page")
            .locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[3]");
    public static final Target move_zap_scroll_down_2 = Target.the("down botton page")
            .locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[6]");
    public static final Target move_zap_scroll_down_3 = Target.the("down botton page")
            .locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[9]");
    public static final Target move_zap_scroll_down_4 = Target.the("down botton page")
            .locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[12]");
    public static final Target move_zap_scroll_down_5 = Target.the("down botton page")
            .locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[15]");
    public static final Target move_zap_scroll_down_6 = Target.the("down botton page")
            .locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[18]");

    public static final Target btn_bot_bar = Target.the("push botton bar")
            .locatedBy("//*[@id=\"wrapper\"]/nav/ul/li[2]");



}
