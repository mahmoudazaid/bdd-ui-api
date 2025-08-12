package com.orange.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
  features = "src/test/resources/features",
  glue = "com.orange",
  plugin = { "pretty", "json:target/cucumber.json" }
)
public class TestRunner extends AbstractTestNGCucumberTests {}
