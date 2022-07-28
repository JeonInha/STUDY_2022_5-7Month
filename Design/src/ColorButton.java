import java.awt.*;
import javax.swing.JButton;

class ColorButton extends JButton {
	Color fontColor = Design.SBlack;
	Color bgColor = Design.LBeige;
	Color borderColor = Design.LBeige;

	public ColorButton(String text) {
		super(text);
	}

	// 테두리색 없는거!
	public ColorButton(String text, Color bgColor, Color fontColor) {
		super(text);
		this.bgColor = bgColor;
		this.fontColor = fontColor;
		this.borderColor = bgColor;
	}

	// 테두리색 있는거!
	public ColorButton(String text, Color bgColor, Color fontColor, Color borderColor) {
		super(text);
		this.bgColor = bgColor;
		this.fontColor = fontColor;
		this.borderColor = borderColor;
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// 버튼 가로 길이
		int width = getWidth();
		// 버튼 세로 길이
		int height = getHeight();

		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (getModel().isEnabled()) { // 활성화되었을때
			graphics.setColor(bgColor);

		} else if (!(getModel().isEnabled())) { // 비활성화 되었을때
			graphics.setColor(Color.gray);
			// 마우스 올렸을 때
		}
		if (getModel().isRollover()) {
			graphics.setColor(bgColor.darker());
		}
		// 버튼 내부 칠함
		graphics.fillRect(0, 0, width, height);

		// 글자가 그려지는 공간의 크기 구함
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

		// 텍스트 위치: 가로, 세로
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();

		// 테두리 그리는 메소드
		if (getModel().isEnabled())
			graphics.setColor(borderColor);
		else
			graphics.setColor(Color.gray.darker());
		graphics.drawRect(0, 0, width - 1, height - 1);

		// 글자 그리는 메소드
		if (getModel().isEnabled())
			graphics.setColor(fontColor);
		else
			graphics.setColor(Color.DARK_GRAY);
		
		graphics.setFont(Design.MSFont);
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();

		super.paintComponent(g);
	}
}
