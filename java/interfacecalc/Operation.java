package com.prime.java.interfacecalc;

public interface Operation {
	String getOperationName();
	
	double operate(double operand1, double operand2);
}