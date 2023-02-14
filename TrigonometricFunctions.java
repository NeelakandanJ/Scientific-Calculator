package com.Calculator;

public class TrigonometricFunctions extends Calculator {
	public void Sine() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();

		result = Math.sin(number1);
		System.out.println("Sine value of " + number1 + " = " + result);
	}

	public void InverseSine() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();

		result = Math.asin(number1);
		System.out.println("Inverse Sine value of " + number1 + " = " + result);
	}

	public void Cosine() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();

		result = Math.cos(number1);
		System.out.println("Cosine value of " + number1 + " = " + result);

	}

	public void InverseCosine() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();

		result = Math.acos(number1);
		System.out.println("Inverse Cosine value of " + number1 + " = " + result);
	}

	public void Tangent() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();

		result = Math.tan(number1);
		System.out.println("Tangent value of " + number1 + " = " + result);
	}

	public void InverseTangent() {
		System.out.println("Enter a number");
		number1 = input.nextDouble();

		result = Math.atan(number1);
		System.out.println("Inverse Tangent value of " + number1 + " = " + result);
	}

}
