import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener { 	// 클릭했을 때 동작 구현 (인터페이스)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭했네용~~");
	}
}


public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");
		
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.RED);
		
		
		JButton btn = new JButton("컨테이너안의 버튼");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명클래스 구현");
				pnl.setBackground(Color.pink);
			}
			
		});	// 액션 개체 전달
		
		add(pnl);
		pnl.add(btn);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}
}
