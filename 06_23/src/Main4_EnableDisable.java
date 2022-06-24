import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4_EnableDisable extends JFrame implements ActionListener {
	JPanel pnl = new JPanel();
	JButton btnEnable = new JButton("활성화");
	JButton btnDisable = new JButton("비활성화");
	JButton btnNotShown = new JButton("보이나??");
	List<JButton> list = new ArrayList<>();

	

		
	public Main4_EnableDisable() {
		super("버튼 활성화 테스트~");
		
		btnDisable.setEnabled(true);	// 비활성화
		btnNotShown.setVisible(false);	// 아예 숨기기
		
		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		
		for (int i = 1; i<=5; i++) {
			JButton btn=new JButton(String.valueOf(i));
			pnl.add(btn);
			list.add(btn);
		}
		
		
		add(pnl);
		
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main4_EnableDisable().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btnEnable)) {
				for (JButton a : list) {
				a.setEnabled(true);
				}
			} else if (e.getSource().equals(btnDisable)) {
				for (JButton a : list) {
					a.setEnabled(false);
					}
			}	
	}

	

	

	
}
