import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame{
public ClickAndDoubleClickEx() {
	setTitle("Click and DoubleClick 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c= getContentPane();
	c.addMouseListener(new MyMouseListener());
	setSize(300,200);
	setVisible(true);
}

class MyMouseListener extends MouseAdapter{
	public void mouseClicked(MouseEvent e){
		if(e.getClickCount()==2) {
			int r = (int) (Math.random() * 256); // red 성분
			int g = (int) (Math.random() * 256); // green 성분
			int b = (int) (Math.random() * 256); // blue 성분
			Component c=(Component)e.getSource();
			c.setBackground(new Color(r,g,b));
		}
	}
}



public static void main(String[] args) {
	new ClickAndDoubleClickEx();
	}

}
