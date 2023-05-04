package tw.org.iii.myclasses;
import tw.org.iii.myclasses.BCrypt;
public class U74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passwd = "123456";
		String hwPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hwPasswd);

		
			if(BCrypt.checkpw("123457", "$2a$10$Q0SB0yB3TwCfcNN3Z17QYOaMx3qG7bykOfu9G9kGZ4rHZhVGIENrG")) {
				System.out.println("ok");


			}else {
				System.out.println("XX");
			}
		}
	
}
