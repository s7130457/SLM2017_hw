package test.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeni on 2017/3/1.
 */


public class HelloStepdefs {
            Hello hello = null;
        String hi = null;
        @Given("^I have a greeting application with \"([^\"]*)\"$")
        public void iHaveAGreetingApplicationWith(String arg0) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            hello = new Hello(arg0);
         //   throw new PendingException();
        }


    @When("^I ask it to say hi$")
    public void iAskItToSayHi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        hi = hello.sayHi();
        //throw new PendingException();
    }

    @Then("^I receive \"([^\"]*)\"$")
    public void iReceive(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg0,hi);
       // throw new PendingException();
    }
}
