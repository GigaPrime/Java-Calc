package com.prime.java.interfacecalc;

import java.io.*;

public class Engine {
	public Engine() {};
	
	public double parseInput() throws IOException{
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String input;
		double operand;
		
		input = bufferedReader.readLine();
		operand = Double.parseDouble(input);
				
		return operand;
	}
	
	public void runCalc() throws IOException {
		double operand1, operand2;
		int operator;
		
		System.out.println("\t\tSimple calculator\n\n");
		
		System.out.println("Input first operand: ");
		operand1 = parseInput();
		
		System.out.println("Input second operand: ");
		operand2 = parseInput();
		
		System.out.println("Select operator: 1 - \"+\", 2 - \"-\", 3 - \"*\", 4 - \"/\"");
		operator = (int) parseInput();
		
		switch (operator) {
		case 1:	Summurization Summ = new Summurization();
				System.out.println(operand1 + Summ.getOperationName() + operand2 + Summ.operate(operand1, operand2));
				break;
		case 2:	Subtraction Subt = new Subtraction();
				System.out.println(operand1 + Subt.getOperationName() + operand2 + Subt.operate(operand1, operand2));
				break;
		case 3:	Multiplying Mult = new Multiplying();
				System.out.println(operand1 + Mult.getOperationName() + operand2 + Mult.operate(operand1, operand2));
				break;
		case 4:	Division Div = new Division();
				System.out.println(operand1 + Div.getOperationName() + operand2 + Div.operate(operand1, operand2));
				break;
		}
		
		runCycle();
	}
	
	public void runCycle() throws IOException {
		int selection;
		
		System.out.println("Calculate more? 1- \"Yes\", 2 - \"No\"\n\n");
		selection = (int) parseInput();
		
		if (selection == 1)
			runCalc();
		else
			System.exit(0);
	}
}