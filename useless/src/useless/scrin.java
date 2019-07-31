package useless;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class scrin extends JFrame {
	public int rere;//리턴값 넘기기 위한 변수
	public scrin() {}//생성자
	
	public int show_show() {//선택보기 메서드
		JPanel shsh=new JPanel();
		add(shsh);
		JLabel txt=new JLabel("Please choose a choice.");
		shsh.add(txt);
		JButton level1= new JButton("row (5*5)");
		level1.setBackground(Color.yellow);
		JButton level2= new JButton("middle(10*10)");
		level2.setBackground(Color.green);
		JButton level3= new JButton("high(15*15)");
		level3.setBackground(Color.blue);
		shsh.setLayout(new GridLayout(1, 3));
		shsh.add(level1);
		shsh.add(level2);
		shsh.add(level3);
		
		
		level1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rere=1;//rere에 1 대입 나중에 re()메서드통해서 메인클래스로 리턴할거임
				System.out.println(rere);
				}});
		
		level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rere=2;
				System.out.println(rere);
				}});
		
		level3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rere=3;
				System.out.println(rere);
				}});
		
		
		setSize(600,600);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		return rere;
		
	}
	
	
}
