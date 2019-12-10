//계정의 비밀번호를 받아서 예약하는 클래스
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

class inRoom extends JFrame{
	static String check=null;
    ImageIcon i = new ImageIcon("image/입실.png");
    Image im=i.getImage();
    static int count=0;
    inRoom(String password, int deskNum){
    	
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyPanel panel = new MyPanel();
        JPasswordField pwtf=new JPasswordField("");
        JButton check=new JButton("확인");
        
        pwtf.setSize(490, 30);
		pwtf.setLocation(170,285);
		check.setLocation(665,285);
		check.setSize(60,30);
		
        panel.setLayout(null);
        panel.add(pwtf);
        panel.add(check);
       

        check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(password.equals(pwtf.getText().toString()))
				{
					update("s"+Integer.toString(deskNum+1),pwtf.getText().toString());
					
					JOptionPane.showMessageDialog(null,"좌석예약성공","Message",JOptionPane.PLAIN_MESSAGE);
					dispose(); 
					new secondSelect(password);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, 
                    		"비밀번호가 다릅니다.", 
                    		"Password is wrong", JOptionPane.WARNING_MESSAGE);
				}
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
    ////
    ///
    //
    public static void update(String seat, String pswd){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            int starthour= Integer.parseInt(new java.text.SimpleDateFormat("HH").format(new java.util.Date()));
            int startmin= Integer.parseInt(new java.text.SimpleDateFormat("mm").format(new java.util.Date()));

            String sql="update user set seat='"+seat+
            		"' , starthour="+starthour+
            		", startmin="+startmin+
            		" where pw='"+pswd+"'";
            
            pstmt = conn.prepareStatement(sql);

           
            int count = pstmt.executeUpdate();
           
        }
        catch( ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch( SQLException e){
			JOptionPane.showMessageDialog(null,"DB연결에 문제가 있습니다 관리자에게 연락바랍니다","Message",JOptionPane.PLAIN_MESSAGE);
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


        }   //try-catch
    }//update()
    
    
   
   
 }
    







