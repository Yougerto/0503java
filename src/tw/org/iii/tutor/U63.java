package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class U63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] data = "hellowww".getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket poc =
					new DatagramPacket(data, data.length, InetAddress.getByName("10.0.104.140"), 8888);
			socket.send(poc);
			socket.close();
			System.out.println("ook");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
