package com.Calculator;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
	static int operator;
	static int num1;
	static int decimal;
	static double number1;
	static double number2;
	static double result;
	static double stor;
	static double comp_int;
	static double comp_value;
	static double princ, rt, tm;
	static String num2;
	static String binary;
	static String Operator;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println(
					"Choose an operator number: 1)+, 2)-, 3)*, 4)/, 5)^, 6)Sqrt, 7)Nrt, 8)log, 9)logn, 10)sin, 11)isin, 12)cos, 13)icos, 14)tan, 15)itan,  16)b2d, 17)d2b, 18)store, 19)recall, 20)sip, 21)Quit");
			operator = input.nextInt();

			ArithmeticOperators function1 = new ArithmeticOperators();
			OtherOperators1 function2 = new OtherOperators1();
			TrigonometricFunctions function3 = new TrigonometricFunctions();
			OtherFunctionalities function4 = new OtherFunctionalities();
			FileManagement function5 = new FileManagement();
			switch (operator) {

//			 performs addition between numbers
			case 1:
				function1.Adition();
				try {
					function5.calculationHistory(number1, number2, result);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;

//			 performs subtraction between numbers
			case 2:
				function1.Subtraction();
				try {
					function5.calculationHistory(number1, number2, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

//			 performs multiplication between numbers
			case 3:
				function1.Multiplication();
				try {
					function5.calculationHistory(number1, number2, result);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;

//			 performs division between numbers
			case 4:
				function1.Division();
				try {
					function5.calculationHistory(number1, number2, result);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
//			 perform power values between numbers
			case 5:
				function2.PowerOf();
				try {
					function5.calculationHistory(number1, number2, result);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
//			 perform square root of the number
			case 6:
				function2.Squareroot();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to find nth root value
			case 7:
				function2.Nthroot();
				try {
					function5.calculationHistory(number1, number2, result);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
//			 to find log value
			case 8:
				function2.Logarithmic();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to find natural log
			case 9:
				function2.NaturalLog();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to find Sine value
			case 10:
				function3.Sine();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to find Inverse Sine value
			case 11:
				function3.InverseSine();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to find Cosine value
			case 12:
				function3.Cosine();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to find Inverse Cosine value
			case 13:
				function3.InverseCosine();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to find Tangent value
			case 14:
				function3.Tangent();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
//			 to find Inverse tan value
			case 15:
				function3.InverseTangent();
				try {
					function5.calculationHistory2(number1, result);
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
//			 to perform binary to decimal number
			case 16:
				function4.BinaryToDecimal();
				try {
					function5.calculationHistory4(num2, decimal);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
//			 to perform decimal to binary number

			case 17:
				function4.DecimalToBinary();
				try {
					function5.calculationHistory3(num1, binary);
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
//			 to store the value
			case 18:
				function4.Store();
				break;
//			 display the stored value
			case 19:
				function4.Recover();
				break;
//			 to find compounding interest value
			case 20:
				function4.Sip();
				try {
					function5.calculationHistory5(princ, rt, tm, comp_int, comp_value);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 21:
				System.exit(0);

			default:
				System.out.println("Invalid operator!");
				break;

			}
		} while (operator != 21);
		{
			input.close();
		}

	}
}
