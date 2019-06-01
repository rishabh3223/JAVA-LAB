package socket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",1999);
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Admin/eclipse-workspace/source.txt"));
			String k = reader.readLine();
			
			System.out.println("Transfer Complete");
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(k);
			
			System.out.println("Transfer Complete");
			s.close();
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
