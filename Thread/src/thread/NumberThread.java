package thread;

import java.util.*;

public class NumberThread implements Runnable{
	HashMap<Integer,String> hm = new HashMap<>();
	
	public NumberThread() {
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		hm.put(7, "seven");
		hm.put(8, "eight");
		hm.put(9, "nine");
	}
	
	public void run() {
		System.out.println("Enter a 4 digit Number:");
		Scanner s = new Scanner(System.in);
		String num = s.next();
		
		for(int i=0;i < num.length();i++) {
			int digit = Integer.parseInt("" + num.charAt(i));
			System.out.println("Digit is:  " +hm.get(digit));
		}
		s.close();
	}
}
