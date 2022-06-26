package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.DriverUtil;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber",
        "json:target/cucumber-report.json"},
        // tells runner where to pick features to run
        features = {"./src/test/resources"},
        tags = {"@Test"},
        glue = {"steps"},
        monochrome = true
)

public class RunnerClass {
// This method starts the section by opening the browser
    @BeforeClass
    public static void startSession(){
        DriverUtil driverUtil = new DriverUtil();
        driverUtil.setDriver("firefox");
    }


    }

