import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main3_Mouse extends JFrame {
	public Main3_Mouse() {
		JPanel pnl = new JPanel(null);	// 기본적으로 가지고있는 flowLayout을 쓰지 않겠당
		pnl.setPreferredSize(new Dimension(500, 500));	// 이건 또 뭐더라
		
		JButton btn = new JButton("Click Me");
		
		btn.setBounds(150, 150, 100, 100);	// 이건 뭐더라
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("잡았당");
			}
		});
		
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);	// 프레임 크기 고정
		
	}
	
	public static void main(String[] args) {
		new Main3_Mouse().setVisible(true);
	}
}
