import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event.*;
// 이벤트* : 각 이벤트 종류 모두 가져옴
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class git_java_test {
  //패키지 이름이 안맞을시 오류;;
    // 패키지내에 접근 제한자 public
    public static void main (String[] args) {
        // static : 메인 메소드[엔트리포인트] (반드시 pulic 존재)
        // void : 리턴타입 없음
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Lapunjel");
        JButton btn1 = new JButton("Push");
        JButton btn2 = new JButton("Exit");
        JButton btn3 = new JButton("Ch");
        JPanel btnPanel = new JPanel();
        JTextArea textArea = new JTextArea();
        JTextField textField = new JTextField(200);

        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        panel.setLayout(new BorderLayout());
        
        panel.add(label, BorderLayout.NORTH);
        // 레이아웃 글씨이벤
        panel.add(btnPanel, BorderLayout.WEST);
        // 버튼 이벤
        panel.add(textArea, BorderLayout.CENTER);
        // 텍스트 입력 이벤

        btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// actionPerformed 우리가 클릭을 할시 무언가 지시할수 있다.[기능추가 가능]
        textArea.append("Good Java\n");
			}
        });
        // 교수님에게 질문1
        
        btn2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            System.exit(0);
          }
        });
        //키보드 ESC누르면 나갈수 있게 이벤트하라.

        btn3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            label.setText(textArea.getText());
          }
        });

        frame.add(panel);

        frame.setResizable(false);
        // 화면 사이즈 변경불가
        frame.setVisible(true);
        // 화면사이즈
        frame.setPreferredSize(new Dimension(840, 840/12*9));
        // 화면 크기 재구성
        frame.setSize(840, 840/12*9);
        // 화면크기
        frame.setLocationRelativeTo(null);
        //위치 가운데 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //종료 이벤트
    }
}