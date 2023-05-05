package tw.org.iii.tutor;

import java.io.File;

public class U46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("D:/dir1");
		if(file1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
	}

}
