package com.company.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/resources/features/Demo.feature",
        glue = "com/company/step_definitions",
        tags = "@demo"

)


public class CukesRunner {
}
