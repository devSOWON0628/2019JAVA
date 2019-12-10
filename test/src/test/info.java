package test;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import test.inRoom.MyPanel;

public class info extends JFrame{
	ImageIcon i = new ImageIcon("image/인포.png");
    Image im=i.getImage();
    static String gname;
    static String gpw;
    static int ggd;
    static String gseat;
    static String gphone;
    Font font1=new Font("나눔바른펜",Font.BOLD,35);
    Font font2=new Font("나눔바른펜",Font.BOLD,15);
    info(String password){
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        select(password);
        
        String gen;
        if(ggd==1)gen="여자";
        else gen="남자";
        if(gseat.equals("0"))gseat="예약한 좌석이 없습니다.";
        
        MyPanel panel = new MyPanel();
        JLabel name=new JLabel("이름 : "+gname);
        JLabel pw=new JLabel("비밀번호 : "+gpw);
        JLabel gender=new JLabel("성별 : " + gen);
        JLabel phone=new JLabel("전화번호 : "+gphone);
        JLabel seat=new JLabel("좌석 : "+gseat);
        JButton toSelect=new JButton("메인화면->");
        name.setFont(font1);
        pw.setFont(font1);
        gender.setFont(font1);
        phone.setFont(font1);
        seat.setFont(font1);
        toSelect.setFont(font2);
        name.setSize(490, 30);
		name.setLocation(170,200);
		pw.setSize(490, 30);
		pw.setLocation(170,250);
		gender.setSize(490, 30);
		gender.setLocation(170,300);
		phone.setSize(490, 30);
		phone.setLocation(170,350);
		toSelect.setSize(150,50);
		toSelect.setLocation(600, 500);
		seat.setSize(490,30);
		seat.setLocation(170,400 );
        
        
		
		
        panel.setLayout(null);
        panel.add(name);
        panel.add(pw);
        panel.add(gender);
        panel.add(phone);
        panel.add(toSelect);
        panel.add(seat);
       
        toSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new secondSelect(password);
			}
		});
        
        
        this.add(panel);
        this.setTitle("미림독서실");
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
		this.setResizable(false);
        this.setVisible(true);
    }
    
    class MyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
    
    public static void select(String password){
        Connection conn = null;
        Statement pstmt = null;
        ResultSet rs=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            pstmt=conn.createStatement();
            String SQL = "SELECT * FROM user WHERE pw='"+password+"'";
            rs=pstmt.executeQuery(SQL);
            
            while(rs.next()) {
            	gname=rs.getString("name");
            	gpw=rs.getString("pw");
            	ggd=rs.getInt("gender");
            	gphone=rs.getString("phone");
            	gseat=rs.getString("seat");
            	
            }
        }
        catch( ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch( SQLException e){
			JOptionPane.showMessageDialog(null,"DB연결 실패","Message",JOptionPane.PLAIN_MESSAGE);
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
        }//try-catch
    }//select()

   

}//class
