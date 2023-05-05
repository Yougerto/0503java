package tw.org.iii.tutor;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyDrawer extends JPanel{
	public MyDrawer() {
		setBackground(Color.blue);
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
		
	}
	private class MyListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
		System.out.println("press:"+e.getX()+","+e.getY());
		}
		public void mouseDragged(MouseEvent e) {
		System.out.println("dragged:"+e.getX()+","+e.getY());
		}
	}
}
