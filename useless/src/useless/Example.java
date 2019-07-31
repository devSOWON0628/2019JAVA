package useless;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Example extends JFrame{
	static int rere;
	public Example() {}
	public void one_one() {
		JPanel btns=new JPanel();
		JPanel anspanel=new JPanel();
		JButton[][] jbtn = new JButton[5][5];
		JButton go=new JButton("정답확인하기");
		
		boolean [][]user= {
				{false,false,false,false,false},
				{false,false,false,false,false},
				{false,false,false,false,false},
				{false,false,false,false,false},
				{false,false,false,false,false}
				};
		boolean [][]answer=
				{
				{true,false,true,false,true},
				{false,true,true,true,false},
				{true,true,true,true,true},
				{false,true,true,true,false},
				{true,false,true,false,true}
				};
		
		add(anspanel);
		add(btns);
		anspanel.add(go);
		
		setTitle("노노그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btns.setLayout(new GridLayout(5, 5));
		add(go,BorderLayout.SOUTH);
		
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5;j++) {
			btns.add(jbtn[i][j] = new JButton()); 
			jbtn[i][j].setPreferredSize(new Dimension(10, 100));
			jbtn[i][j].setBackground(Color.white);
			}
		}
		
		
		jbtn[0][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[0][0]==true) {
					jbtn[0][0].setBackground(Color.WHITE);
					user[0][0]=false;
					}
				else {
					jbtn[0][0].setBackground(Color.BLACK);
					user[0][0]=true;
				}
				}});
		
		jbtn[0][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[0][1]==true) {
					jbtn[0][1].setBackground(Color.WHITE);
					user[0][1]=false;
					}
				else{
					jbtn[0][1].setBackground(Color.BLACK);
					user[0][1]=true;
				}
				}});
		
		jbtn[0][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[0][2]==true) {
					jbtn[0][2].setBackground(Color.WHITE);
					user[0][2]=false;
					}
				else{
					jbtn[0][2].setBackground(Color.BLACK);
					user[0][2]=true;
				}
				}});
		
		jbtn[0][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[0][3]==true) {
					jbtn[0][3].setBackground(Color.WHITE);
					user[0][3]=false;
					}
				else{
					jbtn[0][3].setBackground(Color.BLACK);
					user[0][3]=true;
				}
				}});
		
		jbtn[0][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[0][4]==true) {
					jbtn[0][4].setBackground(Color.WHITE);
					user[0][4]=false;
					}
				else{
					jbtn[0][4].setBackground(Color.BLACK);
					user[0][4]=true;
				}
				}});
		
		jbtn[1][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[1][0]==true) {
					jbtn[1][0].setBackground(Color.WHITE);
					user[1][0]=false;
					}
				else{
				jbtn[1][0].setBackground(Color.BLACK);
					user[1][0]=true;
				}
				}});
		
		jbtn[1][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[1][1]==true) {
					jbtn[1][1].setBackground(Color.WHITE);
					user[1][1]=false;
					}
				else{
					jbtn[1][1].setBackground(Color.BLACK);
					user[1][1]=true;
				}
				}});
		
		jbtn[1][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[1][2]==true) {
					jbtn[1][2].setBackground(Color.WHITE);
					user[1][2]=false;
					}
				else{
					jbtn[1][2].setBackground(Color.BLACK);
					user[1][2]=true;
				}
				}});
		
		jbtn[1][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[1][3]==true) {
					jbtn[1][3].setBackground(Color.WHITE);
					user[1][3]=false;
					}
				else{
					jbtn[1][3].setBackground(Color.BLACK);
					user[1][3]=true;
				}
				}});
		
		jbtn[1][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[1][4]==true) {
					jbtn[1][4].setBackground(Color.WHITE);
					user[1][4]=false;
					}
				else{
					jbtn[1][4].setBackground(Color.BLACK);
					user[1][4]=true;
				}
				}});
		
		jbtn[2][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[2][0]==true) {
					jbtn[2][0].setBackground(Color.WHITE);
					user[2][0]=false;
					}
				else{
					jbtn[2][0].setBackground(Color.BLACK);
					user[2][0]=true;
				}
				}});
		
		jbtn[2][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[2][1]==true) {
					jbtn[2][1].setBackground(Color.WHITE);
					user[2][1]=false;
					}
				else{
					jbtn[2][1].setBackground(Color.BLACK);
					user[2][1]=true;
				}
				}});
		
		jbtn[2][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[2][2]==true) {
					jbtn[2][2].setBackground(Color.WHITE);
					user[2][2]=false;
					}
				else{
					jbtn[2][2].setBackground(Color.BLACK);
					user[2][2]=true;
				}
				}});
		
		jbtn[2][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[2][3]==true) {
					jbtn[2][3].setBackground(Color.WHITE);
					user[2][3]=false;
					}
				else{
					jbtn[2][3].setBackground(Color.BLACK);
					user[2][3]=true;
				}
				}});
		
		jbtn[2][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[2][4]==true) {
					jbtn[2][4].setBackground(Color.WHITE);
					user[2][4]=false;
					}
				else{
					jbtn[2][4].setBackground(Color.BLACK);
					user[2][4]=true;
				}
				}});
		
		jbtn[3][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[3][0]==true) {
					jbtn[3][0].setBackground(Color.WHITE);
					user[3][0]=false;
					}
				else{
					jbtn[3][0].setBackground(Color.BLACK);
					user[3][0]=true;
				}
				}});
		
		jbtn[3][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[3][1]==true) {
					jbtn[3][1].setBackground(Color.WHITE);
					user[3][1]=false;
					}
				else{
					jbtn[3][1].setBackground(Color.BLACK);
					user[3][1]=true;
				}
				}});
		
		jbtn[3][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[3][2]==true) {
					jbtn[3][2].setBackground(Color.WHITE);
					user[3][2]=false;
					}
				else{
					jbtn[3][2].setBackground(Color.BLACK);
					user[3][2]=true;
				}
				}});
		
		jbtn[3][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[3][3]==true) {
					jbtn[3][3].setBackground(Color.WHITE);
					user[3][3]=false;
					}
				else{
					jbtn[3][3].setBackground(Color.BLACK);
					user[3][3]=true;
				}
				}});
		
		jbtn[3][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[3][4]==true) {
					jbtn[3][4].setBackground(Color.WHITE);
					user[3][4]=false;
					}
				else{
					jbtn[3][4].setBackground(Color.BLACK);
					user[3][4]=true;
				}
				}});
		
		jbtn[4][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[4][0]==true) {
					jbtn[4][0].setBackground(Color.WHITE);
					user[4][0]=false;
					}
				else{
					jbtn[4][0].setBackground(Color.BLACK);
					user[4][0]=true;
				}
				}});
		
		jbtn[4][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[4][1]==true) {
					jbtn[4][1].setBackground(Color.WHITE);
					user[4][1]=false;
					}
				else{
					jbtn[4][1].setBackground(Color.BLACK);
					user[4][1]=true;
				}
				}});
		
		jbtn[4][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[4][2]==true) {
					jbtn[4][2].setBackground(Color.WHITE);
					user[4][2]=false;
					}
				else{
					jbtn[4][2].setBackground(Color.BLACK);
					user[4][2]=true;
				}
				}});
		
		jbtn[4][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[4][3]==true) {
					jbtn[4][3].setBackground(Color.WHITE);
					user[4][3]=false;
					}
				else{
					jbtn[4][3].setBackground(Color.BLACK);
					user[4][3]=true;
				}
				}});
		
		jbtn[4][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user[4][4]==true) {
					jbtn[4][4].setBackground(Color.WHITE);
					user[4][4]=false;
					}
				else{
					jbtn[4][4].setBackground(Color.BLACK);
					user[4][4]=true;
				}
				}});
		
		go.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if(Objects.deepEquals(user, answer)) {
					int result = JOptionPane.showConfirmDialog(null, 
							"맞췄습니다! 다음문제를 풀겠습니까?", "fine!", 
							JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION)
						 System.exit(1);
					
					
					else
						 System.exit(-1);
						
				}
				
				else {
					int result = JOptionPane.showConfirmDialog(null, 
							"다시풀겠습니까?", "wrong!", 
							JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.NO_OPTION)
						 System.exit(0);	
				}
			
				
		}});
		
		setSize(600,600);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void show_show() {
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
				repaint();
				change(rere);
				}});
		
		level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rere=2;
				repaint();
				change(rere);
				}});
		
		level3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rere=3;
				repaint();
				change(rere);
				}});
		
		
		setSize(600,600);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	void change(int re) {
		switch (re) {
		case 1:
			one_one();
			break;

		default:
			break;
		}
	}

}
