import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class frametest {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JLabel label=new JLabel("hello");
		JPanel btnpanel=new JPanel();
		JButton btn1=new JButton("change panel");
		JButton btn2=new JButton("printing!");
		JButton btn3=new JButton("exit");
		panel.setLayout(new BorderLayout());
		JTextArea txtarea=new JTextArea();
		
		btnpanel.add(btn1);
		btnpanel.add(btn2);
		btnpanel.add(btn3);
		frame.add(panel);//프레임에 패널을 넣는 것
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtarea.append("print!\n");
				
			}});
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(txtarea.getText());
				
			}});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}});
		
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnpanel,BorderLayout.WEST);
		panel.add(txtarea,BorderLayout.CENTER);
		
		frame.add(panel);
		
		frame.setResizable(false);//프레임 고정
		frame.setVisible(true);//GUI를  보이게 해주는 것
		frame.setPreferredSize(new Dimension(840,840/12*9));
		frame.setSize(840, 840/12*9);//화면 사이즈
		frame.setLocationRelativeTo(null);//null입력하면 가운데에 뜬다. 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//화면X누르면 실행종료
	}
}
