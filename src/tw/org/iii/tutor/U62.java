package tw.org.iii.tutor;

import java.net.InetAddress;

public class U62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress[] ips = 
					InetAddress.getAllByName("www.cht.com");
			
			for(InetAddress ip :ips) {
				System.out.println(ip.getHostAddress());

			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
