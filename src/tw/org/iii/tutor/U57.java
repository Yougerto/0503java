package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class U57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long start = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("dir2/UUU.png");

			FileInputStream fin = new FileInputStream("dir1/qqq.png");
		int b;
		while((b=fin.read())!= -1) {
			fout.write(b);
		}
		fin.close();
		fout.flush();
		fout.close();
		System.out.println("finish :"+ (System.currentTimeMillis()-start));
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
