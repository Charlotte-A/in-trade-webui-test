import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
                monochrome = true,  //Make text on the console readable
                plugin = {"pretty",
                    "html:target/test-report/report-html",
                    "json:target/test-report/report-json.json",
                    "junit:target/test-report/report-xml.xml"},

                strict = false,  //Skip execution of pending
                features = {""},
                snippets = SnippetType.CAMELCASE,
                glue = {""},
                tags = {""}

)


public class RunnersCukeTest {
}
