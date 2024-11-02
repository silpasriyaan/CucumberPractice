package cucumber_runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:\\Users\\LENOVO\\workspace\\CucumberPractice\\feature\\Rbg.feature"
, glue="cucumber_step")
public class RunnerDemo1 {

}
