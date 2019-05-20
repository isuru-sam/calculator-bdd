package com.math.calculator.features.steps;

import com.math.calculator.features.steps.serenity.CalculatorUserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CalculatorStepDefinitions {
@Steps
CalculatorUserSteps calclator;

@Given("^I input (\\d+) and (\\d+) numbers$")
public void setInput(int x,int y) {
	calclator.setInput(x, y);
}

@When("^I perform add operation$")
public void performAdd() {
	calclator.performAdd();
}

@Then("^I should get (\\d+) as answer$")
public void resultsForACategoryAndKeywordInARegion(int result) {
   calclator.verifyAdd(result);
}

}
