package numbers;

import java.util.Scanner;

public class Number {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a+b : ");
		int sum = sc.nextInt();
		System.out.println("Enter the value of a-b : ");
		int sub = sc.nextInt();
		int value1 = (sum+sub)/2;
		int value2 = sum-value1;
		System.out.println("Value of a : "+value1+"\n"+"Value of b : "+value2);
	}

}
