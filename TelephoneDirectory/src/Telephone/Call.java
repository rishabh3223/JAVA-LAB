package Telephone;

public class Call {
	String name;
	String time;
	int phoneno;
	
	Call(String n,int p,String t){
		this.name=n;
		this.phoneno=p;
		this.time=t;
	}
	
	public void display() {
		System.out.println("Name: " +name + "  " + "Number: " +phoneno + "  " + "Time of call: " +time);
	}

}
