package tw.org.iii.tutor;

public class U29 {
	public static void main(String[] args) {
		Brad292 obj1 = new Brad292();
//		Brad291 obj2 = new Brad292();
//		Brad291 obj3 = new Brad293();
		doThing(obj1);
	}
	
	static void doThing(Brad291 obj) {
		obj.m1();
	}
}
class Brad291 { 
	void m1() {System.out.println("Brad291:m1()");} 
}
class Brad292 extends Brad291 {
	void m1() {System.out.println("Brad292:m1()");}
	void m2() {System.out.println("Brad292:m2()");}
}
class Brad293 extends Brad291 {
	void m1() {System.out.println("Brad293:m1()");}
	void m2() {System.out.println("Brad293:m2()");}
}
