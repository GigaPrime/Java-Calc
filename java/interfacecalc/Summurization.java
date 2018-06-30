package com.prime.java.interfacecalc;

public class Summurization implements Operation {
	public Summurization() {}
	
	public String getOperationName() {
		return "plus ";
	}
	
	public double operate (double operand1, double operand2) {
		return operand1 + operand2;
	} 
}