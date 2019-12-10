
package test;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.event.*;
import org.apache.commons.lang.StringUtils;

class signUp extends JFrame{static //
	int count=0;
	static int gd=0;//성별, 0이면 남자 1이면 여자
    ImageIcon i = new ImageIcon("image/회원가입.png");
    Image im=i.getImage();
    signUp(){
        this.setTitle("미림독서실");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1=new Font("나눔바른펜",Font.PLAIN,15);
        
        MyPanel panel = new MyPanel();
        JLabel namel=new JLabel("이름");
		JLabel pwl=new JLabel("비밀번호");
		JLabel gdl=new JLabel("성별");//gender
		
		JLabel phonel=new JLabel("연락처");
		JTextField name=new JTextField("");
		JPasswordField pw=new JPasswordField("");
		JTextField phone=new JTextField("");
		JRadioButton w=new JRadioButton("여자");
    	JRadioButton m=new JRadioButton("남자");
		JButton check=new JButton("확인");
        namel.setFont(font1);
        name.setFont(font1);
        pwl.setFont(font1);
        pw.setFont(font1);
        gdl.setFont(font1);
        check.setFont(font1);
        phone.setFont(font1);
        phonel.setFont(font1);
        
        ButtonGroup radio = new ButtonGroup();
        radio.add(w);
		radio.add(m);
		w.setFont(font1);
		m.setFont(font1);
		
		
		
        namel.setSize(100,30);
		namel.setLocation(100, 220);
		name.setSize(150,30);
		name.setLocation(200, 220);
	
		phonel.setSize(100,30);
		phonel.setLocation(100, 260);
		phone.setSize(150, 30);
		phone.setLocation(200, 260);
		
		pwl.setSize(100,30);
		pwl.setLocation(100, 300);
		pw.setSize(150,30);
		pw.setLocation(200, 300);
		
		gdl.setSize(100,30);
		gdl.setLocation(100, 340);
		
		w.setSize(55,20);
		m.setSize(55,20);
		w.setLocation(200, 340);
		m.setLocation(260, 340);
		
		check.setSize(70,70);
		check.setLocation(550,380);
        
		
        panel.setLayout(null);
        panel.add(name);
        panel.add(namel);  
        panel.add(pw);
        panel.add(pwl);
        panel.add(w);
        panel.add(m);
        panel.add(gdl);
        panel.add(check);
        panel.add(phonel);
        panel.add(phone);
        
        
        w.addActionListener(new ActionListener() {	//성별체크
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				if(s.equals(w.getText())){
		          gd=1;//여자
		        }
			}
		});
        
        
        check.addActionListener(new ActionListener() {
        	public boolean check(String textInput)//비밀번호에 영어랑 숫자외에 다른 값이 들어가 있는지 확인
        	{
        		char chrInput;
        		for (int i = 0; i < textInput.length(); i++) {
        		chrInput = textInput.charAt(i); 
        		if (chrInput >= 0x61 && chrInput <= 0x7A) {}
        		else if (chrInput >=0x41 && chrInput <= 0x5A) {}
        		else if (chrInput >= 0x30 && chrInput <= 0x39) {} 
        		else return false;
        		}
        		return true;//영어랑 숫자만 있다는 뜻
        	}

        	
			public void actionPerformed(ActionEvent arg0) {
				
				if((StringUtils.isBlank(name.getText().toString()))
						||(StringUtils.isBlank(pw.getText().toString())
								||(StringUtils.isBlank(phone.getText().toString())))) //공백이 있으면 회원가입 불가
					{
	                JOptionPane.showMessageDialog(null,"공백을제거해주세요","Message",JOptionPane.PLAIN_MESSAGE);
					}
				
				else if(!(check(pw.getText().toString())))//비밀번호에 한글 들어가면 회원가입 불가
					{
	                JOptionPane.showMessageDialog(null,"비밀번호에는 영어 또는 숫자만 입력해주세요.","Message",JOptionPane.PLAIN_MESSAGE);
					}
				
				else //이제 가능
					{
				insert(name.getText().toString(), pw.getText().toString(),gd,phone.getText().toString(),"0",0,0);
					if( count == 1 )
						{
		                JOptionPane.showMessageDialog(null,"회원가입성공","Message",JOptionPane.PLAIN_MESSAGE);
						new Login();
						dispose();
						}
					}
				}});
		
        
        this.add(panel);
        this.setTitle("미림독서실");
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
		this.setResizable(false);
        this.setVisible(true);
        
    }
    
    
    
    public static void insert(String name, String pw, int gender,String phone
    		,String seat, int starthour, int startmin){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studyroom?useSSL=false&user=root&password=mirim2";
            conn = DriverManager.getConnection(url);

            String sql = "INSERT INTO user VALUES (?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setString(2, pw);
            pstmt.setInt(3, gender);
            pstmt.setString(4, phone);
            pstmt.setString(5, seat);
            pstmt.setInt(6, starthour);
            pstmt.setInt(7, startmin);

            count = pstmt.executeUpdate();//값이 잘 들어갔는지 확인
        
           
        }
        catch( ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch( SQLException e){
			JOptionPane.showMessageDialog(null,"같은 비밀번호가 있습니다.","Message",JOptionPane.PLAIN_MESSAGE);
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
        
    }//insert()
    
    
    class MyPanel extends JPanel{//배경화면
            
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
    
    
}//class
