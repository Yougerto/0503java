package tw.org.iii.tutor;
import java.util.Scanner;
/**
 * @author USER
 *
 */
public class U02 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("x=");
	int x = scanner.nextInt();
	System.out.print("y=");
	int y = scanner.nextInt();
//	int r = x+y;
	int rAdd = x+y;
	int rSub = x-y;
	int rTime = x*y;
	int rDiv = x/y;
	int rmod = x % y;
	
	System.out.printf(" %d + %d = %d\n",x ,y ,rAdd);
	System.out.printf(" %d - %d = %d\n",x ,y ,rSub);
	System.out.printf(" %d * %d = %d\n",x ,y ,rTime);
	System.out.printf(" %d / %d = %d......%d\n",x ,y ,rDiv, rmod);
//	System.out.printf(" %d % %d = %d",x ,y ,rmod);
	
	}
	
}
