package sqaures;

import java.util.Scanner;

public class SquareCount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sqaure value : ");
		int n = sc.nextInt();
		int ans = 0;
		for(int i =1;i<=n;i++) {
			ans+=(i*i);
		}
		System.out.println(ans);
	}

}
