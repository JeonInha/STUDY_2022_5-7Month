import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

public class Main4_ImageInsert extends JFrame {
	public Main4_ImageInsert() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		URL img1 = Main4_ImageInsert.class.getClassLoader().getResource("춘식3.png");
		URL img2 = Main4_ImageInsert.class.getClassLoader().getResource("춘식2.png");
		// 클래스 로더: ClassPath에 담긴 자원들을 찾을수있게 함
		// 겟 소스: 자원 위치를 URL로 알려줌.
		// 파일경로는 슬러시로 표현
		this.getClass();
//		Image image = kit.getImage("춘식3.png");
//		Image image2 = kit.getImage("춘식2.png");
		// 툴키트
		// 이미지 자원은 src 안에 위치하게 하여 배포할 때에도 포함되게 함
		ImageIcon image = new ImageIcon(kit.getImage(img1));
		ImageIcon image2 = new ImageIcon(kit.getImage(img2));
		
//		JLabel lbl = new JLabel(new ImageIcon(image));
		JLabel lbl = new JLabel(image);
		pnl.add(lbl);
		// 라벨은 텍스트도 표현가능하지만 이미지도 표현가능
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
//				lbl.setIcon(new ImageIcon(image2));
				lbl.setIcon(image2);
			}

			@Override
			public void mouseExited(MouseEvent e) {
//				lbl.setIcon(new ImageIcon(image));
				lbl.setIcon(image);
			}
		});
		
		add(pnl);
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main4_ImageInsert().setVisible(true);
	}
}
