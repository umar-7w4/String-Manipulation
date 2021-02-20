package calculator;

import java.util.Scanner;

public class Calculation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the operand : ");
		String op = sc.next();
		if (op.equals("*")) {
			System.out.println("Value : "+(a*b));
		}
		else if (op.equals("+")) {
			System.out.println("Value : "+(a+b));
		}
		else if (op.equals("-")) {
			System.out.println("Value : "+(a-b));
		}
		else if (op.equals("/")) {
			System.out.println("Value : "+(a/b));
		}

	}

}
