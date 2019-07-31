import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flowlayout extends JFrame{
	public Flowlayout() {
	setTitle("FlowLayOut sample");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentPane = getContentPane();
	
	contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
	contentPane.add(new JButton("add"));
	contentPane.add(new JButton("sub"));
	contentPane.add(new JButton("mul"));
	contentPane.add(new JButton("div"));
	contentPane.add(new JButton("calculate"));
	
	setLocationRelativeTo(null);
	setSize(300,200);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new Flowlayout();
	}
}
