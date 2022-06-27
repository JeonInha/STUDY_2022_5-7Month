import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main9_CardLayout extends JFrame {
	
	public Main9_CardLayout() {
		CardLayout layout = new CardLayout();
		// 개발자의 의도대로 조종할 수 있는 탭메뉴
		JPanel center = new JPanel(layout);
		// 카드보드 레이아웃을 가진 패널 생성
		
		
		JPanel pnl1 = makePanel("1111");
		JPanel pnl2 = makePanel("2222");
		JPanel pnl3 = makePanel("3333");
		JPanel pnl4 = makePanel("4444");
		
		center.add(pnl1, "A");
		center.add(pnl2, "B");
		center.add(pnl3, "C");
		center.add(pnl4, "D");
		
		add(center);
		
		JButton btnNext = new JButton("다음");
		JButton btnPrev = new JButton("이전");

		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnPrev);
		pnlSouth.add(btnNext);
		
		add(pnlSouth, "South");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("다음"))
					layout.next(center);
				else 
					layout.previous(center);
				// next, privious로 순환하게 만들 수 있음.
			}
		};
		
		btnNext.addActionListener(listener);
		btnPrev.addActionListener(listener);
		layout.show(center, "A");
		// 패널 이름, 짝을 이루고 있는 키이름을 넣으면 짝이 맺어져서 해당하는 화면만 보여줌
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	private JPanel makePanel(String text) {
	JPanel pnl = new JPanel();
	pnl.add(new JLabel(text));
	return pnl;
	}
	
	public static void main(String[] args) {
		new Main9_CardLayout().setVisible(true);
	}
}
