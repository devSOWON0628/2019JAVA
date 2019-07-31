import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class one extends JFrame {
	
	public one(){}
	
	JScrollPane scrollPane;
	ImageIcon icon;
	public void screen() {//생성자
		
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
				setVisible(false);
				one_one();
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
	
	
	public void one_one() {
		JPanel btns=new JPanel();
		JPanel anspanel=new JPanel();
		JButton[][] jbtn = new JButton[5][5];
		JButton[][] jbtn_aex = new JButton[5][5];
		
		
		ImageIcon check = new ImageIcon("image/결과확인.png");
		JButton check_c = new JButton(check);
			
		
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
		anspanel.add(check_c);
		check_c.setSize(200, 57); 	
		check_c.setLocation(500, 500);
		
		setTitle("노노그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//btns.setLayout(new GridLayout(5, 5));
		btns.setLayout(null);
		anspanel.setLayout(null);
		add(check_c,BorderLayout.SOUTH);
		
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5;j++) {
			btns.add(jbtn[i][j] = new JButton()); 
			jbtn[i][j].setSize(80,80);
			jbtn[i][j].setLocation(i*80+190, j*80+130);
			jbtn[i][j].setBackground(Color.white);
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5;j++) {
			ImageIcon aex = new ImageIcon("image/aex.png");
			btns.add(jbtn_aex[i][j] = new JButton(aex)); 
			jbtn_aex[i][j].setSize(80,80);
			jbtn_aex[i][j].setLocation(i*80+190, j*80+130);
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
		
		check_c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if(Objects.deepEquals(user, answer)) {
					int result = JOptionPane.showConfirmDialog(null, 
							"맞췄습니다! 다음문제를 풀겠습니까?", "fine!", 
							JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION)
						 System.exit(1);
					
					
					else
						System.exit(0);	
						
				}
				
				else {
					int result = JOptionPane.showConfirmDialog(null, 
							"다시풀겠습니까?", "wrong!", 
							JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.NO_OPTION)
						 System.exit(0);	
				}
			
				
		}});
		
		setSize(600,630);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		one o=new one();
		o.screen();
	}
	

}
