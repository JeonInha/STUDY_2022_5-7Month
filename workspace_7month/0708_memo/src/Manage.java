import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Manage {

	File file = null;
	JLabel fileName = new JLabel("파일이름은?");
	TextArea text = new TextArea(null, 30, 60, TextArea.SCROLLBARS_VERTICAL_ONLY);

	Manage() {
		JFileChooser chooser = new JFileChooser();
		JFrame main = new JFrame();

		/////////////////////////////
		JPanel pnl = new JPanel(new BorderLayout());
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(box);

		JPanel top = new JPanel();
		JPanel middle = new JPanel();
		JPanel bottom = new JPanel();

		JButton save = new JButton("저장");
		JButton anotherSave = new JButton("다른이름으로 저장");
		JButton load = new JButton("불러오기");
		JLabel a = new JLabel("   폰트 크기: ");

		JTextField inputsize = new JTextField(4);
		JButton fontsize = new JButton("입력(미구현)");

		top.add(anotherSave);
		top.add(save);
		top.add(load);
		top.add(a);
		top.add(inputsize);
		top.add(fontsize);
		middle.add(fileName);
		bottom.add(text);

		pnl.add(top);
		pnl.add(middle);
		pnl.add(bottom);
		
		fontsize.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("돋움", Font.PLAIN, Integer.valueOf(inputsize.getText())));
			}
		});

		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (file == null) {
					//////////////////////////////////////////
					int result = chooser.showSaveDialog(null);
					if (result == JFileChooser.APPROVE_OPTION) {
						file = chooser.getSelectedFile();
						letsSave();
					}
				} else {
					letsSave();
				}
			}
		});

		anotherSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					file = chooser.getSelectedFile();
					letsSave();
				}
			}
		});

		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					file = chooser.getSelectedFile();
					BufferedReader read = null;
					String line = null;
					try {
						read = new BufferedReader(new FileReader(file));
						line = read.readLine();
						text.setText(null);
						while (line != null) {
							text.append(line);
							text.append("\n");
							line = read.readLine();
						}
						fileName.setText(file.getName());
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							read.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});

		main.add(pnl);

		/////////////////////////////
		main.setTitle("notePad");
		main.setSize(700, 600);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	void letsSave() {
		BufferedWriter save = null;
		String line = null;
		try {
			save = new BufferedWriter(new FileWriter(file));
			line = text.getText();
			save.write(line);
			fileName.setText(file.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (save != null) {
				try {
					save.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
