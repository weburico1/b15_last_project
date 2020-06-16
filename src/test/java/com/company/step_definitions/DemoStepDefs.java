package com.company.step_definitions;

import com.company.utilities.ConfigurationReader;
import com.company.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class DemoStepDefs {
    @Given("I go to application")
    public void i_go_to_application() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @Then("It should be there")
    public void it_should_be_there() {
        assertEquals("Practice", Driver.getDriver().getTitle());


    }

}
