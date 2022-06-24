import java.awt.*;
import javax.swing.*;

public class Main6 extends JFrame {
	public Main6() {
		JPanel pnl = new JPanel();
		// FlowLayout flow = new FlowLayout();
		//중앙 정렬과 기본 5단위 수평 및 수직 간격으로 새 컨테이너 생성(기본값)
//		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);	딱 정렬만 가능
//		pnl.setLayout(flow);
		
		add(pnl);
		
//		BorderLayout border = new BorderLayout();
//		pnl.setLayout(border);
	
		
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		btn1.setPreferredSize(new Dimension(100, 100)); 	// 크기 제안
		btn2.setPreferredSize(new Dimension(100, 100));
		btn3.setPreferredSize(new Dimension(100, 100));
		btn1.setMaximumSize(new Dimension(100, 100));	// 최대크기 설정
		btn2.setMinimumSize(new Dimension(100, 100));	// 최소크기 설정
		
//		pnl.add(btn1, BorderLayout.EAST);
//		pnl.add(btn2, BorderLayout.NORTH);
//		pnl.add(btn3, BorderLayout.SOUTH);
//		pnl.add(btn3, BorderLayout.WEST);	// 같은 버튼을 2번 넣는게 아니라 맨 마지막에 추가시킨 하나만 적용
		
		BoxLayout box = new BoxLayout(pnl, BoxLayout.X_AXIS);
		pnl.setLayout(box);
		pnl.add(btn1, "west");
		pnl.add(btn2);
		
		GridLayout grid = new GridLayout(2, 2);	// 영역을 정해진 크기로 쪼개서 나눔. 
		// 크기에 대한 설정은 개무시함,,
		pnl.setLayout(grid);
		
		pnl.setLayout(null); 	// 레이아웃 매니저를 없앰

		
		btn1.setLocation(10, 30); // 기준점은 최좌상단
		btn1.setSize(200, 300);
		// 위의 둘을 한번에 할 수 있는 메소드
		btn1.setBounds(200, 50, 100, 70);
//		btn1.setBounds(x, y, width, height);
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
