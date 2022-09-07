package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/userRegisterSuccess.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.qvision.stepsdefinitions"

)
public class RegisterSuccessRunner {

}
