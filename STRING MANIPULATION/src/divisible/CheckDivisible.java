package divisible;

import java.util.ArrayList;
import java.util.List;

public class CheckDivisible {
	public static void main(String args[]) {
		List<Integer> a = new ArrayList();
		for(int i=100;i<1000;i++) {
			if (i%6==0) {
				a.add(i);
			}
		}
		System.out.println(a);
	}

}
