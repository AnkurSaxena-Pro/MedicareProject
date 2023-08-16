package com.medicare.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature", 
glue = "com.medicare.testscripts")

public class TestRunner extends AbstractTestNGCucumberTests {

}
