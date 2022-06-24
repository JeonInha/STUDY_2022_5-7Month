import javax.swing.*;

public class Main2_GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("제목입니다");	// 생성자로 타이틀을 전달받음.
		frame.setTitle("제목제목제목"); // 세터를 이용할수도 있음!
		
		frame.getContentPane().add(new JLabel("Hello World!"));	// 새 JLable로 "헬로월드"문단 만들어넣음
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창을 껐을 때 프로그램의 종료 여부
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		System.out.println("asdf");
		
		// 나만의 구조를 만들기 위해 상속구조 활용
	}

}
