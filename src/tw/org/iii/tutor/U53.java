package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class U53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Hello,world\n";
		try {
			
			//				File file = new File("dir1/file1.txt");
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt", true);
			fout.write(data.getBytes());
			
			
			fout.close();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			// TODO: handle exception
		}catch (IOException e) {
			System.out.println(e);
		}

					
					
	}

}
