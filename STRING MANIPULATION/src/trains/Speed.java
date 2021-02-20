package trains;

import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = 500;
		int x = (sc.nextInt()*5)/18;
		int y = (sc.nextInt()*5)/18;
		int relativeSpeed = x+y;
		System.out.println("Time taken to cross : "+length/relativeSpeed+" Seconds");
		
		

	}

}
