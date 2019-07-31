import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame {
	public login() {
		JPanel p=new JPanel();
		JLabel idl=new JLabel("id");
		JLabel ipw=new JLabel("passwd");
		JTextField txtid=new JTextField(10);
		JPasswordField txtpasswd=new JPasswordField(10);
		JButton go=new JButton("go");
		
		p.add(idl);
		p.add(txtid);
		p.add(ipw);
		p.add(txtpasswd);
		p.add(go);
		
		add(p);
		
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id="dgh09053";
				String pw="pasaho2";
				
				if((id.equals(txtid.getText())&&pw.equals(txtpasswd.getText()))) {
					JOptionPane.showMessageDialog(null,"확인","information",JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showConfirmDialog(null, "안녕하십니까 고객릠");
				}
				else 
					JOptionPane.showConfirmDialog(null, "아이디나 비밀번호가 다릅니다","missed",JOptionPane.ERROR_MESSAGE);
				
			}});
		
		setResizable(false);
		setVisible(true);
		setSize(800,600);
		setLocationRelativeTo(null);//null입력하면 가운데에 뜬다. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new login();//login이 자동으로 실행되도록
	}

}
