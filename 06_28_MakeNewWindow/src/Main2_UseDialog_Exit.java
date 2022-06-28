import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ExitDialog extends Dialog {

	private boolean exit;
	
	public boolean showDialog() {
		setVisible(true);
		return exit;
	}
	
	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?", true);
		
		JPanel pnl = new JPanel();
		JButton btnY = new JButton("종료");
		JButton btnN = new JButton("취소");
		
		pnl.add(btnY);
		pnl.add(btnN);
		
		add(pnl);
		setSize(250, 200);
		
		ActionListener a = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnY))
					exit = true;
				dispose();
			}
		};
		
		btnY.addActionListener(a);
		btnN.addActionListener(a);
	}
}

public class Main2_UseDialog_Exit extends JFrame {
	
	Main2_UseDialog_Exit() {
		
		addWindowListener(new WindowListener() {
			// 윈도우 창을 관장하는 이벤트
			// 어댑터 사용 가능
			
			@Override
			public void windowOpened(WindowEvent e) {
				// 창이 열렸을 때
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// 닫으려고 할 때(닫기 버튼 눌렀을 때)
//				ExitDialog dialog = new ExitDialog(Main2_UseDialog_Exit.this);
//				boolean result = dialog.showDialog();
//				if (result==true) {
//				setDefaultCloseOperation(EXIT_ON_CLOSE);				
//				}
				
				// 자동으로 만들어주는 다이얼로그. 
				int result = JOptionPane.showConfirmDialog(Main2_UseDialog_Exit.this, "종료하시겠습니까?", "종료확인", JOptionPane.YES_NO_OPTION);
				// Y / N / 취소
				if (result == JOptionPane.YES_OPTION)
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				
//				JOptionPane.showInputDialog(Main2_UseDialog_Exit.this, "입력창");
//				// 입력, 취소
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// 닫혔을 때
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// 최소화되었을때
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// 최소화 풀렸을때
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// 활성화(포커싱되었을때)
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// 비활성화(포커스아웃되었을때)
			}
			
		});
		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		// 닫기 버튼 누를 때 아무일도 안일어남
	}

	public static void main(String[] args) {
		new Main2_UseDialog_Exit().setVisible(true);

	}

}
