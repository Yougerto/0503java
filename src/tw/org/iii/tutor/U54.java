package tw.org.iii.tutor;

import java.io.FileReader;

public class U54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileReader reader = new FileReader("dir1/file1.txt");
	int c ;
	while((c = reader.read())!= -1) {
		System.out.println((char)c);
	}
	reader.close();
	System.out.println("ok");
} catch (Exception e) {
	// TODO: handle exception
}
	}

}
