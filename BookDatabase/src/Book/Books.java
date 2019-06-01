package Book;

public class Books {
	String title;
	String author;
	String publisher;
	int price;
	
	Books(String t,String a, String p,int price){
		title = t;
		author = a;
		publisher = p;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Book Title: " +title + "   " + "Author: " +author + "   " + "Publisher: " +publisher + "   " + "Price: " +price);
	}
}
