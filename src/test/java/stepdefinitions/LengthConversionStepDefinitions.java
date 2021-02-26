package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.LengthDataModel;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.ConvertLengthUnits;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LengthConversionStepDefinitions {

    @Before
    public void ConfiguracionInicial() {
        setTheStage(new OnlineCast());
    }

    @When("^the user introduces the data to make length conversion$")
    public void theUserIntroducesTheDataToMakeLenghtConversion(List<LengthDataModel> lengthData) {
        theActorCalled("user").wasAbleTo(
                ConvertLengthUnits.with(lengthData)
        );

    }

    @Then("^he validates the lenght \"([^\"]*)\"$")
    public void heValidatesTheLenght(String arg1) {

    }
}
