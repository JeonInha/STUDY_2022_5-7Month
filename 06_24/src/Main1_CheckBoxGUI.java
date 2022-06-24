import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Main1_CheckBoxGUI extends JFrame {
	
	public Main1_CheckBoxGUI() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째");
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		
		check2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (check2.isSelected())
					System.out.println("클릭했지롱!!");
				else 
					System.out.println("클릭해제했지롱 ...");
			}
		});
		
		check1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange(); // 선택되면 2, 선택안되면 1;
				System.out.println(result);
				System.out.println(result==ItemEvent.DESELECTED);
				
			}
			
		});
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main1_CheckBoxGUI().setVisible(true);

	}

}
