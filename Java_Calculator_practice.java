import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//AWT 기술을 기반으로 작성된 java 라이브러리

public class Java_Calculator_practice extends JFrame {
        //메인 부모 클래스
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
        //앞에 문자열값을 실수값으로 변환하기 위한 수단과 함께 값저장을 위함.
        private double Slove_Temp;
        //Temp와 같이 계산가하기 위한 수단
        private JTextField Screen;
        //값을 지정하여 넣거나 가져올때 나온 수단\

        String display = "";

    // 버튼선언
        boolean bool_add = false;
        boolean bool_Subtract = false;
        boolean bool_Multiply = false;
        boolean bool_Divide = false;

    public Java_Calculator_practice (){
    //자식 상속클래스 1
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    //숫자버튼생성을 JFrame에 넣기위함
    JPanel p2 = new JPanel();
    //textFiled값을 넣기위한 생성을 JFrame에 넣기위함
    JPanel p3 = new JPanel();
    //사칙연산버튼 생성을 JFrame에 넣기위함

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
    p1.add(JClear = new JButton("C"));

    p2.add(Screen = new JTextField(20));
    //스크린 이라는 이름에 텍스트 박스생성
    Screen.setHorizontalAlignment(JTextField.RIGHT);
    //정렬기능(텍스트박스 텍스트 값 나올방향을 오른쪽으로 지정)
    Screen.setEditable(false);
    //편집기능(텍스트 박스안에 입력 불가기능)

    p3.setLayout(new GridLayout(5,1));
    p3.add(JAdd = new JButton("+"));
    //+버튼을 3패널에 생성
    p3.add(JSubtract = new JButton("-"));
    p3.add(JMultiply = new JButton("*"));
    p3.add(JDivide = new JButton("/"));
    p3.add(JSolve = new JButton("="));
    
    p.add(p1, BorderLayout.SOUTH);
    p.add(p2, BorderLayout.NORTH);
    p.add(p3, BorderLayout.EAST);
    add(p);

    JNum1.addActionListener(new List_1());
    JNum2.addActionListener(new List_2());
    JNum3.addActionListener(new List_3());
    JNum4.addActionListener(new List_4());
    JNum5.addActionListener(new List_5());
    JNum6.addActionListener(new List_6());
    JNum7.addActionListener(new List_7());
    JNum8.addActionListener(new List_8());
    JNum9.addActionListener(new List_9());
    JNum0.addActionListener(new List_0());
    JAdd.addActionListener(new List_add());
    JSubtract.addActionListener(new List_Subtract());
    JMultiply.addActionListener(new List_Multiply());
    JDivide.addActionListener(new List_Divide()); 
    JSolve.addActionListener(new List_Solve());
    JClear.addActionListener(new List_Clear());
    }
    
    class List_Clear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Screen.setText("");
            bool_add = false;
            bool_Subtract = false;
            bool_Multiply = false;
            bool_Divide = false;

            Temp=0;
            Slove_Temp=0;
        }
    }
    
    class List_1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"1");

        }
    }

    class List_2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"2");
        }
    }

    class List_3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"3");
        }
    }

    class List_4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"4");
        }
    }

    class List_5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"5");
        }
    }

    class List_6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"6");
        }
    }

    class List_7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"7");
        }
    }

    class List_8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"8");
        }
    }

    class List_9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"9");
        }
    }

    class List_0 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"0");
        }
    }

    class List_add implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"+");
        }
    }

    class List_Subtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"-");
        }
    }

    class List_Multiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"*");
        }
    }

    class List_Divide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display=Screen.getText();
            Screen.setText(display+"/");
        }
    }

    class List_Solve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Slove_Temp == duoble.dou(Slove_Temp+Temp)
        }
    }
       /* setVisible(true);
        setPreferredSize(new Dimension(600,600/12*9));
        setSize(600,600/12*9);
        
        setLocationRelativeTo(null);
        //set명령어중 대소문자 구별.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);*/
    }        

