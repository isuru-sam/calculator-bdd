package com.math.calculator;

import org.springframework.stereotype.Service;

@Service
public class TextServiceImpl implements TextService {

	@Override
	public String toUpper(String s) {
		// TODO Auto-generated method stub
		return s.toUpperCase();
	}

	@Override
	public String toLower(String s) {
		// TODO Auto-generated method stub
		return s.toLowerCase();
	}

	@Override
	public int length(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}

}
