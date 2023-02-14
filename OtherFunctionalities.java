package com.Calculator;

public class OtherFunctionalities extends Calculator {

	public void DecimalToBinary() {
		System.out.println("Enter decimal number");
		num1 = input.nextInt();

		binary = Integer.toBinaryString(num1);
		System.out.println("Binary of " + num1 + " is" + "  = " + binary);
	}

	public void BinaryToDecimal() {
		System.out.println("Enter Binary number");
		num2 = input.next();
		decimal = Integer.parseInt(num2, 2);
		System.out.println("Decimal of " + num2 + " is" + "  = " + decimal);

	}

	public void Store() {

		System.out.println("please enter number place in a memory for later use");
		stor = input.nextDouble();
		System.out.println("the number is successfully added in memory stor");

	}

	public void Recover() {
		System.out.println("the stor value is: " + stor);

	}

	public void Sip() {

		System.out.println("enter priciple amount");
		princ = input.nextDouble();
		System.out.println("enter intrest rate amount");
		rt = input.nextDouble();
		System.out.println("enter number of years");
		tm = input.nextDouble();
		comp_value = princ * (Math.pow((1 + rt / 100), tm));
		comp_int = comp_value - princ;
		System.out.println("your compounding total  value : " + comp_value);
		System.out.println("your compounding interest value : " + comp_int);

	}

}
