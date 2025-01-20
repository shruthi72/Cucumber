package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/Features",glue="stepDefinitions",monochrome=true,
tags="@SmokeTest or @RegressionTest or @NetBanking",plugin= {"pretty","html:target/cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
