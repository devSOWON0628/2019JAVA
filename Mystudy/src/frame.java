import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class frame {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JLabel label=new JLabel("not changed");
		JButton btn1 = new JButton("Click me!");
		JButton btn2 = new JButton("Exit");
		//JButton btn3 = new JButton("color");
		JPanel btnpanel = new JPanel();
		JTextArea text=new JTextArea();//여러줄을 입력받을 때
		//JTextField text=new JTextField(20);//한줄정도 입력할때 많이씀 안에 들어간 매개변수값 만큼 글을 쓸 수 있음
		//panel.setLayout();//패널을 원하는 위치에 둘수있게 하는 기능 사용법은 아래줄에
		panel.setLayout(new BorderLayout());//위아래중간에 놓을 수 있는 기본함슈
		
		
		btnpanel.add(btn1);
		btnpanel.add(btn2);
		
		btn1.setBackground(Color.gray);
		btn2.setBackground(Color.lightGray);
		btn1.addActionListener(new ActionListener(){
			int i=0;
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(i==0)text.append("print!\n");
				else label.setText(text.getText());
				i++;
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}});

	
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnpanel,BorderLayout.WEST);
		panel.add(text,BorderLayout.CENTER);
		
		frame.add(panel);//프레임에 패널을 넣는 것
		
		frame.setResizable(false);//프레임 고정
		frame.setVisible(true);//GUI를  보이게 해주는 것
		frame.setPreferredSize(new Dimension(840,840/12*9));
		frame.setSize(840, 840/12*9);//화면 사이즈
		frame.setLocationRelativeTo(null);//null입력하면 가운데에 뜬다. 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//화면X누르면 실행종료
	}
}
