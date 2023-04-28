package tw.org.iii.tutor;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class U66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			
			Socket socket = new Socket(
					InetAddress.getByName("10.0.104.140"), 9957);
			OutputStream oout = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(oout);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write("hello, tcp");
			bw.flush();
			bw.close();
			
			
			
			socket.close();
			System.out.println("sendok");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
