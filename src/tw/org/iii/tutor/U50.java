package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class U50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File source = new File("dir1/file1.txt");
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			
			fin.close();
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
