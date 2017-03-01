package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jeni on 2017/3/1.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/hello_world.feature",
        glue = {"steps"})
public class GreetingTest {
}
