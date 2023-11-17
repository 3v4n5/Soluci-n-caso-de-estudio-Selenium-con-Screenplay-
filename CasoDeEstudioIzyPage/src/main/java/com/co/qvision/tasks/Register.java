package com.co.qvision.tasks;

import com.co.qvision.models.DataRegister;
import com.co.qvision.userinterfaces.MenuComponent;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.awt.*;

public class Register implements Task {

    DataRegister dataRegister;

    public Register(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_MENU),
                Click.on(MenuComponent.BTN_REGISTER),
                Enter.theValue(dataRegister.getUsername()).into(RegisterPage.TXT_NAME),
                Enter.theValue(dataRegister.getUsername()).into(RegisterPage.TXT_USERNAME),
                SelectFromOptions.byValue(dataRegister.getCountry()).from(RegisterPage.CBM_COUNTRY),
                Enter.theValue(dataRegister.getCity()).into(RegisterPage.TXT_CITY),
                Enter.theValue(dataRegister.getId()).into(RegisterPage.TXT_ID),
                Enter.theValue(dataRegister.getPhone()).into(RegisterPage.TXT_PHONE),
                Enter.theValue(dataRegister.getEmail()).into(RegisterPage.TXT_EMAIL),
                Enter.theValue(dataRegister.getPassword()).into(RegisterPage.TXT_PASSWORD),
                Enter.theValue(dataRegister.getVerifypassword()).into(RegisterPage.TXT_VERIFY_PASSWORD),
                Click.on(RegisterPage.BTN_SUBMIT_REGISTER),
                Click.on(MenuComponent.BTN_NAME));

    }


    public static Register enter(DataRegister dataRegister) {
        return Tasks.instrumented(Register.class, dataRegister);
    }
}
