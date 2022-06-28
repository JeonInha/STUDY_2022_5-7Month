import java.awt.Color;

import javax.swing.*;

public class Login extends JPanel {
	JPanel pnl = new JPanel();

	JPanel loginInputBox = new JPanel();
	JPanel idBox = new JPanel();
	JPanel pwBox = new JPanel();
	JPanel loginButtonBox = new JPanel();
	BoxLayout loginButtonLayout = new BoxLayout(loginButtonBox, BoxLayout.Y_AXIS);
	BoxLayout loginInputLayout = new BoxLayout(loginInputBox, BoxLayout.Y_AXIS);
	JLabel idLabel = new JLabel("ID: ");
	JLabel pwLabel = new JLabel("PW: ");
	JTextField idInput = new JTextField(10); // 아이디입력부
	JPasswordField pwInput = new JPasswordField(10); // PW입력부
	JButton loginBtn = new JButton("Login"); // 로그인 버튼
	JButton joinBtn = new JButton("join"); // 가입 버튼
	
	public JTextField getIdInput() {
		return idInput;
	}


	public JPasswordField getPwInput() {
		return pwInput;
	}

	public JButton getLoginBtn() {
		return loginBtn;
	}

	public JButton getJoinBtn() {
		return joinBtn;
	}

	public JPanel LoginSwing() {
		
		////////////////////////좌측 입력부
		loginInputBox.setLayout(loginInputLayout);
		loginButtonBox.setLayout(loginButtonLayout);
		
		idBox.add(idLabel);
		idBox.add(idInput);
		pwBox.add(pwLabel);
		pwBox.add(pwInput);
		loginInputBox.add(idBox);
		loginInputBox.add(pwBox);
		pnl.add(loginInputBox);

		////////////////////////우측 버튼부

		loginButtonBox.add(loginBtn);
		loginButtonBox.add(joinBtn);

		pnl.add(loginButtonBox);

		////////////////////////////////////////////

		return pnl;
	}
}
