package socket;

import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args){
		try {
			ServerSocket ss = new ServerSocket(1999);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String k = dis.readUTF();
			System.out.println("File Transfered");
			FileOutputStream fos = new FileOutputStream("C:/Users/Admin/eclipse-workspace/destination.txt");
			byte[] b = k.getBytes();
			fos.write(b);
			
			fos.close();
			ss.close();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}

}
