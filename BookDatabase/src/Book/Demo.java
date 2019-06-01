package Book;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Books> l1 = new ArrayList<>();
		int i=0;
		int ch=0;
		while(ch!=2) {
			System.out.println("1. Insert Book Details\n2. Exit");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the Title, Author, Publiser and Price of the Book");
				String t= s.next();
				String au = s.next();
				String pub = s.next();
				int price = s.nextInt();
				Books b1 = new Books(t,au,pub,price);
				try {
					l1.set(i, b1);
				}
				catch(Exception e) {
					l1.add(b1);
			    }
				finally {
					i=(i+1)%10;
				}
				break;
			case 2:
				break;
			}
		}
		
		ArrayList<Books> l2 = new ArrayList<>();
		l2.addAll(l1);
		Collections.sort(l2,new price());
		
		System.out.println("Books Details:");
		for(Books b: l1) {
			b.display();
		}
		System.out.println();
		System.out.println("Sorted Books Details:");
		for(Books b: l2) {
			b.display();
		}
		s.close();
	}
}
