package com.Calculator;

public class OtherOperators1 extends Calculator {

	public void PowerOf() {
		System.out.println("Enter base value");
		number1 = input.nextDouble();

		System.out.println("Enter power value");
		number2 = input.nextDouble();
		result = Math.pow(number1, number2);
		System.out.println(number1 + " ^ " + number2 + " = " + result);

	}

	public void Squareroot() {
		System.out.println("Enter first number");
		number1 = input.nextDouble();
		result = Math.sqrt(number1);
		System.out.println("square root of " + number1 + " = " + result);
	}

	public void Nthroot() {
		System.out.println("Enter base number");
		number1 = input.nextDouble();
		System.out.println("Enter exponent number");
		number2 = input.nextDouble();
		result = Math.pow(number1, 1 / number2);
		System.out.println("nth root of value is" + " = " + result);
	}

	public void Logarithmic() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();
		;
		result = Math.log10(number1);
		System.out.println("log value of " + number1 + " = " + result);
	}

	public void NaturalLog() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();
		;
		result = Math.log(number1);
		System.out.println("Natural log value of " + number1 + " = " + result);
	}

}
