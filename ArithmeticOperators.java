package com.Calculator;

public class ArithmeticOperators extends Calculator {

	public void Adition() {
		System.out.println("Enter first number");
		number1 = input.nextDouble();

		System.out.println("Enter second number");
		number2 = input.nextDouble();
		result = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + result);

	}

	public void Subtraction() {
		System.out.println("Enter first number");
		number1 = input.nextDouble();

		System.out.println("Enter second number");
		number2 = input.nextDouble();
		result = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + result);
	}

	public void Multiplication() {
		System.out.println("Enter first number");
		number1 = input.nextDouble();

		System.out.println("Enter second number");
		number2 = input.nextDouble();
		result = number1 * number2;
		System.out.println(number1 + " * " + number2 + " = " + result);
	}

	public void Division() {
		System.out.println("Enter first number");
		number1 = input.nextDouble();

		System.out.println("Enter second number");
		number2 = input.nextDouble();
		result = number1 / number2;
		System.out.println(number1 + " / " + number2 + " = " + result);

	}

}
