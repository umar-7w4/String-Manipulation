package numersAgain;

import java.util.Scanner;

public class Algebra {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int product = sc.nextInt();
		int quotient = sc.nextInt();
		int value1 = (int) Math.sqrt( product*quotient );
		int value2 = product/value1 ;
		System.out.println("Largest value : "+value1+"\n"+"Smallest value : "+value2);
		
	}

}
