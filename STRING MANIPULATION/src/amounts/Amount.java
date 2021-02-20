package amounts;

import java.util.Scanner;

public class Amount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount : ");
		int amount = sc.nextInt();
		System.out.println("Enter the A's Factor : ");
		String[] aFact = sc.next().split("/");
		int x1 = Integer.parseInt(aFact[0]);
		int x2 = Integer.parseInt(aFact[1]);
		System.out.println("Enter the B's Factor : ");
		String[] bFact = sc.next().split("/");
		int y1 = Integer.parseInt(bFact[0]);
		int y2 = Integer.parseInt(bFact[1]);
		
		float v = (float)(x2*y1)/(x1*y2)+1;
	
		System.out.println("The value of B : "+amount/v);
	}
}

