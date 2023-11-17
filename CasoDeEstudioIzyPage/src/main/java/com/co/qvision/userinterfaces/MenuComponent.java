package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class MenuComponent {

    public static final Target BTN_MENU = Target.the("click menu")
            .locatedBy("//div[@id='toogle_menu']");

    public static final Target BTN_REGISTER = Target.the("click Register")
            .locatedBy("//a[@id='Register']");

    public static final Target LBL_NAME = Target.the("Capture name")
            .locatedBy("//span[@class='dropdown-item fw-normal fs-6 ms-1']");

    public static final Target BTN_NAME = Target.the("click name")
            .locatedBy("//div[@id='user']");

    public static final Target BTN_POST = Target.the("click post")
            .locatedBy("//a[contains(@href,'http://izyacademy.com:8000/post')]");


}
