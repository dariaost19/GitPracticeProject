package PracticeTask;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature",glue = "TestCase1",dryRun = true,plugin = {"pretty"},tags = "@Test1")

public class Task1Runner {




}
