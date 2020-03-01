package walmart.Runner;

import java.io.File;

import org.junit.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resource/WalmartFeatureFile" }, glue = { "walmart.StepDef",
			"walmart.Utilities" }, tags = { "@regression" }, plugin = { "pretty", "html:target/cucumber-htmlreport",
					"json:target/cucumber-report.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

	public class Runner extends AbstractTestNGCucumberTests {

		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("/config/config.xml"));

		

	
		}
}
