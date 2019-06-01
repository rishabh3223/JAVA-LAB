package Telephone;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<Integer,String> callerlist = new HashMap<>();
		System.out.println("Enter the Number of caller entries");
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Name and Number of the caller");
			String name = s.nextLine();
			int number = s.nextInt();
			callerlist.put(number, name);
		}
		
		ArrayList<Call> missedcalls = new ArrayList<>();
		int i=0;
		int ch=0;
		while(ch!=2) {
			System.out.println("1. Insert call\n2. Exit");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the Number and time of call");
				int num= s.nextInt();
				String time = s.next();
				String name = "Private Caller";
				if(callerlist.containsKey(num)) {
					name = callerlist.get(num);
				}
				Call call = new Call(name,num,time);
				try {
					missedcalls.set(i, call);
				}
				catch(Exception e) {
					missedcalls.add(call);
			    }
				finally {
					i=(i+1)%10;
				}
				break;
				
			case 2:
				break;
			}
		}
		
		System.out.println("List of missed calls");
		for(Iterator<Call> itr = missedcalls.iterator(); itr.hasNext(); ) {
			Call ca = itr.next();
			System.out.println("Number:  " +ca.phoneno); 
			int choice=0;
			System.out.println("1. Delete Missed call\n2. Next Missed call\n3. Show details");
			choice = s.nextInt();
			switch(choice) {
			case 1:
				itr.remove();
				break;
			case 2:
				break;
			case 3:
				ca.display();
				break;
			}
		}
		s.close();
	}
}
