import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("그리드예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c=getContentPane();
		
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		
		setSize(500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
