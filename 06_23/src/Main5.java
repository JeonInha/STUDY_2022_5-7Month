import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main5 extends JFrame {
	
	public Main5() {
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		btn1.setActionCommand("임의의 커멘드");	// 버튼마다 커멘드값을 따로 줄 수 있음
		
		pnl.add(btn1);
		pnl.add(btn2);
		
		add(pnl);
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());	// 가지고 있는 텍스트값 출력
			}
		};
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main5().setVisible(true);
	}

}
