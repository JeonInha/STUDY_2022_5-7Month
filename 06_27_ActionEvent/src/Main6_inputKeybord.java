import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class Main6_inputKeybord extends JFrame {
	
	public Main6_inputKeybord() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
		// 입력문자 가림
		
		JTextArea ta = new JTextArea(20, 20);
		// 텍스트가 들어갈 수 있는 공간. 여러줄 입력 가능
		JScrollPane scrl = new JScrollPane(ta);
		// 스크롤할수있는 박스에 담은 뒤 추가하장
		
		pnl.add(tf);
		pnl.add(pf);

		add(pnl);
		add(ta, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
				
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				// 글자가 쳐졌는지 숫자가 처졌는지 확인가능
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					// setText(); // 새로운 텍스트값으로 변경
					ta.append(String.valueOf(ch)+"\n");
					// 기존의 문자열에 추가로 덧붙이는 메소드
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main6_inputKeybord().setVisible(true);

	}

}
