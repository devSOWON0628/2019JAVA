package nonogram;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class mmain extends JFrame{
	
	public mmain() {
		
		setTitle("노노그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(5,5);
		grid.setVgap(5);
		
Container c=getContentPane();
		
		c.setLayout(grid);
		for(int i=0;i<25;i++)c.add(new JLabel(""));
		
		
		
		setSize(600,800);
		setVisible(true);
	}

}
