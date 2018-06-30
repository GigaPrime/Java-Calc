package com.prime.java.interfacecalc;

public class Subtraction implements Operation {
	public Subtraction() {};
	
	public String getOperationName() {
		return "minus ";
	}
	
	public double operate(double operator1, double operator2) {
		return operator1 - operator2;
	}
}