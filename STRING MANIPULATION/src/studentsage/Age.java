package studentsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Age {
	static int count(List<Integer> a,Object i2) {
		int c = 0;
		for(Integer i:a) {
			if(i==i2) {
				c+=1;
			}
		}
		return c;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();
		List<Integer> a = new ArrayList();
		Set<Integer> s = new TreeSet();
		for(int i = 0;i<n;i++) {
			a.add(sc.nextInt());
		}
		for (Integer i:a) {
			s.add(i);
		}
		
		System.out.println("Smallest age : "+s.toArray()[0]);
		System.out.println("Largest age : "+s.toArray()[s.size()-1]);
		System.out.println("Count of students of following ages : ");
		for(Object i:s.toArray()) {
			System.out.println(i+" : "+count(a,i));
		}
		
	
	}
}
