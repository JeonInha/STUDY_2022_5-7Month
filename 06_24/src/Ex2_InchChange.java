import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class Ex2_InchChange extends JFrame {
	
	// 필드
	double input;
	double changeResult;
	String measures = "cm";
	final static double INCH = 2.54;
	final static double KM = 1000;

	Ex2_InchChange() {
		// 전체
		JPanel pnl = new JPanel();
		JPanel top = new JPanel();
		JPanel bottom = new JPanel();
		JPanel inputBox = new JPanel();
		JPanel outputBox = new JPanel();
		JPanel rdbBox = new JPanel();
		
		rdbBox.add(inputBox);
		rdbBox.add(outputBox);
		
		top.add(rdbBox);
		
		pnl.add(top);
		pnl.add(bottom);
		
		BoxLayout pnlLayout = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(pnlLayout);
		
		BoxLayout rdbBoxLayout = new BoxLayout(rdbBox, BoxLayout.Y_AXIS);
		rdbBox.setLayout(rdbBoxLayout);

		
		// top: 라디오버튼 2, 변환 버튼
		JLabel inputRabel = new JLabel("입력:: ");
		JLabel toRabel = new JLabel("출력:: ");
		
		JRadioButton toInch = new JRadioButton("Inch");
		JRadioButton toCm = new JRadioButton("cm");
		JRadioButton toKm = new JRadioButton("km");
		
		JRadioButton inputInch = new JRadioButton("Inch");
		JRadioButton inputCm = new JRadioButton("cm");
		JRadioButton inputKm = new JRadioButton("km");
		
		List<JRadioButton> inputBtnList = new ArrayList<>(Arrays.asList(inputInch, inputCm, inputKm));
		List<JRadioButton> outputBtnList = new ArrayList<>(Arrays.asList(toInch, toCm, toKm));
		
		ButtonGroup toWhatMesurement = new ButtonGroup();
		ButtonGroup inWhatMesurement = new ButtonGroup();
		
		JButton print = new JButton("출력");
		
		inputBox.add(inputRabel);
		for (JRadioButton rb : inputBtnList) {
			inputBox.add(rb);
			inWhatMesurement.add(rb);
		}
		
		outputBox.add(toRabel);
		for (JRadioButton rb : outputBtnList) {
			outputBox.add(rb);
			toWhatMesurement.add(rb);
		}
				
		top.add(print);

		

		// bottom: 입력부, 출력부
		JTextField inputText = new JTextField(20);
		JLabel printResult = new JLabel("= ?");
		bottom.add(inputText);
		bottom.add(printResult);

		// 동작부
		print.addActionListener(new ActionListener() { // 출력버튼을 누르면
			public void actionPerformed(ActionEvent e) {
				try {
					if (inputCm.isSelected()) { // 텍스트상자의 값을 읽어서- (cm 변환)
						input = Double.valueOf(inputText.getText());
					} else if (inputInch.isSelected()) {
						input = (Double.valueOf(inputText.getText())) * INCH;
					} else if (inputKm.isSelected()) {
						input = (Double.valueOf(inputText.getText())) * KM;
					}

					if (toInch.isSelected()) { // 라디오박스가 어디체크되었는지에따라 값을 계산하고
						measures = toInch.getText();
						changeResult = input / INCH;
					} else if (toCm.isSelected()) {
						measures = toCm.getText();
						changeResult = input;
					} else if (toKm.isSelected()) {
						measures = toKm.getText();
						changeResult = input / KM;
					}
						
					printResult.setText(String.format("%.4f %s", changeResult, measures)); // 값을 출력하는데
				} catch (Exception e1) {
					printResult.setText("숫자를 입력하세요."); // 숫자 말고 다른 걸 입력하면 예외처리
				}
			}
		});

		// 나머지
		setTitle("길이 단위 변환기");
		add(pnl);
		setSize(500, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex2_InchChange().setVisible(true);
	}
}
