package palindrome;
import java.util.*;

public class Palindrome {
	
	static boolean isPalindrome(String str) {
		StringBuilder s = new StringBuilder();
		s.append(str);
		s.reverse();
		if (str.equals(new String(s))) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		System.out.println(isPalindrome(str));		
	}
}
