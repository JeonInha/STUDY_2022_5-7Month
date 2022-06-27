import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main2_Mouse extends JFrame {
	public Main2_Mouse() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("버튼입니다");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 발생");	
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			// MouseAdapter: mouseListener를 구현한 메소드인데 
			//바디가 비어있는 재정의메소드가 들어있음. 원하는 것만 재정의하면 됨.
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 Pressed");
			}	
		});
		
		
		// 버튼 하나에 여러가지 Listener를 넣을 수 있음.
		
		pnl.add(btn);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2_Mouse().setVisible(true);
	}

}
