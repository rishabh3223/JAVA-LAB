package thread;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NumberThread nt = new NumberThread();
		Thread t1 = new Thread(nt);
		
		VowelsThread vt = new VowelsThread();
		Thread t2 = new Thread(vt);
		
		t1.start();
		t2.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
