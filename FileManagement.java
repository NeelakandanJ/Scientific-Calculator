package com.Calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagement extends Calculator {
	String Operator;

	public void calculationHistory(double number1, double number2, double result) throws IOException {
		File file1 = new File("CalculationsHistory.txt");
		file1.createNewFile();
		boolean exists = file1.exists();
		if (exists == true) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {
				if (operator == 1) {
					Operator = "+";
				}
				if (operator == 2) {
					Operator = "-";
				}
				if (operator == 3) {
					Operator = "*";
				}
				if (operator == 4) {
					Operator = "/";
				}
				if (operator == 5) {
					Operator = "^";
				}
				if (operator == 7) {
					Operator = "Nrt";
				}

				bw.newLine();
				bw.write("first number : " + number1);
				bw.newLine();
				bw.write("second number : " + number2);
				bw.newLine();
				bw.write("Result : " + number1 + " " + Operator + " " + number2 + " = " + result);
				bw.newLine();

				bw.close();
			}

		}
	}

	public void calculationHistory2(double number1, double result) throws IOException {
		File file1 = new File("CalculationsHistory.txt");
		file1.createNewFile();
		
		boolean exists = file1.exists();
		if (exists == true) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {
				if (operator == 6) {
					Operator = "sqrt";
				}
				if (operator == 8) {
					Operator = "log";
				}
				if (operator == 9) {
					Operator = "logn";
				}
				if (operator == 10) {
					Operator = "sin";
				}
				if (operator == 11) {
					Operator = "isin";
				}
				if (operator == 12) {
					Operator = "cos";
				}
				if (operator == 13) {
					Operator = "icos";
				}
				if (operator == 14) {
					Operator = "tan";
				}
				if (operator == 15) {
					Operator = "itan";
				}
				if (operator == 16) {
					Operator = "Decimal value of";
				}
				if (operator == 17) {
					Operator = "Binary value of";
				}

				bw.newLine();
				bw.write("first number : " + number1);
				bw.newLine();
				bw.write("Result : " + Operator + " " + number1 + " = " + result);
				bw.newLine();

				bw.close();
			}

		}
	}

	public void calculationHistory3(int num1, String binary) throws IOException {
		File file1 = new File("CalculationsHistory.txt");
		file1.createNewFile();
		boolean exists = file1.exists();
		if (exists == true) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {

				if (operator == 17) {
					Operator = "Binary value of";
				}

				bw.newLine();
				bw.write("Decimal number : " + num1);
				bw.newLine();
				bw.write("Result : " + Operator + " " + num1 + " = " + binary);
				bw.newLine();

				bw.close();
			}

		}
	}

	public void calculationHistory4(String num2, int decimal) throws IOException {
		File file1 = new File("CalculationsHistory.txt");
		file1.createNewFile();
		boolean exists = file1.exists();
		if (exists == true) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {

				if (operator == 16) {
					Operator = "Decimal value of";
				}

				bw.newLine();
				bw.write("Binary number : " + num2);
				bw.newLine();
				bw.write("Result : " + Operator + " " + num2 + " = " + decimal);
				bw.newLine();

				bw.close();
			}

		}
	}

	public void calculationHistory5(double princ, double rt, double tm, double comp_int, double comp_value)
			throws IOException {
		File file1 = new File("CalculationsHistory.txt");
		file1.createNewFile();
		boolean exists = file1.exists();
		if (exists == true) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {

				bw.newLine();
				bw.write("principle amount : " + princ);
				bw.newLine();
				bw.write("Rate of interest : " + rt);
				bw.newLine();
				bw.write("time for years : " + tm);
				bw.newLine();
				bw.write("your compounding total  value" + " = " + comp_value);
				bw.newLine();
				bw.write("your compounding interest  value" + " = " + comp_int);
				bw.newLine();

				bw.close();
			}

		}
	}

}
