package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class show extends JFrame{
    ImageIcon i = new ImageIcon("image/메인배경.png");
    Image im=i.getImage();
    show(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1=new Font("나눔바른펜",Font.BOLD,35);

        MyPanel panel = new MyPanel();
        JButton login=new JButton("로그인");
		JButton signUp=new JButton("회원가입");
		
        login.setSize(200,80);
		signUp.setSize(200,80);
		login.setLocation(650, 300);
		signUp.setLocation(650,400);
		
		login.setFont(font1);
		signUp.setFont(font1);
        panel.setLayout(null);
        panel.add(signUp);
        panel.add(login);

        login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); 
				new Login();
				}});
		
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); 
				new signUp();
				}});
        
        this.add(panel);
        this.setTitle("미림독서실");
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
		this.setResizable(false);
        this.setVisible(true);
        this.setIconImage(im);
    }
    class MyPanel extends JPanel{
            
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
}

public class real {
	//맨처음 실행하는 클래스라능
    public static void main(String[] args) {
         new show();
         
    } 
}


