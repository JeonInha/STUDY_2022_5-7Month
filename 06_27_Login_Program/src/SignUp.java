import java.awt.event.*;

import javax.swing.*;

public class SignUp extends JPanel {
	
	JPanel pnl = new JPanel();
	JLabel IDsysM = new JLabel("ID 입력: ");
	JTextField idInput = new JTextField(10); // 아이디입력부
	JLabel PWsysM = new JLabel("PW 입력: ");
	JPasswordField pwInput = new JPasswordField(10); // PW입력부
	JLabel PWchecksysM = new JLabel("PW 확인: ");
	JPasswordField pwCheck = new JPasswordField(10); // PW입력부
	JLabel SignUpsysM = new JLabel("\n아이디와 패스워드를 입력하세요.");
	
	JButton SignUpBtn = new JButton("Sign Up");
	JButton loginBtn = new JButton("back to login");
	
	BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
	
	public JTextField getIdInput() {
		return idInput;
	}

	public JPasswordField getPwInput() {
		return pwInput;
	}

	public JPasswordField getPwCheck() {
		return pwCheck;
	}

	public JButton getSignUpBtn() {
		return SignUpBtn;
	}

	public JButton getLoginBtn() {
		return loginBtn;
	}
	
	public JLabel getSignUpsysM() {
		return SignUpsysM;
	}

	public JPanel SignUpSwing() {
		
		pnl.setLayout(box);
		
		pnl.add(IDsysM);
		pnl.add(idInput);
		pnl.add(PWsysM);
		pnl.add(pwInput);
		pnl.add(PWchecksysM);
		pnl.add(pwCheck);
		pnl.add(SignUpsysM);
		pnl.add(SignUpBtn);
		pnl.add(loginBtn);
		
		return pnl;
	}
}
