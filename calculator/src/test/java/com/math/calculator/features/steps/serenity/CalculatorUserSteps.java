package com.math.calculator.features.steps.serenity;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.math.calculator.Calculator;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.junit.Assert;
import net.thucydides.core.annotations.Step;
@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest
@Ignore
public class CalculatorUserSteps {
int x;


int y;

@Autowired
Calculator calculator;

int z;

@Before
public void beforall() {
	System.out.println("==================Before");
}

@After
public void afterall() {
	System.out.println("==================After");
}

@Step
public void setInput(int x,int y) {
	this.x=x;
	this.y=y;
	
}
@Step
public void performAdd() {
	z=calculator.add(x, y);
}

@Step
public void verifyAdd(int result) {
Assert.assertEquals(String.valueOf(result),String.valueOf(z));
}
}
