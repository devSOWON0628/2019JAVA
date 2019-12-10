
package test;

import java.awt.Color;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.lang.StringUtils;

class showRoom extends JFrame{
	
	static boolean seats[]=new boolean[20];
	static String check =" ";
    ImageIcon i = new ImageIcon("image/좌석지정.png");
    Image im=i.getImage();
    static int c;
    static int[] h=new int[60];
    
    showRoom(String password){
    	select1();
    	check=" ";
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1=new Font("나눔바른펜",Font.BOLD,10);
        MyPanel panel = new MyPanel();
        JButton back=new JButton("<<이전");
        panel.add(back);
        panel.setForeground(Color.LIGHT_GRAY);
        back.setFont(new Font("나눔바른펜",Font.BOLD,15));
        back.setSize(70,30);
        back.setLocation(10, 10);
        

        JButton[]b = new JButton[60];
        panel.setLayout(null);
        for(int j=0;j<60;j++) 
        {
			panel.add(b[j] = new JButton("S"+(j+1))); 
			b[j].setFont(font1);
			b[j].addActionListener(new Action(password,j));
			b[j].setSize(50,50);
				if(h[j]==1) //이미 찬 좌석
				{
	        		b[j].setContentAreaFilled(false);
	        	}
        }
        
        for(int j= 0;j<10;j++)b[j].setLocation(100, 70+ j   *55);
        for(int j=10;j<20;j++)b[j].setLocation(160, 70+(j-10)*55);
        for(int j=20;j<30;j++)b[j].setLocation(310, 70+(j-20)*55);
        for(int j=30;j<40;j++)b[j].setLocation(370, 70+(j-30)*55);
        for(int j=40;j<50;j++)b[j].setLocation(520, 70+(j-40)*55);
        for(int j=50;j<60;j++)b[j].setLocation(580, 70+(j-50)*55);
        
        
        
        back.addActionListener(new ActionListener() {
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
    

    
    public static void select(int deskNum){//npw는 사용자가 입력한 비밀번호
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            String sql= "SELECT seat FROM user WHERE seat='"+"s"+Integer.toString(deskNum+1)+"'";
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
        	JOptionPane.showMessageDialog(null,"값이 없습니다.","Message",JOptionPane.PLAIN_MESSAGE);
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
    
    public static void select1(){//차있는 방들 확인
    	Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);
            String sql= "SELECT seat FROM user WHERE seat like 's%'";
            pstmt = conn.prepareStatement(sql);
            rs=pstmt.executeQuery(sql);
            
            while(rs.next()) {//s어쩌구에서 s빼고 숫자만 나오게
            	check=rs.getString("seat");
            	c=Integer.parseInt(check.substring(1));
            	h[c-1]=1;
            }
            
            
            
        }
        catch( ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch( SQLException e){
			JOptionPane.showMessageDialog(null,"회원정보를 찾을 수 없습니다.","Message",JOptionPane.PLAIN_MESSAGE);
        }
        catch(NullPointerException e) {
        	JOptionPane.showMessageDialog(null,"null 오류 발생","Message",JOptionPane.PLAIN_MESSAGE);
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
    
    public class Action implements ActionListener {
    	String pw;
    	int dNum;
    	public Action(String password, int deskNum) 
    	{
			pw=password;
			dNum=deskNum;
		}
        public void actionPerformed(ActionEvent arg0) {
        	int result = 0;
			select(dNum);
			if(StringUtils.isBlank(check.toString())) {
				check=" ";
				result = JOptionPane.showConfirmDialog(null, 
						"해당 좌석으로 예약하시겠습니까?", "wrong", 
						JOptionPane.YES_NO_OPTION);
				if(result ==JOptionPane.YES_OPTION) {
					dispose(); 
					new inRoom(pw,dNum);
				}
			}
			else {
                JOptionPane.showMessageDialog(null, 
                		"이미 차있는 좌석입니다.", 
                		"already contected", JOptionPane.WARNING_MESSAGE);
                check=" ";
             
			}
        }
    }
    
    
    
}




