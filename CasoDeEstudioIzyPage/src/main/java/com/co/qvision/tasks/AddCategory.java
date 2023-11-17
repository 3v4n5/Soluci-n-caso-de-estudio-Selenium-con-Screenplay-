package com.co.qvision.tasks;

import com.co.qvision.interactions.WaitElement;
import com.co.qvision.models.DataCategory;
import com.co.qvision.userinterfaces.MenuComponent;
import com.co.qvision.userinterfaces.PostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddCategory implements Task {
    DataCategory dataCategory;

    public AddCategory(DataCategory dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_MENU),
                Click.on(MenuComponent.BTN_POST),
                WaitElement.untilAppears(PostPage.BTN_LIST_POST),
                Click.on(PostPage.BTN_LIST_POST),
                Click.on(PostPage.BTN_CREATE_CATEGORY),
                Enter.theValue(dataCategory.getCategory()).into(PostPage.TXT_CATEGORY_NAME),
                Enter.theValue(dataCategory.getSubcategory()).into(PostPage.TXT_CATEGORY_DESCRIPTION),
                Click.on(PostPage.RDB_DIFFICULT),
                Click.on(PostPage.BTN_SUBMIT_CATEGORY));

    }

    public static AddCategory create(DataCategory dataCategory) {
        return Tasks.instrumented(AddCategory.class, dataCategory);
    }


}
