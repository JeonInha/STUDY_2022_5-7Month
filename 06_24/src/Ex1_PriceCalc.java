import java.awt.*;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;
import javax.swing.*;

public class Ex1_PriceCalc extends JFrame {
	
	int menu1_price = 3000;
	int menu2_price = 5000;
	int menu3_price = 10000;
	int menu4_price = 1500;
	int allPrice = 0;
	

		Ex1_PriceCalc() {
		// 전체 1단 구성
		JPanel all = new JPanel();
		JPanel top = new JPanel();
		JPanel bottom = new JPanel();
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		
		all.add(top);
		
		all.add(bottom);
		bottom.add(left);
		bottom.add(right);
		
		BoxLayout allBoxLayout = new BoxLayout(all, BoxLayout.Y_AXIS);
		all.setLayout(allBoxLayout);
		
		// in right
		JLabel resultCalcPrice = new JLabel(String.valueOf(allPrice));
		right.add(resultCalcPrice);
		BoxLayout rightBoxLayout = new BoxLayout(right, BoxLayout.Y_AXIS);
		right.setLayout(rightBoxLayout);
		right.setBackground(Color.white);
		
		// in left
		BoxLayout leftBoxLayout = new BoxLayout(left, BoxLayout.Y_AXIS);
		left.setLayout(leftBoxLayout);
		
		ArrayList<JCheckBox> menuList = new ArrayList<JCheckBox>();
		
		JCheckBox menu1 = new JCheckBox("짜장면: 3000");
		JCheckBox menu2 = new JCheckBox("짬뽕: 5000");
		JCheckBox menu3 = new JCheckBox("탕수육: 10000");
		JCheckBox menu4 = new JCheckBox("콜라: 1500");
		
		ItemListener MenuAction = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange(); // 선택되면 2, 선택안되면 1;
				if (result==ItemEvent.SELECTED) {
					if (e.getSource()==menu1) 
						allPrice+=menu1_price;
					if (e.getSource()==menu2) 
						allPrice+=menu2_price;
					if (e.getSource()==menu3) 
						allPrice+=menu3_price;
					if (e.getSource()==menu4) 
						allPrice+=menu4_price;
				}
				if (result==ItemEvent.DESELECTED) {
					if (e.getSource()==menu1) 
						allPrice-=menu1_price;
					if (e.getSource()==menu2) 
						allPrice-=menu2_price;
					if (e.getSource()==menu3) 
						allPrice-=menu3_price;
					if (e.getSource()==menu4) 
						allPrice-=menu4_price;
				}
				resultCalcPrice.setText(String.valueOf(allPrice));
			}
			
		};
		
		left.add(menu1);
		left.add(menu2);
		left.add(menu3);
		left.add(menu4);
		menu1.addItemListener(MenuAction);
		menu2.addItemListener(MenuAction);
		menu3.addItemListener(MenuAction);
		menu4.addItemListener(MenuAction);
		
//		for (JCheckBox a : menuList) {
//			left.add(a);
//			a.addItemListener(MenuAction);
//		};
		
		/// top
		JCheckBox allCheck = new JCheckBox("모두 선택");
		JCheckBox allDisCheck = new JCheckBox("모두 선택 해제");
		top.add(allCheck);
		top.add(allDisCheck);
		
		ItemListener allCheckAction = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getSource()==allCheck&&((AbstractButton) e.getSource()).isSelected()) {
					menu1.setSelected(true);
					menu2.setSelected(true);
					menu3.setSelected(true);
					menu4.setSelected(true);
				}
				if (e.getSource()==allDisCheck&&((AbstractButton) e.getSource()).isSelected()) {
					menu1.setSelected(false);
					menu2.setSelected(false);
					menu3.setSelected(false);
					menu4.setSelected(false);
				}
			}
		};
		
		allCheck.addItemListener(allCheckAction);
		allDisCheck.addItemListener(allCheckAction);
		
		
		
		setTitle("중국집계산기");
		add(all);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		}
		
		
		public static void main(String[] args) {
			new Ex1_PriceCalc().setVisible(true);;
	}
}
