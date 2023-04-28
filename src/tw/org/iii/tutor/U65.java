package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class U65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			
			ServerSocket server = new ServerSocket(9957);
			Socket socket = server.accept();
			
			String urip = socket.getInetAddress().getHostAddress();
			InputStream in = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(ir);
			
			String line;
			while((line = br.readLine())!= null) {
				System.out.println(line);
				
			}
			
			
			server.close();
			System.out.println("receive ok");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
