package lenovo.calculator;

import java.util.Scanner;

public class Calculator {

	public void addition(double x, double y) {
		System.out.println(x + y);
	}

	public void substraction(double x, double y) {
		System.out.println(x - y);
	}

	public void multiplication(double x, double y) {
		System.out.println(x * y);
	}

	public void divivsion(double x, double y) {
		System.out.println(x / y);
	}

	public void modulus(double x, double y) {
		System.out.println(x % y);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// take two numbers from user
		double a, b;
		int opt;
		char choice;

		do {

			System.out.println("Enter first number");
			a = sc.nextDouble();
			System.out.println("Enter second number");
			b = sc.nextDouble();

			System.out.println("Enter your choice");
			System.out.println("1-Addition");
			System.out.println("2-Substraction");
			System.out.println("3-Division");
			System.out.println("4-Multiplication");
			System.out.println("5-Modulus");
			System.out.println("6-Exit");

			opt = sc.nextInt();

			Calculator calculator = new Calculator();

			switch (opt) {
			case 1:
				calculator.addition(a, b);
				break;
			case 2:
				calculator.substraction(a, b);
				break;
			case 4:
				calculator.multiplication(a, b);
				break;
			case 3:
				calculator.divivsion(a, b);
				break;
			case 5:
				calculator.modulus(a, b);
				break;
			default:
				break;
			}

			System.out.println("Enter Y/y for continue : ");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		System.out.println("Thanks for using Calculator");
		sc.close();
	}

}
