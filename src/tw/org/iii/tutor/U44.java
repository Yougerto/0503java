package tw.org.iii.tutor;

public class U44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new U441().m1();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
class U441{
	void m1() throws Exception{	
		m2();}
	void m2() throws Exception{	
		m3();}
	void m3() throws Exception{
		throw new RuntimeException();
	}
}
}
