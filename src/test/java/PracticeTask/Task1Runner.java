package PracticeTask;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature",glue = "TestCase1",dryRun = false,plugin = {"pretty"})

public class Task1Runner {




}
