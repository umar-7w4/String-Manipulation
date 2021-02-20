package identical;

import java.util.Scanner;

public class Identical {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String s1 = sc.next();
		System.out.println("Enter second string : ");
		String s2 = sc.next();
		if (s1.equals(s2)) {
			System.out.println("IDENTICAL");
		}
		else {
			System.out.println("NOT IDENTICAL");
		}

	}
}
