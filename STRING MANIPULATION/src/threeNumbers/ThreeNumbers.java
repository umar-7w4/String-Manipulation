package threeNumbers;

import java.util.Scanner;

public class ThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum of squares of 3 numbers : ");
		int squareSum = sc.nextInt();
		System.out.println("Enter the sum of product of two numbers : ");
		int productOf2Num = sc.nextInt();
		int value = squareSum+productOf2Num;
		System.out.println("Sum of 3 numbers : "+Math.sqrt(value));
	}
}
