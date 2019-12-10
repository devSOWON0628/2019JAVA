

package test;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.event.*;

import org.apache.commons.lang.StringUtils;

class secondSelect extends JFrame{
	static String check="0";
    ImageIcon i = new ImageIcon("image/메인배경.png");
    Image im=i.getImage();
    Font font1=new Font("나눔바른펜",Font.BOLD,15);
    secondSelect(String password){
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyPanel panel = new MyPanel();
        JButton in=new JButton("입실");
		JButton out=new JButton("퇴실");
		JButton info=new JButton("회원정보");
		JButton exit=new JButton("종료");
		in.setFont(font1);
		out.setFont(font1);
		info.setFont(font1);
		exit.setFont(font1);
		
        
		in.setSize(200,80);
		out.setSize(200,80);
		info.setSize(200,80);
		exit.setSize(200,80);
		in.setLocation(650, 200);
		out.setLocation(650,300);
		info.setLocation(650, 400);
		exit.setLocation(650, 500);
        
		
		
        panel.setLayout(null);
        panel.add(in);
        panel.add(out);
        panel.add(info);
        panel.add(exit);
       

        out.addActionListener(new ActionListener() {//퇴실
			public void actionPerformed(ActionEvent arg0) {
				select(password);
				if(check.equals("0")) {//예약한 좌석이 없을 때
	                JOptionPane.showMessageDialog(null,"예약하신 좌석이 없습니다.","Message",JOptionPane.PLAIN_MESSAGE);
				}
				
				else {
				dispose(); 
				new out(password);
				check="0";
				}
				}});
		
		in.addActionListener(new ActionListener() {//입실
			public void actionPerformed(ActionEvent arg0) {
				select(password);
				if(!(check.equals("0"))) {//퇴실을 아직 안했을 때 
	                JOptionPane.showMessageDialog(null,"퇴실먼저 해주세요","Message",JOptionPane.PLAIN_MESSAGE);
				}
				else {
				dispose(); 
				new showRoom(password);
				check="0";
				}
				}});
		
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); 
				new info(password);
				}});
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, 
						"정말로 종료하시겠습니까?", "wrong", 
						JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION)
					 System.exit(0);//노 누르면 꺼짐
				}});
		
        
        this.add(panel);
        this.setTitle("미림독서실");
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
		this.setResizable(false);
        this.setVisible(true);
    }
    class MyPanel extends JPanel{
            
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
    
    
   
    public static void select(String password){//npw는 사용자가 입력한 비밀번호
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        String gpw = null;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            String sql= "SELECT seat FROM user WHERE pw= '"+password+"'";
            pstmt = conn.prepareStatement(sql);
            rs=pstmt.executeQuery(sql);
            
            while(rs.next()) {
            	check=rs.getString("seat");
            }
            
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
        
    }
}
