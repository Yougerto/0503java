package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class U03 {
	public static void main(String[] args) {
		String Strx = JOptionPane.showInputDialog("x=?");
		String Stry = JOptionPane.showInputDialog("y=?");
	//	System.out.println(Strx);
		int x = Integer.parseInt(Strx);
		int y = Integer.parseInt(Stry);
		int rAdd = x+y;
		int rSub = x-y;
//		int rTime = x*y;
//		int rDiv = x/y;
//		int rmod = x%y;
		JOptionPane.showMessageDialog(null, String.format("%d +%d =%d", x,y ,rAdd));
}
}
