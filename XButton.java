package x;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class XButton extends JButton {
	private static final long serialVersionUID = 1L;

	TicTacToe main;
	
	public void init() {
		
		new JButton("X");
		this.setForeground(Color.WHITE);
		this.setBackground(Color.WHITE);
		this.setFocusPainted(false);
		this.setText("X");
		this.setFont(new Font("monospaced", Font.BOLD, 64));
		
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeState(false);
				main.check(true);
			}
		});
	}
	
	public void changeState(boolean b) {
		this.setEnabled(b);
	}
	public void setMain(TicTacToe t) {
		this.main = t;
	}
	public boolean getEnabled() {
		return this.isEnabled();
	}
	public void setColor(Color c) {
		this.setBackground(c);
	}
	public void changeText(String s) {
		this.setText(s);
	}
}