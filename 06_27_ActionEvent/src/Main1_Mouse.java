import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main1_Mouse extends JFrame {
	
	Main1_Mouse() {
		MouseListener listener = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("==마우스 클릭=="); // 클릭
				
				switch (e.getButton()) { // 사용자가 누른 마우스버튼을 정수의 형태로 알려줌
				case MouseEvent.BUTTON1: 	// 이 버튼 123은
					System.out.println("1번");
					break;
				case MouseEvent.BUTTON2:	// OS마다
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3:	// 다를 수 있음!
					System.out.println("3번");
				} 
				
				System.out.println("왼쪽?"+SwingUtilities.isLeftMouseButton(e));	
				// 스윙 유틸. 마우스버튼을 왼쪽을 눌렀는지, 오른쪽을 눌렀는지 알려줌.
				
				if (e.getClickCount()>=2) {	// 클릭 횟수 세기
					System.out.println("===더블 클릭===");	// 더블클릭
				}
			}

			////////////////////////////////////
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼을 누름");	// 누르는 순간에 발생
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 뗌");	// 떼는 순간에 발생
			}
			
			///////////////////////////////////

			@Override
			public void mouseEntered(MouseEvent e) {	// 호버를 인식
				System.out.println("hover");
			}

			@Override
			public void mouseExited(MouseEvent e) {	// 호버에서 벗어남을 인식
				System.out.println("dis-hover");
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("드래그합니다~"+e.getX()+", "+e.getY());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다~"+e.getX()+", "+e.getY());
				//좌상단이 0, 0
			}
			
		};
		
		JPanel pnl = new JPanel();
		add(pnl);
		pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main1_Mouse().setVisible(true);

	}

}
