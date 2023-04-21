/*
 * Copyright © 2023 Mirada Medical Ltd.
 * All Rights Reserved.
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Test runner for Cucumber tests.
 *
 * @author lottie.thomas
 */
@RunWith( Cucumber.class )
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
   features = {"src/test/resources"
   }
)
public class RunCucumberTests
{

}
