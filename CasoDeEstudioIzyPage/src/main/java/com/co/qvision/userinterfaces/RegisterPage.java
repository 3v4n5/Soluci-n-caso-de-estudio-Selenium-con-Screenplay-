package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target TXT_USERNAME = Target.the("Ingresar Username")
            .locatedBy("//*[@name='username']");

    public static final Target TXT_NAME = Target.the("Ingresar name")
            .locatedBy("//*[@name='name']");

    public static final Target CBM_COUNTRY = Target.the("Ingresar country")
            .locatedBy("//*[@name='pais']");

    public static final Target TXT_CITY = Target.the("Ingresar city")
            .locatedBy("//*[@name='city']");

    public static final Target TXT_ID = Target.the("Ingresar ID")
            .locatedBy("//*[@name='numberidentification']");

    public static final Target TXT_PHONE = Target.the("Ingresar Phone")
            .locatedBy("//*[@name='phone']");

    public static final Target TXT_EMAIL = Target.the("Ingresar Email")
            .locatedBy("//*[@name='email']");

    public static final Target TXT_PASSWORD = Target.the("Ingresar password")
            .locatedBy("//*[@name='password']");

    public static final Target TXT_VERIFY_PASSWORD = Target.the("Ingresar verify password")
            .locatedBy("//*[@name='password_confirmation']");

     public static final Target BTN_SUBMIT_REGISTER = Target.the("click submit")
            .locatedBy("//*[@id='effect-button']");



}
