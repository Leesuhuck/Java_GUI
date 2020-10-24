import java.awt.Dimension;
import java.awt.BorderLayout;
//java GUI 라이브러리

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.plaf.DimensionUIResource;
import javax.swing.JLabel;
import javax.swing.JPanel;
//AWT 기술을 기반으로 작성된 java 라이브러리

public class Java_Calculator_practice {
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("표준");
        JPanel panel = new JPanel();
        JButton btn1,btn2,btn3,btn4,btn5,btn6,btn8,btn9 = new JButton();
        panel.setLayout(new BorderLayout());

        panel.add(label,BorderLayout.NORTH);
        //panel.add(btn1,btn2,btn3,btn4,btn5,btn6,btn8,btn9, BorderLayout.SOUTH);
        for(int i=1; i<10; i++) {
            panel.add(btn[i], BorderLayout.SOUTH);
        };

        frame.setVisible(true);

        frame.add(panel);
        frame.setPreferredSize(new Dimension(600,600/12*9));
        frame.setSize(600,600/12*9);
        
        frame.setLocationRelativeTo(null);
        //set명령어중 대소문자 구별.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        

    }
}
