package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PostPage {

    public static final Target BTN_LIST_POST = Target.the("click list post")
            .locatedBy("//button[@class='accordion-button collapsed']");

    public static final Target BTN_CREATE_CATEGORY = Target.the("click category")
            .locatedBy("//*[@id='effect-button']");

    public static final Target TXT_CATEGORY_NAME = Target.the("Enter category")
            .locatedBy("//*[@name='CategorieName']");

    public static final Target TXT_CATEGORY_DESCRIPTION = Target.the("Enter description")
            .locatedBy("//*[@name='descriptionCategory']");

    public static final Target RDB_DIFFICULT = Target.the("Enter difficulty")
            .locatedBy("//input[@id='flexRadioDefault2' and @value='Medium']");

    public static final Target BTN_SUBMIT_CATEGORY = Target.the("click crear")
            .locatedBy("//*[@id='effect-button']");

    public static final Target LBL_NAME_CATEGORY = Target.the("capturar texto")
            .locatedBy("//*[text()='{0} ']");


}
