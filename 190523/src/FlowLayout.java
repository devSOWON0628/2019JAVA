import java.awt.Container;

import javax.swing.JFrame;

public class FlowLayout extends JFrame{
	public FlowLayout() {
		setTitle("FlowLayOut sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LFET,30,40));
	}
}
