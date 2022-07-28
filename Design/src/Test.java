import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {
	
	JFrame ab = new JFrame();
	JButton a = new ColorButton("연습");
	JButton b = new ColorButton("연습", Design.LSkyblue, Design.SBlack);
	JButton c = new ColorButton("연습", Design.LSkyblue, Design.SBlack, Design.SBlue);
	
	JPanel pnl = new JPanel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
