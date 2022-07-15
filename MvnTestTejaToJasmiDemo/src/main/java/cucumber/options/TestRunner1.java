package cucumber.options;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/AN574BV/eclipse-workspace/MvnTestTejaToJasmiDemo/src/main/java/features",glue= {"stepSefinitions"},plugin={"html:target/destination"})
public class TestRunner1 {
	
	}
