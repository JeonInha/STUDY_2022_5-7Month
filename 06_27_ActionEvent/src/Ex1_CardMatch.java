import java.awt.GridLayout;

import javax.swing.*;

public class Ex1_CardMatch extends JFrame {

	Ex1_CardMatch() {
		
		JPanel pnl = new JPanel();
		JPanel top = new JPanel();
		JPanel card = new JPanel();
		GridLayout grid = new GridLayout(4, 4);
		
		pnl.add(top);
		pnl.add(card);
		
		card.setLayout(grid);
		for (int i = 0; i<16; i++) {
			if (i%8==0) {
				card.add(new JButton(new ImageIcon("pokemon")));
			}
			else if (i%8==1) {
				card.add(new JButton(new ImageIcon("pokemon2")));
			}
			else if (i%8==2) {
				card.add(new JButton(new ImageIcon("pokemon3")));
			}
			else if (i%8==3) {
				card.add(new JButton(new ImageIcon("pokemon4")));
			}
			else if (i%8==4) {
				card.add(new JButton(new ImageIcon("pokemon5")));
			}
			else if (i%8==5) {
				card.add(new JButton(new ImageIcon("pokemon6")));
			}
			else if (i%8==6) {
				card.add(new JButton(new ImageIcon("pokemon7")));
			}
			else if (i%8==7) {
				card.add(new JButton(new ImageIcon("pokemon8")));
			}
		}
		
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex1_CardMatch().setVisible(true);
	}
}
