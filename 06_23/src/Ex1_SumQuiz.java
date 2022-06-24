import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.BorderLayout;

class Ex1_SumQuiz extends JFrame {
	Random random = new Random();
	int num1;
	int num2;
	int calc;
	
	void setQuiz() {
		num1 = random.nextInt(50);
		num2 = random.nextInt(50);
		calc = num1 + num2;
	}
	

	Ex1_SumQuiz() {

		// 큰 레이아웃 위치 잡기
		JPanel pnl = new JPanel();
		JPanel top = new JPanel();	// 상단 박스
		top.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		JPanel bottom = new JPanel();	// 하단 박스
		
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(box);
		pnl.add(top);
		pnl.add(bottom);
		
		// 세부 박스들 위치 잡기
		JLabel quiz = new JLabel();
		quiz.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		JButton reset = new JButton("새 문제");
		JTextField inputBox = new JTextField(30);	// 입력받는 부분
		JButton CheckAnswer = new JButton("입력");	// 입력 동작 버튼
		JLabel result = new JLabel("입력하세요");		// 결과 출력
		top.setLayout(new BorderLayout(0, 0));
		
		top.add(quiz, BorderLayout.CENTER);
		top.add(reset, BorderLayout.EAST);
		bottom.add(inputBox);
		bottom.add(CheckAnswer);
		bottom.add(result);
		
		// 동작부
		setQuiz();
		quiz.setText(String.format("%d + %d = ?                                        ", num1, num2));
		
		ActionListener resetQuiz = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setQuiz();
				quiz.setText(String.format("%d + %d = ?                                        ", num1, num2));
				result.setText("입력하세요");
			}
		};
		
		ActionListener inputBtn = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (inputBox.getText().equals(Integer.toString(calc))) {
					result.setText("~정답!~");
				} else {
					result.setText("~오답!~");
				}
			}
		};
		
		CheckAnswer.addActionListener(inputBtn);
		reset.addActionListener(resetQuiz);
		
		// Header과 기타등등
		getContentPane().add(pnl);
		setTitle("퀴즈 게임");
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex1_SumQuiz().setVisible(true);

	}

}
