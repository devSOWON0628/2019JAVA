
package test;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.event.*;

class out extends JFrame{
    ImageIcon i = new ImageIcon("image/퇴실.png");
    Image im=i.getImage();
    Font font1=new Font("나눔바른펜",Font.BOLD,15);
    out(String password){
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyPanel panel = new MyPanel();
        JPasswordField pw=new JPasswordField("");
		JButton check=new JButton("확인");
		
		JButton back=new JButton("<<이전");
        panel.add(back);
        back.setFont(new Font("나눔바른펜",Font.BOLD,15));
        back.setSize(70,30);
        back.setLocation(10, 630);
        
		check.setFont(font1);
		pw.setSize(490, 30);
		pw.setLocation(170,285);
		check.setLocation(665,285);
		check.setSize(60,30);
		
        panel.setLayout(null);
        panel.add(pw);
        panel.add(check);
      
        back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new secondSelect(password);
			}
		});

        check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pw.getText().equals(password)) {
				JOptionPane.showMessageDialog(null,"퇴실완료","Message",JOptionPane.PLAIN_MESSAGE);
				dispose(); 
				update(password);
				new runningTime(password);
				}
				else {
					JOptionPane.showMessageDialog(null, 
                    		"비밀번호가 다릅니다.", 
                    		"password is wrong", JOptionPane.WARNING_MESSAGE);
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
    
    public static void update(String pswd){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            String sql="update user set seat= 0 where pw='"+pswd+"'";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
           
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
        } //try-catch   
    }//update()
    
    
}
