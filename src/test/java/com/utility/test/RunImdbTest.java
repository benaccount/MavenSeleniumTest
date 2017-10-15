package com.utility.test;
import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber.json",
        overviewReport = true,
        detailedReport = true,
        outputFolder = "./target",
        toPDF = true)
@CucumberOptions(features="./src/test/features/features/", 
        glue={"com.utility.test"},
        plugin={ "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber-results.xml"},
        tags = {"~@ignore"}

)
public class RunImdbTest {

}

//
//@RunWith(ExtendedCucumber.class)
//@ExtendedCucumberOptions(
//        jsonReport = "target/cucumber.json",
//        overviewReport = true,
//        detailedReport = true,
//        outputFolder = "./target",
//        toPDF = true)
//@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report"},
//glue = {""} )
//public class RunImdbTest {
//
//}

//features = {"src/test/resources/features"},
//format = {
//        "json:target/cuera/cuera-report.json",
//        "html:target/cuera/cuera-report"
//},
//glue = {""}

//@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report"})
//public class RunImdbTest {
//}
