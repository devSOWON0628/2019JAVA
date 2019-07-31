
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class screen extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;
	public screen() {//생성자
		
		icon= new ImageIcon("image/배경.png");
		
		
		JPanel panel=new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(icon.getImage(),0,0,null);
			setOpaque(false);
			super.paintComponent(g);
			}
		};
	
		setTitle("main_board");
		Container c = getContentPane();
		c.setLayout(null);
		
		ImageIcon high = new ImageIcon("image/상전.png");
		ImageIcon middle = new ImageIcon("image/중전.png");
		ImageIcon row = new ImageIcon("image/하전.png");
		
		ImageIcon high_on = new ImageIcon("image/상.png");
		ImageIcon middle_on = new ImageIcon("image/중.png");
		ImageIcon row_on = new ImageIcon("image/하.png");
		
		JButton btn_high = new JButton(high);
		JButton btn_middle = new JButton(middle);
		JButton btn_row = new JButton(row);
		
		
		btn_high.setSize(150, 42); 		
		btn_high.setLocation(50, 480); 
		
		btn_middle.setSize(150, 42); 		
		btn_middle.setLocation(220, 480); 
		
		btn_row.setSize(150, 42); 		
		btn_row.setLocation(390, 480); 
		
		btn_high.setRolloverIcon(high_on);
		btn_middle.setRolloverIcon(middle_on);
		btn_row.setRolloverIcon(row_on);
		
		btn_high.setPressedIcon(high_on);
		btn_middle.setPressedIcon(middle_on);
		btn_row.setPressedIcon(row_on);
		

		scrollPane=new JScrollPane(panel);
		setContentPane(scrollPane);
		
		scrollPane.add(btn_high);
		scrollPane.add(btn_middle);
		scrollPane.add(btn_row);
		
		btn_high.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				}});
		
		btn_middle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				}});
		
		
		btn_row.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				}});
		

		
		setSize(600,630);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}

