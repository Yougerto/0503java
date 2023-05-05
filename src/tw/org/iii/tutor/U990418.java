/**
 * 
 */
package tw.org.iii.tutor;

/**
 * @author USER
 *
 */
public class U990418 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int rows =1;
		final int start =2;
		final int cols =2;
		
		for(int k =0 ;k<rows;k++) {
			for(int j =1 ; j<= 9; j++) {
				for (int i = start; i <= (start+cols); i++) {
					int r = (i+rows*k)*j;
					System.out.printf("%d * %d = %d \t",i,j,r);
				}
				System.out.println();
			}
			System.out.println("==========================================================================");
		}
	}

}
