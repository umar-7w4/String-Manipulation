package area;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ratio : ");
		String[] ratio = sc.next().split(":");
		int x = Integer.parseInt(ratio[0]);
		int y = Integer.parseInt(ratio[1]);
		System.out.println("Enter the speed in km/hr : ");
		int speed = (sc.nextInt()*5)/18;
		System.out.println("Enter the time in minutes : ");
		int time = sc.nextInt()*60;
		int perimeter = speed*time;
		int factor = (perimeter)/(x+y);
		System.out.println("Length : "+x*factor+" meters");
		System.out.println("Breadth : "+y*factor+" meters");
	}

}
