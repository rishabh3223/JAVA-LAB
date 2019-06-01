package Book;
import java.util.*;

public class price implements Comparator<Books>{
	public int compare(Books b1,Books b2) {
		return b1.price - b2.price;
	}
}

/* System.out.println("Enter the Books Details in order: Price-Title-Author-Publisher");
int price = s.nextInt();
System.out.println(price);
String title = s.next();
System.out.println(title);
String author = s.next();
System.out.println(author);
String pub = s.next();
System.out.println(pub);
Books b = new Books(title,author,pub,price);
try {
l1.set(index, b);
}
catch(Exception e){
l1.add(b);
}
finally {
index=(index+1)%5;
}
break;
*/