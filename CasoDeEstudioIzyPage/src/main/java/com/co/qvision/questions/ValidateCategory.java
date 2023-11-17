package com.co.qvision.questions;

import com.co.qvision.userinterfaces.PostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateCategory implements Question<String> {
   String category;

    public ValidateCategory(String category) {
        this.category = category;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PostPage.LBL_NAME_CATEGORY.of(category)).viewedBy(actor).asString();
    }

    public static ValidateCategory compare(String category)
    {
        return new ValidateCategory(category);
    }
}
