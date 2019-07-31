package useless;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class culculator extends JFrame {

	culculator(){
		JPanel pn=new JPanel();
		add(pn);
		setTitle("그리드예제");
		JTextField txt=new JTextField();
		add(txt,"NORTH");
		
		GridLayout grid=new GridLayout(7,5);
		Container c=getContentPane();
		c.setLayout(grid);
	
		
		String[] btn_Title = { "x2", "xy", "sin", "cos", "tan", "root", "10x제곱", "log", "Exp", 
	            "Mod", "↑", "ce", "c", "←", "/","pie","7","8","9","x","n!","4","5","6","-","±","1","2","3","+","(",")","0",".","="}; 
		for(int i=0;i<35;i++) {
			c.add(new JButton(btn_Title[i]));
			
		}
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new culculator();
	}

}
