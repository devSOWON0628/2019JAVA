import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPane extends JFrame{
	public ContentPane() {
		setTitle("ContentPane 과 JFrame예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("OK"));
		c.add(new JButton("Cancle"));
		c.add(new JButton("Ignore"));
		
		setSize(600,400);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ContentPane();
	}
}
