import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter2 extends JFrame implements ActionListener {
	
	private int num=0;
	private int pushcount=0;
	JPanel pnl = new JPanel();
	JLabel lbl = new JLabel(Integer.toString(num));
	JButton btn = new JButton("증가");
	JButton btn2 = new JButton("감소");
	
	public void makeRainbow(JPanel pnl) {
		if (pushcount%6==1) {
			pnl.setBackground(Color.darkGray);
		} else if (pushcount%6==2) {
			pnl.setBackground(Color.orange);
		} else if (pushcount%6==3) {
			pnl.setBackground(Color.white);
		} else if (pushcount%6==4) {
			pnl.setBackground(Color.gray);
		} else if (pushcount%6==5) {
			pnl.setBackground(Color.blue);
		} else {
			pnl.setBackground(Color.pink);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		pushcount++;
		makeRainbow(pnl);
		
		if (e.getSource().equals(btn)) {	// 오브젝트 참조 알려주는거라 다운캐스팅가능, 뭐 이것저것.. 다 가능
			num++;
		} else if (e.getSource().equals(btn2)) {
			num--;
		} 
		lbl.setText(Integer.toString(num));
	}
		
	
	public MyCounter2() {
		super("카운터");
		
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
		
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				++pushcount;
//				++num;
//				lbl.setText(Integer.toString(num));
//				makeRainbow(pnl);
//				
//			}		
//		});
//		
//		btn2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				++pushcount;
//				--num;
//				lbl.setText(Integer.toString(num));
//				makeRainbow(pnl);
//			}
//			
//		});
		
		
		
		pnl.add(btn2);
		pnl.add(lbl);
		pnl.add(btn);
		
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyCounter2().setVisible(true);
	}
}

