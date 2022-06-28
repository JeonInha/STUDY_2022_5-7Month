import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class SubWindow extends JDialog {
	// JDialog:: 전체화면, 최소화 버튼이 없는 것 빼면 JFrame과 유사
	
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("서브버튼");
	
	public SubWindow(JFrame owner) {
		// 매개변수로 전달받음
		super(owner, true);
		// super로 이 창을 생성한 창 / modal값 여부 상속받음
		// setModal(true);
		// 서브윈도우가 켜져있는 동안에는 이 프로그램의 다른 창과는 상호작용이 불가능하게 막아둠.
		setTitle("서브 창");
		// setTitle();
		// 매개변수로 여는 창을 전달받으면 게터로 이 다이얼로그를 생성할 수 있게 하는 창을 호출할 수 있음.
		
		add(tf, "North");
		add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				// 창 닫게 함
			}
		});

		setSize(200, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// 닫았을 때 프로그램이 종료되지 않고 서브창만 꺼짐.
		// 이것이 기본값이라 적어주지 않아도 됨.
		// 다이얼로그는 EXIT_ON_CLOSE를 주면 런타임오류 발생
	}
	
	public String showDialog() {
		setVisible(true);
		return tf.getText();
		// Dialog가 꺼질 때 tf의 getText()를 반환
	}
}

public class Main1_Dialog extends JFrame {
	public Main1_Dialog() {
		super("주요 창");

		JButton btn = new JButton("버튼");
		add(btn);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main1_Dialog.this);
				String result = dialog.showDialog();
				// 아래 동작을 간편하게 메소드로
				
				// new SubWindow(Main1_MakeNewWindow.this).setVisible(true);
				// 이 창을 생성하게 하는 창 전달. 이 경우 본인.
				// 모달값이 true라 이 시점에서 프로그램이 멈춘것처럼 보임.
				
				
				System.out.println("이 문장은 언제 호출될까?");
				// 다이얼로그 호출이 끝나면 이 문장이 출력됨.
				System.out.println("입력값은 "+result);
			}	
		});
	}

	public static void main(String[] args) {
		new Main1_Dialog().setVisible(true);

	}

}
