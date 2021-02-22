package stepsDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/criar_cliente.feature",
        glue = {""}, monochrome = true, dryRun = false,
        plugin = {"pretty","html:target/cucumber-html-report"}
)
public class Runner {
}
