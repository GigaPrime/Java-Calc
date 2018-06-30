package com.prime.java.interfacecalc;

public class Division implements Operation {
	public Division() {}
	
	public String getOperationName() {
		return "divide on ";
	}

	public double operate(double operand1, double operand2) {
		// floating point operations division by zero is allowed but not mathematically correct 
		if(operand2 == 0) {
			System.out.println("Division by zero is forbidden");
			return 0;
		}
		else
			return operand1 / operand2;
	}
	
}