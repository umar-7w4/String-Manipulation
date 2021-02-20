package substring;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class SubString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		List a = new ArrayList();
		List b = new ArrayList();
		boolean isString = false;
		
		for(int i = 0;i<s1.length()+1;i++) {
			for(int j=i+1; j<s1.length()+1;j++) {
				a.add(s1.substring(i,j));
			}
		}
		
		for(int i = 0;i<s2.length()+1;i++) {
			for(int j=i+1; j<s2.length()+1;j++) {
				b.add(s2.substring(i,j));
			}
		}
		
		for(Object i:a) {
			for(Object j:b) {
				if (i.equals(j)) {
					isString = true;
				}	
			}	
		}
		System.out.println(isString);
		
	}

}
