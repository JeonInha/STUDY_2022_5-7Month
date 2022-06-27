import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Main5_Keybord extends JFrame {
	private int x;
	private int y;
	
	public Main5_Keybord() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");
		x=100;
		y=100;
		lbl.setBounds(x, y, 50, 50);
		
		pnl.add(lbl);
		add(pnl);
		
		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyListener() {
			// KeyAdapter 사용하면 모든 클래스를 가져가지 않아도 됨
			
			@Override
			public void keyTyped(KeyEvent e) {
				// 하나의 키가 온전하게 입력이 될 때 (like click)
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// 키를 눌렀을 때
				char c = e.getKeyChar(); // 어떤 문자를 입력했는지 확인(문자형태만 인지)
				int code = e.getKeyCode(); // 입력한 것을 키코드로 확인: 문자가 아니더라도 OK
				
				if (code == KeyEvent.VK_LEFT) {		
					x-=20;
					
				} else if (code == KeyEvent.VK_RIGHT) {
					x+=20;
				} else if (code == KeyEvent.VK_UP||code == KeyEvent.VK_KP_UP) {
					y-=20;
				} else if (code == KeyEvent.VK_DOWN||code == KeyEvent.VK_KP_DOWN) {
					// VK_KP_DOWN // 버추얼키보드_키패드_ 화살표 아래
					y+=20;

				} else 
					lbl.setText(String.valueOf(c));
				
				lbl.setLocation(x, y);
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// 버튼에서 손을 뗐을때
			}	
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		new Main5_Keybord().setVisible(true);

	}

}
