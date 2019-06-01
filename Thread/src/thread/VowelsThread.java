package thread;

import java.util.*;

public class VowelsThread implements Runnable{
	ArrayList<Character> vowels = new ArrayList<>();
	int v=0,c=0;
	public VowelsThread() {
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
	}
	
	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = s.next();
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(vowels.contains(ch)) {
				v++;
			}
			else {
				c++;
			}
		}
		s.close();
		System.out.println("The No of Vowels are:  " +v);
		System.out.println("The No of Consonants are:  " +c);
	}
}