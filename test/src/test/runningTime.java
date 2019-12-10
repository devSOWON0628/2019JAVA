
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

class runningTime extends JFrame{
    ImageIcon i = new ImageIcon("image/시간.png");
    Image im=i.getImage();
    static int DBhour;
    static int DBmin;
    static String DBname;
    runningTime(String password){
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font=new Font("나눔바른펜",Font.PLAIN,40);
        Font font1=new Font("나눔바른펜",Font.PLAIN,15);
        select(password);
        int nowHour=Integer.parseInt(new java.text.SimpleDateFormat("HH").format(new java.util.Date()));
        int nowMin=Integer.parseInt(new java.text.SimpleDateFormat("mm").format(new java.util.Date()));

        
        int showHour;
        int showMin;
        
        if(DBhour==nowHour&&DBmin==nowMin) //0시간0분동안 이용한 경우
        {
        	showHour=0;
        	showMin=0;
        }
        else {
	        showHour=nowHour-DBhour;
	        if(showHour<0)showHour=(nowHour+24)-DBhour;
	        
	        showMin=nowMin-DBmin;
	        if(showMin<1) {
	        	showMin=(nowMin+60)-DBmin;
	        	showHour--;
	        }
        }
        
        
        MyPanel panel = new MyPanel();
        JLabel name=new JLabel(DBname);
        JLabel hour=new JLabel(Integer.toString(showHour));
        JLabel min=new JLabel(Integer.toString(showMin));
		JButton check=new JButton("종료");
		JButton toSelect=new JButton("메인화면으로->");
        
		name.setFont(font);
		hour.setFont(font);
		min.setFont(font);
		check.setFont(font1);
		toSelect.setFont(font1);
		
		name.setForeground(Color.black);
		hour.setForeground(Color.black);
		min.setForeground(Color.black);
		check.setForeground(Color.black);
		toSelect.setForeground(Color.black);
		
		
		name.setSize(500, 300);
		name.setLocation(370,173);
		hour.setSize(500,300);
		hour.setLocation(300,225);
		min.setSize(500,300);
		min.setLocation(405, 225);
		check.setLocation(560,460);
		check.setSize(150,30);
		toSelect.setLocation(560, 500);
		toSelect.setSize(150,30);
		
        panel.setLayout(null);
        panel.add(name);
        panel.add(hour);
        panel.add(min);
        panel.add(check);
        panel.add(toSelect);
      
       

        check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); 
				System.exit(0);//노 누르면 꺼짐
				}});
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
    class MyPanel extends JPanel{
            
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
    
    public static void select(String pw){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        String gname=null;
        String gpw = null;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            String sql= "SELECT name,starthour, startmin FROM user WHERE pw='"+pw+"'";
            pstmt = conn.prepareStatement(sql);
            rs=pstmt.executeQuery(sql);
            
            while(rs.next()) {
            	DBname=rs.getString("name");
            	DBhour=rs.getInt("starthour");
            	DBmin=rs.getInt("startmin");
            	
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

