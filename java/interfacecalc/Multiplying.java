package com.prime.java.interfacecalc;

public class Multiplying implements Operation {
	public Multiplying() {};
	
	public String getOperationName() {
		return " multiply on";
	}
	
	public double operate(double operand1, double operand2) {
		return operand1 * operand2;
	}
}