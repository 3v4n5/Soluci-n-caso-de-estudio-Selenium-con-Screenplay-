package com.co.qvision.questions;

import com.co.qvision.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateName implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MenuComponent.LBL_NAME).viewedBy(actor).asString();
    }

    public static ValidateName compare()
    {
        return new ValidateName();
    }
}
