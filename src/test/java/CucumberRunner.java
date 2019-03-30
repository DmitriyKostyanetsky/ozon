import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/feature/"},
        glue = {"steps"},
        tags = {"@web"},
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
        )
public class CucumberRunner { }