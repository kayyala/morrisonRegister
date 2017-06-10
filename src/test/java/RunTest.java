import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sudhakar on 04/06/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty","html:target/sudhakar-html-report",
        "json:target/kayyala.json"}
        ,tags = {"@Register"}
)
public class RunTest {
}
