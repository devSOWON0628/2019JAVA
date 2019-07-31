
import java.awt.Color; 
import java.awt.Font; 
import java.awt.GridLayout; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 

public class nono extends JFrame { 
    final String[] btn_Title = { "+", "-", "*", "/", "=", "0", "1", "2", "3", 
            "4", "5", "6", "7", "8", "9" }; 
    // 버튼 Text 값 배열로 저장 

    JTextField txtField = new JTextField("0.0"); // 텍스트필드 생성 
    JPanel jp = new JPanel(); // JPanel생성 
    JButton[] jbtn = new JButton[15]; // JButton을 담을수있는 그릇생성 

    public nono() { 
        super("CalculatorStyleExam"); // JFrame타이틀 지정 

        // 추가 
        add(txtField, "North"); // North부분에 txtField 배치 
        txtField.setBackground(new Color(223, 253, 231)); // 배경색변경 
        txtField.setFont(new Font("바탕", Font.BOLD, 20)); // 폰트및스타일 변경 

        add(jp, "Center"); // Center부분에 JPannel 배치 
        jp.setLayout(new GridLayout(3, 5)); // GridLayout(3,5) 지정 

        for (int i = 0; i < btn_Title.length; i++) { 

            jp.add(jbtn[i] = new JButton(btn_Title[i])); 
            // 버튼생성하여 JButton 타입의 jbtn배열에 저장 

            if (i < 5) { 
                jbtn[i].setBackground(new Color(203, 238, 130)); 
                jbtn[i].setFont(new Font("굴림", Font.BOLD, 16)); 
                jbtn[i].setForeground(new Color(223, 133, 16)); 
            } else if (i < 10) { 
                jbtn[i].setBackground(new Color(241, 244, 189)); 
                jbtn[i].setFont(new Font("궁서체", Font.BOLD, 20)); 
                jbtn[i].setForeground(new Color(18, 50, 133)); 
            } else { 
                jbtn[i].setBackground(new Color(203, 238, 130)); 
                jbtn[i].setFont(new Font("궁서체", Font.BOLD, 20)); 
                jbtn[i].setForeground(new Color(18, 50, 133)); 
            } 
        } 

        // 크기지정 
        setSize(250, 250); 
        // 보이기 
        super.setVisible(true); 
        // x =>활성 
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 

    public static void main(String[] args) { 
        new nono(); 
    } 
} 