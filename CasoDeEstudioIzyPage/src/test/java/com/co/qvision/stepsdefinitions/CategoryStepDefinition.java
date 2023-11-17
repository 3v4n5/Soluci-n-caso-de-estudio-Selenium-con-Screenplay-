package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.DataCategory;
import com.co.qvision.questions.ValidateCategory;
import com.co.qvision.tasks.AddCategory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class CategoryStepDefinition {

    @When("^he user enter de data for the category$")
    public void heUserEnterDeDataForTheCategory(List<DataCategory>dataCategoryList) {
        DataCategory dataCategory;
        dataCategory=dataCategoryList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(AddCategory.create(dataCategory));
    }

    @Then("^he could see the category (.*)$")
    public void heCouldSeeTheCategory(String category) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCategory.compare(category)
        , Matchers.is(category)));
    }

}
