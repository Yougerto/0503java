package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class U52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			System.out.println("ok");
			int c ;
			while((c = fin.read())!=-1) {
				System.out.println((char)c);
			}
			fin.close();
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
