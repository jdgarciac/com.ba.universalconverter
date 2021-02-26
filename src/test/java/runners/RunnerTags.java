package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/UniversalConverter.feature",
        snippets = SnippetType.CAMELCASE,
        tags = "@convert_length_android",
        glue = "stepdefinitions"
)

public class RunnerTags {
}
