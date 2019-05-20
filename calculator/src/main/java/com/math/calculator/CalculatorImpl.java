package com.math.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double devide(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
