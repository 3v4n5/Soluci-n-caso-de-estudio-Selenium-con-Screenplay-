package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.DataRegister;
import com.co.qvision.questions.ValidateName;
import com.co.qvision.tasks.Register;
import com.co.qvision.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://izyacademy.com:8000/"));
    }

    @When("^he user enter de data for the register$")
    public void heUserEnterDeDataForTheRegister(List<DataRegister> dataRegisterList) {
        DataRegister dataRegister;
        dataRegister = dataRegisterList.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(Register.enter(dataRegister));
    }

    @Then("^he user could see the username$")
    public void heUserCouldSeeTheUsername() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateName.compare()
                , Matchers.is(Constants.COMPARE_NAME)));

    }
}
