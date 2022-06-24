import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		
		// setBackGround(new color(192, 211, 150));
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//setLayout(new FlowLayout());
		JButton button = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		//this.add(button);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(button);
		this.add(button2);
		setVisible(true);
	}
}

public class Main3_MyFrame {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("새 제목");
		frame.setVisible(true);
	}
}
