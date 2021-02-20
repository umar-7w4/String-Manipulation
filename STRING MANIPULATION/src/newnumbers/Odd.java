package newnumbers;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Odd {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Integers : ");
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Set s = new TreeSet();
		for(Integer i:a) {
			if(i%2!=0) {
				s.add(i);
			}
		}
		System.out.println(s);
	}
}
