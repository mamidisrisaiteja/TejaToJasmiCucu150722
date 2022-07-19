package cucumber.options;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\AN574BV\\git\\TejaToJasmiCucu1507221713\\TejaToJasmiCucu150722\\MvnTestTejaToJasmiDemo\\src\\test\\java\\features",glue= {"stepSefinitions"},plugin= "json:src/tes/java/reports/cucumber-reports/CucumberTestReport.json")
public class TestRunner1 {
	
	
	
	}
