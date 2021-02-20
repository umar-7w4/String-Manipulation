package ageCalculation;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the present ratio of ages : ");
		String[] cRatio = sc.next().split(":");
		int x1 = Integer.parseInt(cRatio[0]);
		int x2 = Integer.parseInt(cRatio[1]);
		System.out.println("Enter the number of years : ");
		int years = sc.nextInt();
		System.out.println("Enter the future ratio Factor : ");
		String[] fRatio = sc.next().split(":");
		int y1 = Integer.parseInt(fRatio[0]);
		int y2 = Integer.parseInt(fRatio[1]);
		
		
		float factor = (float)Math.abs(y1-y2)/Math.abs(x1-x2);
		float a = Math.abs((x1*factor)-y1)*(factor*years);
	
		System.out.println("The Present age of A : "+(int)((a*x1)+years)+" years");
		System.out.println("The Present age of B : "+(int)((a*x2)+years)+" years");
	}

}
