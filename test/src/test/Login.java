//package test;
//
//import java.awt.Container;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JTextPane;
//
//public class Login extends JFrame{
//	public Login() {
//		Container c=getContentPane();
//		
//		JLabel id=new JLabel("아이디");
//		JTextField idtf=new JTextField("");
//		JLabel pw=new JLabel("비밀번호");
//		JTextField pwtf=new JTextField("");
//		c.add(id);
//		c.add(idtf);
//		c.add(pw);
//		c.add(pwtf);
//		c.setLayout(null);
//		id.setSize(100, 30);
//		id.setLocation(100, 300);
//		idtf.setSize(300,30);
//		idtf.setLocation(200, 300);
//		pw.setSize(100, 30);
//		pw.setLocation(100, 350);
//		pwtf.setSize(300, 30);
//		pwtf.setLocation(200,350);
//		
//		JButton check=new JButton("확인");
//		c.add(check);
//		check.setLocation(500, 300);
//		check.setSize(70,80);
//		
//		check.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				dispose(); 
//				new secondSelect();
//				}});
//		
//		setTitle("미림독서실");
//		setSize(900,700);
//		setVisible(true);
//		setLocationRelativeTo(null);
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//}


package test;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.event.*;

class Login extends JFrame{
	static int count;
    ImageIcon i = new ImageIcon("image/로그인.png");
    Image im=i.getImage();
    Font font1=new Font("나눔바른펜",Font.BOLD,15);
    Login(){
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyPanel panel = new MyPanel();
        JLabel id=new JLabel("이름");
		JTextField idtf=new JTextField("");
		JLabel pw=new JLabel("비밀번호");
		JPasswordField pwtf=new JPasswordField("");
		JButton check=new JButton("로그인");
		JButton goSignUp=new JButton("회원가입");
		
		id.setFont(font1);
		pw.setFont(font1);
		check.setFont(font1);
		goSignUp.setFont(font1);
        
		id.setSize(60, 30);
		id.setLocation(100, 300);
		idtf.setSize(200,30);
		idtf.setLocation(170, 300);
		pw.setSize(60, 30);
		pw.setLocation(100, 350);
		pwtf.setSize(200, 30);
		pwtf.setLocation(170,350);
		check.setLocation(400, 300);
		check.setSize(70,80);
		goSignUp.setSize(100,80);
		goSignUp.setLocation(480, 300);
        
		
		
        panel.setLayout(null);
        panel.add(id);
        panel.add(idtf);
        panel.add(pw);
        panel.add(pwtf);
        panel.add(check);
        panel.add(goSignUp);

        check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				select(idtf.getText().toString(),pwtf.getText().toString());
				if(count!=0) 
				{
				JOptionPane.showMessageDialog(null,"로그인 되었습니다.","Message",JOptionPane.PLAIN_MESSAGE);
				new secondSelect(pwtf.getText().toString());
				dispose(); 
				}
				else
				JOptionPane.showMessageDialog(null,"아이디 또는 비밀번호가 틀렸습니다.","Message",JOptionPane.PLAIN_MESSAGE);
				}});//확인 버튼 
        
        goSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new signUp();
			}
		});
        
		
        
        this.add(panel);
        this.setTitle("미림독서실");
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
		this.setResizable(false);
        this.setVisible(true);
        
        
        
    }
   
    
    
    
    public static void select(String name, String pw){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        String gname=null;
        String gpw = null;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            String sql= "SELECT * FROM user WHERE pw='"+pw+"'";
            pstmt = conn.prepareStatement(sql);
            rs=pstmt.executeQuery(sql);
            
            while(rs.next()) {
            	gname=rs.getString("name");
            	gpw=rs.getString("pw");
            	
            }
            if(pw.equals(gpw)&&name.equals(gname))count++;
               
        }
        catch( ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch( SQLException e){
			JOptionPane.showMessageDialog(null,"회원정보를 찾을 수 없습니다.","Message",JOptionPane.PLAIN_MESSAGE);
        }
        catch(NullPointerException e) {
        	JOptionPane.showMessageDialog(null,"ㅎㅎ","Message",JOptionPane.PLAIN_MESSAGE);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
                if( pstmt != null && !pstmt.isClosed()){
                    pstmt.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
            
        }
        
    }//select
    
    
    class MyPanel extends JPanel{
        
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
   
    
}

