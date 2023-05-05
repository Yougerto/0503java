package tw.org.iii.tutor;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class U21window extends JFrame {
	public U21window() {
		
		System.out.println("U21window");
		setTitle("我的視窗");
		setLayout(new FlowLayout());
		JButton b1 = new JButton("按");
		add(b1);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new U21window();
		
	}

}
