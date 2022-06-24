import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Main3_RadioBtn extends JFrame {
	public Main3_RadioBtn() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1");
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		ButtonGroup group = new ButtonGroup();
		// 추상적인 버튼들을 다 집어넣을 수 있음. 일반적으로 라디오 버튼들의 선택지를 하나로 묶어주기 위해 쓰지만.
		
		JRadioButton rdb4 = new JRadioButton("라디오4(따로동작)");
		JRadioButton rdb5 = new JRadioButton("라디오5(따로동작)");
		
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		
		rdb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange()==ItemEvent.SELECTED);
			}
		});
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
		pnl.add(rdb4);
		pnl.add(rdb5);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main3_RadioBtn().setVisible(true);

	}

}
