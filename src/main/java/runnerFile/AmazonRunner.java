package runnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/featureFile"},
        glue = {"stepDefinationFile"},
        tags = "@TestCase5",
        plugin = {
                "pretty",
                "html:target/AmznHtmlReport.html",
                "json:target/AmznJsonReport.json",
                "junit:target/AmznJunitReport.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class AmazonRunner {
}
