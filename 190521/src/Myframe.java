import javax.swing.JFrame;
import javax.swing.JPanel;
public class Myframe extends JFrame{
	JPanel p= new JPanel();
	public Myframe() {
		setTitle("첫번째 프레임");
		setSize(300,300);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Myframe mf=new Myframe();
//		new Myframe();
	}
}
