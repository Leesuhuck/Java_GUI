import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Action.*;
//AWT 기술을 기반으로 작성된 java 라이브러리

public class Java_Calculator_practice extends JFrame {
        
        private JButton JNum1;
        private JButton JNum2;
        private JButton JNum3;
        private JButton JNum4;
        private JButton JNum5;
        private JButton JNum6;
        private JButton JNum7;
        private JButton JNum8;
        private JButton JNum9;
        private JButton JNum0;

        private JButton JAdd;
        private JButton JSubtract;
        private JButton JMultiply;
        private JButton JDivide;
        private JButton JSolve;
        private JButton JClear;

        private double Temp;
        private double Slove_Temp;
        private JTextField Screen;
    // 버튼선언

    public Java_Calculator_practice (){
    
    JPanel p = new JPanel();

    JPanel p1 = new JPanel();

    p.add(p1, BorderLayout.SOUTH);
    p1.setLayout(new GridLayout(4,3));
    
    p1.add(JNum1 = new JButton("1"));
    p1.add(JNum2 = new JButton("2"));
    p1.add(JNum3 = new JButton("3"));
    p1.add(JNum4 = new JButton("4"));
    p1.add(JNum5 = new JButton("5"));
    p1.add(JNum6 = new JButton("6"));
    p1.add(JNum7 = new JButton("7"));
    p1.add(JNum8 = new JButton("8"));
    p1.add(JNum9 = new JButton("9"));
    p1.add(JNum0 = new JButton("0"));

    //버튼생성
    //p2 결과창 옵션
    JPanel p2 = new JPanel();
    p.add(p2, BorderLayout.NORTH);
    p2.add(new TextField(20));
    Screen.setHorizontalAlignment(JTextField.RIGHT);
    //정렬기능
    Screen.setEditable(false);
    //편집기능
    
    p2.add(Screen = new JTextField(20));
    Screen.setEditable(false);
    
    //p3
    JPanel p3 = new JPanel();
    //사칙연산
    p3.setLayout(new GridLayout(5,1));
    p3.add(JAdd = new JButton("+"));
    //+버튼을 3패널에 생성
    p3.add(JSubtract = new JButton("-"));
    p3.add(JMultiply = new JButton("*"));
    p3.add(JDivide = new JButton("/"));
    p3.add(JClear = new JButton("="));

    add(p);//액션기능추가
    JNum1.addActionListener(new ListenToOne());
    JNum2.addActionListener(new ListenToTwo());
    JNum3.addActionListener(new ListenToThree());
    JNum4.addActionListener(new ListenToFour());
    JNum5.addActionListener(new ListenToFive());
    JNum6.addActionListener(new ListenToSix());
    JNum7.addActionListener(new ListenToSeven());
    JNum8.addActionListener(new ListenToEight());
    JNum9.addActionListener(new ListenToNine());
    JNum0.addActionListener(new ListenToZero());

    JAdd.addActionListener(new ListenToAdd());
    JSubtract.addActionListener(new ListenToSubtract());
    

        setVisible(true);
        setPreferredSize(new Dimension(600,600/12*9));
        setSize(600,600/12*9);
        
        setLocationRelativeTo(null);
        //set명령어중 대소문자 구별.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }        
}
