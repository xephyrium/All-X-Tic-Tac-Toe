package x;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class TicTacToe {
	
	private JFrame frame;
	
	private JButton b1b1,b1b2,b1b3,b1b4,b1b5,b1b6,b1b7,b1b8,b1b9, b2b1,b2b2,b2b3,b2b4,b2b5,b2b6,b2b7,b2b8,b2b9, b3b1,b3b2,b3b3,b3b4,b3b5,b3b6,b3b7,b3b8,b3b9, b4b1,b4b2,b4b3,b4b4,b4b5,b4b6,b4b7,b4b8,b4b9,
			b5b1,b5b2,b5b3,b5b4,b5b5,b5b6,b5b7,b5b8,b5b9, b6b1,b6b2,b6b3,b6b4,b6b5,b6b6,b6b7,b6b8,b6b9, b7b1,b7b2,b7b3,b7b4,b7b5,b7b6,b7b7,b7b8,b7b9, b8b1,b8b2,b8b3,b8b4,b8b5,b8b6,b8b7,b8b8,b8b9,
			b9b1,b9b2,b9b3,b9b4,b9b5,b9b6,b9b7,b9b8,b9b9;
	private boolean[][] blackouts = { {false, false, false},{false, false, false},{false, false, false} };
	
	private JLabel turnLabel;
	private Color winner;
	private int turnNum = 1;
	
	private String rulesText = "This game is a modified version of Tic Tac Toe. The variation is that both players are X, and there are multiple boards.\n\nEvery other turn a player will take turns clicking on the white boxes to place their X. Because both players are X it does not matter who placed which X, just that an X is placed there.\n\nOnce a board gets three in a row, that board is considered dead, and no more X's can be played in it.\nOnce three boards in a row are dead, the player who made the final move that killed the last board loses.\n\nThe object of the game is to not kill three boards in a row.";
	
	public static void main(String[] args) {
		
		new TicTacToe();
	}
	public TicTacToe() {
		
		frame = new JFrame();
		frame.setTitle("Tic Tac Toe          -          All X's          -          9 boards          -          Move 1");
		frame.setSize(1000, 1000);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		UIManager.put("OptionPane.border", new EmptyBorder(0, 0, 0, 0) );
		
		JButton rules = new JButton("Rules");
		rules.setForeground(Color.BLACK);
		rules.setBackground(Color.WHITE);
		rules.setFocusPainted(false);
		rules.setFont(new Font("Consolas", Font.BOLD, 64));
		rules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea text = new JTextArea(13, 75);
				text.setEditable(false);
				text.setLineWrap(true);
				text.setWrapStyleWord(true);
				text.setFont(new Font("Consolas", Font.PLAIN, 24));
				text.setText(rulesText);
				text.setCaretPosition(0);
				
				Object[] content = {text};
				Object[] buttons = {};
				JOptionPane.showOptionDialog(frame, content, "Rules", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, null);
			}
		});
		
		turnLabel = new JLabel("<html><font color=\"blue\">Player 1's turn</font></html>");
		turnLabel.setFont(new Font("Consolas", Font.BOLD, 64));
		
		b1b1 = new JButton("X");
		b1b1.setForeground(Color.WHITE);
		b1b1.setBackground(Color.WHITE);
		b1b1.setFocusPainted(false);
		b1b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b1.setEnabled(false);
				check(1);
			}
		});
		b1b2 = new JButton("X");
		b1b2.setForeground(Color.WHITE);
		b1b2.setBackground(Color.WHITE);
		b1b2.setFocusPainted(false);
		b1b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b2.setEnabled(false);
				check(1);
			}
		});
		b1b3 = new JButton("X");
		b1b3.setForeground(Color.WHITE);
		b1b3.setBackground(Color.WHITE);
		b1b3.setFocusPainted(false);
		b1b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b3.setEnabled(false);
				check(1);
			}
		});
		b1b4 = new JButton("X");
		b1b4.setForeground(Color.WHITE);
		b1b4.setBackground(Color.WHITE);
		b1b4.setFocusPainted(false);
		b1b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b4.setEnabled(false);
				check(1);
			}
		});
		b1b5 = new JButton("X");
		b1b5.setForeground(Color.WHITE);
		b1b5.setBackground(Color.WHITE);
		b1b5.setFocusPainted(false);
		b1b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b5.setEnabled(false);
				check(1);
			}
		});
		b1b6 = new JButton("X");
		b1b6.setForeground(Color.WHITE);
		b1b6.setBackground(Color.WHITE);
		b1b6.setFocusPainted(false);
		b1b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b6.setEnabled(false);
				check(1);
			}
		});
		b1b7 = new JButton("X");
		b1b7.setForeground(Color.WHITE);
		b1b7.setBackground(Color.WHITE);
		b1b7.setFocusPainted(false);
		b1b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b7.setEnabled(false);
				check(1);
			}
		});
		b1b8 = new JButton("X");
		b1b8.setForeground(Color.WHITE);
		b1b8.setBackground(Color.WHITE);
		b1b8.setFocusPainted(false);
		b1b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b8.setEnabled(false);
				check(1);
			}
		});
		b1b9 = new JButton("X");
		b1b9.setForeground(Color.WHITE);
		b1b9.setBackground(Color.WHITE);
		b1b9.setFocusPainted(false);
		b1b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b1b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1b9.setEnabled(false);
				check(1);
			}
		});
		b2b1 = new JButton("X");
		b2b1.setForeground(Color.WHITE);
		b2b1.setBackground(Color.WHITE);
		b2b1.setFocusPainted(false);
		b2b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b1.setEnabled(false);
				check(2);
			}
		});
		b2b2 = new JButton("X");
		b2b2.setForeground(Color.WHITE);
		b2b2.setBackground(Color.WHITE);
		b2b2.setFocusPainted(false);
		b2b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b2.setEnabled(false);
				check(2);
			}
		});
		b2b3 = new JButton("X");
		b2b3.setForeground(Color.WHITE);
		b2b3.setBackground(Color.WHITE);
		b2b3.setFocusPainted(false);
		b2b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b3.setEnabled(false);
				check(2);
			}
		});
		b2b4 = new JButton("X");
		b2b4.setForeground(Color.WHITE);
		b2b4.setBackground(Color.WHITE);
		b2b4.setFocusPainted(false);
		b2b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b4.setEnabled(false);
				check(2);
			}
		});
		b2b5 = new JButton("X");
		b2b5.setForeground(Color.WHITE);
		b2b5.setBackground(Color.WHITE);
		b2b5.setFocusPainted(false);
		b2b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b5.setEnabled(false);
				check(2);
			}
		});
		b2b6 = new JButton("X");
		b2b6.setForeground(Color.WHITE);
		b2b6.setBackground(Color.WHITE);
		b2b6.setFocusPainted(false);
		b2b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b6.setEnabled(false);
				check(2);
			}
		});
		b2b7 = new JButton("X");
		b2b7.setForeground(Color.WHITE);
		b2b7.setBackground(Color.WHITE);
		b2b7.setFocusPainted(false);
		b2b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b7.setEnabled(false);
				check(2);
			}
		});
		b2b8 = new JButton("X");
		b2b8.setForeground(Color.WHITE);
		b2b8.setBackground(Color.WHITE);
		b2b8.setFocusPainted(false);
		b2b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b8.setEnabled(false);
				check(2);
			}
		});
		b2b9 = new JButton("X");
		b2b9.setForeground(Color.WHITE);
		b2b9.setBackground(Color.WHITE);
		b2b9.setFocusPainted(false);
		b2b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b2b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2b9.setEnabled(false);
				check(2);
			}
		});
		b3b1 = new JButton("X");
		b3b1.setForeground(Color.WHITE);
		b3b1.setBackground(Color.WHITE);
		b3b1.setFocusPainted(false);
		b3b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b1.setEnabled(false);
				check(3);
			}
		});
		b3b2 = new JButton("X");
		b3b2.setForeground(Color.WHITE);
		b3b2.setBackground(Color.WHITE);
		b3b2.setFocusPainted(false);
		b3b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b2.setEnabled(false);
				check(3);
			}
		});
		b3b3 = new JButton("X");
		b3b3.setForeground(Color.WHITE);
		b3b3.setBackground(Color.WHITE);
		b3b3.setFocusPainted(false);
		b3b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b3.setEnabled(false);
				check(3);
			}
		});
		b3b4 = new JButton("X");
		b3b4.setForeground(Color.WHITE);
		b3b4.setBackground(Color.WHITE);
		b3b4.setFocusPainted(false);
		b3b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b4.setEnabled(false);
				check(3);
			}
		});
		b3b5 = new JButton("X");
		b3b5.setForeground(Color.WHITE);
		b3b5.setBackground(Color.WHITE);
		b3b5.setFocusPainted(false);
		b3b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b5.setEnabled(false);
				check(3);
			}
		});
		b3b6 = new JButton("X");
		b3b6.setForeground(Color.WHITE);
		b3b6.setBackground(Color.WHITE);
		b3b6.setFocusPainted(false);
		b3b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b6.setEnabled(false);
				check(3);
			}
		});
		b3b7 = new JButton("X");
		b3b7.setForeground(Color.WHITE);
		b3b7.setBackground(Color.WHITE);
		b3b7.setFocusPainted(false);
		b3b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b7.setEnabled(false);
				check(3);
			}
		});
		b3b8 = new JButton("X");
		b3b8.setForeground(Color.WHITE);
		b3b8.setBackground(Color.WHITE);
		b3b8.setFocusPainted(false);
		b3b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b8.setEnabled(false);
				check(3);
			}
		});
		b3b9 = new JButton("X");
		b3b9.setForeground(Color.WHITE);
		b3b9.setBackground(Color.WHITE);
		b3b9.setFocusPainted(false);
		b3b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b3b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3b9.setEnabled(false);
				check(3);
			}
		});
		b4b1 = new JButton("X");
		b4b1.setForeground(Color.WHITE);
		b4b1.setBackground(Color.WHITE);
		b4b1.setFocusPainted(false);
		b4b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b1.setEnabled(false);
				check(4);
			}
		});
		b4b2 = new JButton("X");
		b4b2.setForeground(Color.WHITE);
		b4b2.setBackground(Color.WHITE);
		b4b2.setFocusPainted(false);
		b4b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b2.setEnabled(false);
				check(4);
			}
		});
		b4b3 = new JButton("X");
		b4b3.setForeground(Color.WHITE);
		b4b3.setBackground(Color.WHITE);
		b4b3.setFocusPainted(false);
		b4b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b3.setEnabled(false);
				check(4);
			}
		});
		b4b4 = new JButton("X");
		b4b4.setForeground(Color.WHITE);
		b4b4.setBackground(Color.WHITE);
		b4b4.setFocusPainted(false);
		b4b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b4.setEnabled(false);
				check(4);
			}
		});
		b4b5 = new JButton("X");
		b4b5.setForeground(Color.WHITE);
		b4b5.setBackground(Color.WHITE);
		b4b5.setFocusPainted(false);
		b4b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b5.setEnabled(false);
				check(4);
			}
		});
		b4b6 = new JButton("X");
		b4b6.setForeground(Color.WHITE);
		b4b6.setBackground(Color.WHITE);
		b4b6.setFocusPainted(false);
		b4b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b6.setEnabled(false);
				check(4);
			}
		});
		b4b7 = new JButton("X");
		b4b7.setForeground(Color.WHITE);
		b4b7.setBackground(Color.WHITE);
		b4b7.setFocusPainted(false);
		b4b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b7.setEnabled(false);
				check(4);
			}
		});
		b4b8 = new JButton("X");
		b4b8.setForeground(Color.WHITE);
		b4b8.setBackground(Color.WHITE);
		b4b8.setFocusPainted(false);
		b4b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b8.setEnabled(false);
				check(4);
			}
		});
		b4b9 = new JButton("X");
		b4b9.setForeground(Color.WHITE);
		b4b9.setBackground(Color.WHITE);
		b4b9.setFocusPainted(false);
		b4b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b4b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4b9.setEnabled(false);
				check(4);
			}
		});
		b5b1 = new JButton("X");
		b5b1.setForeground(Color.WHITE);
		b5b1.setBackground(Color.WHITE);
		b5b1.setFocusPainted(false);
		b5b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b1.setEnabled(false);
				check(5);
			}
		});
		b5b2 = new JButton("X");
		b5b2.setForeground(Color.WHITE);
		b5b2.setBackground(Color.WHITE);
		b5b2.setFocusPainted(false);
		b5b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b2.setEnabled(false);
				check(5);
			}
		});
		b5b3 = new JButton("X");
		b5b3.setForeground(Color.WHITE);
		b5b3.setBackground(Color.WHITE);
		b5b3.setFocusPainted(false);
		b5b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b3.setEnabled(false);
				check(5);
			}
		});
		b5b4 = new JButton("X");
		b5b4.setForeground(Color.WHITE);
		b5b4.setBackground(Color.WHITE);
		b5b4.setFocusPainted(false);
		b5b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b4.setEnabled(false);
				check(5);
			}
		});
		b5b5 = new JButton("X");
		b5b5.setForeground(Color.WHITE);
		b5b5.setBackground(Color.WHITE);
		b5b5.setFocusPainted(false);
		b5b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b5.setEnabled(false);
				check(5);
			}
		});
		b5b6 = new JButton("X");
		b5b6.setForeground(Color.WHITE);
		b5b6.setBackground(Color.WHITE);
		b5b6.setFocusPainted(false);
		b5b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b6.setEnabled(false);
				check(5);
			}
		});
		b5b7 = new JButton("X");
		b5b7.setForeground(Color.WHITE);
		b5b7.setBackground(Color.WHITE);
		b5b7.setFocusPainted(false);
		b5b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b7.setEnabled(false);
				check(5);
			}
		});
		b5b8 = new JButton("X");
		b5b8.setForeground(Color.WHITE);
		b5b8.setBackground(Color.WHITE);
		b5b8.setFocusPainted(false);
		b5b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b8.setEnabled(false);
				check(5);
			}
		});
		b5b9 = new JButton("X");
		b5b9.setForeground(Color.WHITE);
		b5b9.setBackground(Color.WHITE);
		b5b9.setFocusPainted(false);
		b5b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b5b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5b9.setEnabled(false);
				check(5);
			}
		});
		b6b1 = new JButton("X");
		b6b1.setForeground(Color.WHITE);
		b6b1.setBackground(Color.WHITE);
		b6b1.setFocusPainted(false);
		b6b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b1.setEnabled(false);
				check(6);
			}
		});
		b6b2 = new JButton("X");
		b6b2.setForeground(Color.WHITE);
		b6b2.setBackground(Color.WHITE);
		b6b2.setFocusPainted(false);
		b6b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b2.setEnabled(false);
				check(6);
			}
		});
		b6b3 = new JButton("X");
		b6b3.setForeground(Color.WHITE);
		b6b3.setBackground(Color.WHITE);
		b6b3.setFocusPainted(false);
		b6b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b3.setEnabled(false);
				check(6);
			}
		});
		b6b4 = new JButton("X");
		b6b4.setForeground(Color.WHITE);
		b6b4.setBackground(Color.WHITE);
		b6b4.setFocusPainted(false);
		b6b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b4.setEnabled(false);
				check(6);
			}
		});
		b6b5 = new JButton("X");
		b6b5.setForeground(Color.WHITE);
		b6b5.setBackground(Color.WHITE);
		b6b5.setFocusPainted(false);
		b6b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b5.setEnabled(false);
				check(6);
			}
		});
		b6b6 = new JButton("X");
		b6b6.setForeground(Color.WHITE);
		b6b6.setBackground(Color.WHITE);
		b6b6.setFocusPainted(false);
		b6b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b6.setEnabled(false);
				check(6);
			}
		});
		b6b7 = new JButton("X");
		b6b7.setForeground(Color.WHITE);
		b6b7.setBackground(Color.WHITE);
		b6b7.setFocusPainted(false);
		b6b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b7.setEnabled(false);
				check(6);
			}
		});
		b6b8 = new JButton("X");
		b6b8.setForeground(Color.WHITE);
		b6b8.setBackground(Color.WHITE);
		b6b8.setFocusPainted(false);
		b6b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b8.setEnabled(false);
				check(6);
			}
		});
		b6b9 = new JButton("X");
		b6b9.setForeground(Color.WHITE);
		b6b9.setBackground(Color.WHITE);
		b6b9.setFocusPainted(false);
		b6b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b6b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6b9.setEnabled(false);
				check(6);
			}
		});
		b7b1 = new JButton("X");
		b7b1.setForeground(Color.WHITE);
		b7b1.setBackground(Color.WHITE);
		b7b1.setFocusPainted(false);
		b7b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b1.setEnabled(false);
				check(7);
			}
		});
		b7b2 = new JButton("X");
		b7b2.setForeground(Color.WHITE);
		b7b2.setBackground(Color.WHITE);
		b7b2.setFocusPainted(false);
		b7b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b2.setEnabled(false);
				check(7);
			}
		});
		b7b3 = new JButton("X");
		b7b3.setForeground(Color.WHITE);
		b7b3.setBackground(Color.WHITE);
		b7b3.setFocusPainted(false);
		b7b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b3.setEnabled(false);
				check(7);
			}
		});
		b7b4 = new JButton("X");
		b7b4.setForeground(Color.WHITE);
		b7b4.setBackground(Color.WHITE);
		b7b4.setFocusPainted(false);
		b7b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b4.setEnabled(false);
				check(7);
			}
		});
		b7b5 = new JButton("X");
		b7b5.setForeground(Color.WHITE);
		b7b5.setBackground(Color.WHITE);
		b7b5.setFocusPainted(false);
		b7b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b5.setEnabled(false);
				check(7);
			}
		});
		b7b6 = new JButton("X");
		b7b6.setForeground(Color.WHITE);
		b7b6.setBackground(Color.WHITE);
		b7b6.setFocusPainted(false);
		b7b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b6.setEnabled(false);
				check(7);
			}
		});
		b7b7 = new JButton("X");
		b7b7.setForeground(Color.WHITE);
		b7b7.setBackground(Color.WHITE);
		b7b7.setFocusPainted(false);
		b7b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b7.setEnabled(false);
				check(7);
			}
		});
		b7b8 = new JButton("X");
		b7b8.setForeground(Color.WHITE);
		b7b8.setBackground(Color.WHITE);
		b7b8.setFocusPainted(false);
		b7b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b8.setEnabled(false);
				check(7);
			}
		});
		b7b9 = new JButton("X");
		b7b9.setForeground(Color.WHITE);
		b7b9.setBackground(Color.WHITE);
		b7b9.setFocusPainted(false);
		b7b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b7b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7b9.setEnabled(false);
				check(7);
			}
		});
		b8b1 = new JButton("X");
		b8b1.setForeground(Color.WHITE);
		b8b1.setBackground(Color.WHITE);
		b8b1.setFocusPainted(false);
		b8b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b1.setEnabled(false);
				check(8);
			}
		});
		b8b2 = new JButton("X");
		b8b2.setForeground(Color.WHITE);
		b8b2.setBackground(Color.WHITE);
		b8b2.setFocusPainted(false);
		b8b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b2.setEnabled(false);
				check(8);
			}
		});
		b8b3 = new JButton("X");
		b8b3.setForeground(Color.WHITE);
		b8b3.setBackground(Color.WHITE);
		b8b3.setFocusPainted(false);
		b8b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b3.setEnabled(false);
				check(8);
			}
		});
		b8b4 = new JButton("X");
		b8b4.setForeground(Color.WHITE);
		b8b4.setBackground(Color.WHITE);
		b8b4.setFocusPainted(false);
		b8b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b4.setEnabled(false);
				check(8);
			}
		});
		b8b5 = new JButton("X");
		b8b5.setForeground(Color.WHITE);
		b8b5.setBackground(Color.WHITE);
		b8b5.setFocusPainted(false);
		b8b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b5.setEnabled(false);
				check(8);
			}
		});
		b8b6 = new JButton("X");
		b8b6.setForeground(Color.WHITE);
		b8b6.setBackground(Color.WHITE);
		b8b6.setFocusPainted(false);
		b8b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b6.setEnabled(false);
				check(8);
			}
		});
		b8b7 = new JButton("X");
		b8b7.setForeground(Color.WHITE);
		b8b7.setBackground(Color.WHITE);
		b8b7.setFocusPainted(false);
		b8b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b7.setEnabled(false);
				check(8);
			}
		});
		b8b8 = new JButton("X");
		b8b8.setForeground(Color.WHITE);
		b8b8.setBackground(Color.WHITE);
		b8b8.setFocusPainted(false);
		b8b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b8.setEnabled(false);
				check(8);
			}
		});
		b8b9 = new JButton("X");
		b8b9.setForeground(Color.WHITE);
		b8b9.setBackground(Color.WHITE);
		b8b9.setFocusPainted(false);
		b8b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b8b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8b9.setEnabled(false);
				check(8);
			}
		});
		b9b1 = new JButton("X");
		b9b1.setForeground(Color.WHITE);
		b9b1.setBackground(Color.WHITE);
		b9b1.setFocusPainted(false);
		b9b1.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b1.setEnabled(false);
				check(9);
			}
		});
		b9b2 = new JButton("X");
		b9b2.setForeground(Color.WHITE);
		b9b2.setBackground(Color.WHITE);
		b9b2.setFocusPainted(false);
		b9b2.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b2.setEnabled(false);
				check(9);
			}
		});
		b9b3 = new JButton("X");
		b9b3.setForeground(Color.WHITE);
		b9b3.setBackground(Color.WHITE);
		b9b3.setFocusPainted(false);
		b9b3.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b3.setEnabled(false);
				check(9);
			}
		});
		b9b4 = new JButton("X");
		b9b4.setForeground(Color.WHITE);
		b9b4.setBackground(Color.WHITE);
		b9b4.setFocusPainted(false);
		b9b4.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b4.setEnabled(false);
				check(9);
			}
		});
		b9b5 = new JButton("X");
		b9b5.setForeground(Color.WHITE);
		b9b5.setBackground(Color.WHITE);
		b9b5.setFocusPainted(false);
		b9b5.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b5.setEnabled(false);
				check(9);
			}
		});
		b9b6 = new JButton("X");
		b9b6.setForeground(Color.WHITE);
		b9b6.setBackground(Color.WHITE);
		b9b6.setFocusPainted(false);
		b9b6.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b6.setEnabled(false);
				check(9);
			}
		});
		b9b7 = new JButton("X");
		b9b7.setForeground(Color.WHITE);
		b9b7.setBackground(Color.WHITE);
		b9b7.setFocusPainted(false);
		b9b7.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b7.setEnabled(false);
				check(9);
			}
		});
		b9b8 = new JButton("X");
		b9b8.setForeground(Color.WHITE);
		b9b8.setBackground(Color.WHITE);
		b9b8.setFocusPainted(false);
		b9b8.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b8.setEnabled(false);
				check(9);
			}
		});
		b9b9 = new JButton("X");
		b9b9.setForeground(Color.WHITE);
		b9b9.setBackground(Color.WHITE);
		b9b9.setFocusPainted(false);
		b9b9.setFont(new Font("Consolas", Font.BOLD, 64));
		b9b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9b9.setEnabled(false);
				check(9);
			}
		});
		
		JPanel top = new JPanel();
		top.setLayout(new BorderLayout());
		top.add(rules, BorderLayout.WEST);
		top.add(turnLabel, BorderLayout.EAST);
		
		JPanel board1 = new JPanel();
		board1.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.insets = new Insets(1, 1, 1, 1);
		gbc1.fill = GridBagConstraints.BOTH;
		gbc1.weightx = 1.0;
		gbc1.weighty = 1.0;
		
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		board1.add(b1b1, gbc1);
		gbc1.gridx = 0;
		gbc1.gridy = 1;
		board1.add(b1b2, gbc1);
		gbc1.gridx = 0;
		gbc1.gridy = 2;
		board1.add(b1b3, gbc1);
		gbc1.gridx = 1;
		gbc1.gridy = 0;
		board1.add(b1b4, gbc1);
		gbc1.gridx = 1;
		gbc1.gridy = 1;
		board1.add(b1b5, gbc1);
		gbc1.gridx = 1;
		gbc1.gridy = 2;
		board1.add(b1b6, gbc1);
		gbc1.gridx = 2;
		gbc1.gridy = 0;
		board1.add(b1b7, gbc1);
		gbc1.gridx = 2;
		gbc1.gridy = 1;
		board1.add(b1b8, gbc1);
		gbc1.gridx = 2;
		gbc1.gridy = 2;
		board1.add(b1b9, gbc1);
		
		JPanel board2 = new JPanel();
		board2.setLayout(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.insets = new Insets(1, 1, 1, 1);
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.weightx = 1.0;
		gbc2.weighty = 1.0;
		
		gbc2.gridx = 0;
		gbc2.gridy = 0;
		board2.add(b2b1, gbc2);
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		board2.add(b2b2, gbc2);
		gbc2.gridx = 0;
		gbc2.gridy = 2;
		board2.add(b2b3, gbc2);
		gbc2.gridx = 1;
		gbc2.gridy = 0;
		board2.add(b2b4, gbc2);
		gbc2.gridx = 1;
		gbc2.gridy = 1;
		board2.add(b2b5, gbc2);
		gbc2.gridx = 1;
		gbc2.gridy = 2;
		board2.add(b2b6, gbc2);
		gbc2.gridx = 2;
		gbc2.gridy = 0;
		board2.add(b2b7, gbc2);
		gbc2.gridx = 2;
		gbc2.gridy = 1;
		board2.add(b2b8, gbc2);
		gbc2.gridx = 2;
		gbc2.gridy = 2;
		board2.add(b2b9, gbc2);
		
		JPanel board3 = new JPanel();
		board3.setLayout(new GridBagLayout());
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.insets = new Insets(1, 1, 1, 1);
		gbc3.fill = GridBagConstraints.BOTH;
		gbc3.weightx = 1.0;
		gbc3.weighty = 1.0;
		
		gbc3.gridx = 0;
		gbc3.gridy = 0;
		board3.add(b3b1, gbc3);
		gbc3.gridx = 0;
		gbc3.gridy = 1;
		board3.add(b3b2, gbc3);
		gbc3.gridx = 0;
		gbc3.gridy = 2;
		board3.add(b3b3, gbc3);
		gbc3.gridx = 1;
		gbc3.gridy = 0;
		board3.add(b3b4, gbc3);
		gbc3.gridx = 1;
		gbc3.gridy = 1;
		board3.add(b3b5, gbc3);
		gbc3.gridx = 1;
		gbc3.gridy = 2;
		board3.add(b3b6, gbc3);
		gbc3.gridx = 2;
		gbc3.gridy = 0;
		board3.add(b3b7, gbc3);
		gbc3.gridx = 2;
		gbc3.gridy = 1;
		board3.add(b3b8, gbc3);
		gbc3.gridx = 2;
		gbc3.gridy = 2;
		board3.add(b3b9, gbc3);
		
		JPanel board4 = new JPanel();
		board4.setLayout(new GridBagLayout());
		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.insets = new Insets(1, 1, 1, 1);
		gbc4.fill = GridBagConstraints.BOTH;
		gbc4.weightx = 1.0;
		gbc4.weighty = 1.0;
		
		gbc4.gridx = 0;
		gbc4.gridy = 0;
		board4.add(b4b1, gbc4);
		gbc4.gridx = 0;
		gbc4.gridy = 1;
		board4.add(b4b2, gbc4);
		gbc4.gridx = 0;
		gbc4.gridy = 2;
		board4.add(b4b3, gbc4);
		gbc4.gridx = 1;
		gbc4.gridy = 0;
		board4.add(b4b4, gbc4);
		gbc4.gridx = 1;
		gbc4.gridy = 1;
		board4.add(b4b5, gbc4);
		gbc4.gridx = 1;
		gbc4.gridy = 2;
		board4.add(b4b6, gbc4);
		gbc4.gridx = 2;
		gbc4.gridy = 0;
		board4.add(b4b7, gbc4);
		gbc4.gridx = 2;
		gbc4.gridy = 1;
		board4.add(b4b8, gbc4);
		gbc4.gridx = 2;
		gbc4.gridy = 2;
		board4.add(b4b9, gbc4);
		
		JPanel board5 = new JPanel();
		board5.setLayout(new GridBagLayout());
		GridBagConstraints gbc5 = new GridBagConstraints();
		gbc5.insets = new Insets(1, 1, 1, 1);
		gbc5.fill = GridBagConstraints.BOTH;
		gbc5.weightx = 1.0;
		gbc5.weighty = 1.0;
		
		gbc5.gridx = 0;
		gbc5.gridy = 0;
		board5.add(b5b1, gbc5);
		gbc5.gridx = 0;
		gbc5.gridy = 1;
		board5.add(b5b2, gbc5);
		gbc5.gridx = 0;
		gbc5.gridy = 2;
		board5.add(b5b3, gbc5);
		gbc5.gridx = 1;
		gbc5.gridy = 0;
		board5.add(b5b4, gbc5);
		gbc5.gridx = 1;
		gbc5.gridy = 1;
		board5.add(b5b5, gbc5);
		gbc5.gridx = 1;
		gbc5.gridy = 2;
		board5.add(b5b6, gbc5);
		gbc5.gridx = 2;
		gbc5.gridy = 0;
		board5.add(b5b7, gbc5);
		gbc5.gridx = 2;
		gbc5.gridy = 1;
		board5.add(b5b8, gbc5);
		gbc5.gridx = 2;
		gbc5.gridy = 2;
		board5.add(b5b9, gbc5);
		
		JPanel board6 = new JPanel();
		board6.setLayout(new GridBagLayout());
		GridBagConstraints gbc6 = new GridBagConstraints();
		gbc6.insets = new Insets(1, 1, 1, 1);
		gbc6.fill = GridBagConstraints.BOTH;
		gbc6.weightx = 1.0;
		gbc6.weighty = 1.0;

		gbc6.gridx = 0;
		gbc6.gridy = 0;
		board6.add(b6b1, gbc6);
		gbc6.gridx = 0;
		gbc6.gridy = 1;
		board6.add(b6b2, gbc6);
		gbc6.gridx = 0;
		gbc6.gridy = 2;
		board6.add(b6b3, gbc6);
		gbc6.gridx = 1;
		gbc6.gridy = 0;
		board6.add(b6b4, gbc6);
		gbc6.gridx = 1;
		gbc6.gridy = 1;
		board6.add(b6b5, gbc6);
		gbc6.gridx = 1;
		gbc6.gridy = 2;
		board6.add(b6b6, gbc6);
		gbc6.gridx = 2;
		gbc6.gridy = 0;
		board6.add(b6b7, gbc6);
		gbc6.gridx = 2;
		gbc6.gridy = 1;
		board6.add(b6b8, gbc6);
		gbc6.gridx = 2;
		gbc6.gridy = 2;
		board6.add(b6b9, gbc6);
		
		JPanel board7 = new JPanel();
		board7.setLayout(new GridBagLayout());
		GridBagConstraints gbc7 = new GridBagConstraints();
		gbc7.insets = new Insets(1, 1, 1, 1);
		gbc7.fill = GridBagConstraints.BOTH;
		gbc7.weightx = 1.0;
		gbc7.weighty = 1.0;
		
		gbc7.gridx = 0;
		gbc7.gridy = 0;
		board7.add(b7b1, gbc7);
		gbc7.gridx = 0;
		gbc7.gridy = 1;
		board7.add(b7b2, gbc7);
		gbc7.gridx = 0;
		gbc7.gridy = 2;
		board7.add(b7b3, gbc7);
		gbc7.gridx = 1;
		gbc7.gridy = 0;
		board7.add(b7b4, gbc7);
		gbc7.gridx = 1;
		gbc7.gridy = 1;
		board7.add(b7b5, gbc7);
		gbc7.gridx = 1;
		gbc7.gridy = 2;
		board7.add(b7b6, gbc7);
		gbc7.gridx = 2;
		gbc7.gridy = 0;
		board7.add(b7b7, gbc7);
		gbc7.gridx = 2;
		gbc7.gridy = 1;
		board7.add(b7b8, gbc7);
		gbc7.gridx = 2;
		gbc7.gridy = 2;
		board7.add(b7b9, gbc7);
		
		JPanel board8 = new JPanel();
		board8.setLayout(new GridBagLayout());
		GridBagConstraints gbc8 = new GridBagConstraints();
		gbc8.insets = new Insets(1, 1, 1, 1);
		gbc8.fill = GridBagConstraints.BOTH;
		gbc8.weightx = 1.0;
		gbc8.weighty = 1.0;
		
		gbc8.gridx = 0;
		gbc8.gridy = 0;
		board8.add(b8b1, gbc8);
		gbc8.gridx = 0;
		gbc8.gridy = 1;
		board8.add(b8b2, gbc8);
		gbc8.gridx = 0;
		gbc8.gridy = 2;
		board8.add(b8b3, gbc8);
		gbc8.gridx = 1;
		gbc8.gridy = 0;
		board8.add(b8b4, gbc8);
		gbc8.gridx = 1;
		gbc8.gridy = 1;
		board8.add(b8b5, gbc8);
		gbc8.gridx = 1;
		gbc8.gridy = 2;
		board8.add(b8b6, gbc8);
		gbc8.gridx = 2;
		gbc8.gridy = 0;
		board8.add(b8b7, gbc8);
		gbc8.gridx = 2;
		gbc8.gridy = 1;
		board8.add(b8b8, gbc8);
		gbc8.gridx = 2;
		gbc8.gridy = 2;
		board8.add(b8b9, gbc8);
		
		JPanel board9 = new JPanel();
		board9.setLayout(new GridBagLayout());
		GridBagConstraints gbc9 = new GridBagConstraints();
		gbc9.insets = new Insets(1, 1, 1, 1);
		gbc9.fill = GridBagConstraints.BOTH;
		gbc9.weightx = 1.0;
		gbc9.weighty = 1.0;
		
		gbc9.gridx = 0;
		gbc9.gridy = 0;
		board9.add(b9b1, gbc9);
		gbc9.gridx = 0;
		gbc9.gridy = 1;
		board9.add(b9b2, gbc9);
		gbc9.gridx = 0;
		gbc9.gridy = 2;
		board9.add(b9b3, gbc9);
		gbc9.gridx = 1;
		gbc9.gridy = 0;
		board9.add(b9b4, gbc9);
		gbc9.gridx = 1;
		gbc9.gridy = 1;
		board9.add(b9b5, gbc9);
		gbc9.gridx = 1;
		gbc9.gridy = 2;
		board9.add(b9b6, gbc9);
		gbc9.gridx = 2;
		gbc9.gridy = 0;
		board9.add(b9b7, gbc9);
		gbc9.gridx = 2;
		gbc9.gridy = 1;
		board9.add(b9b8, gbc9);
		gbc9.gridx = 2;
		gbc9.gridy = 2;
		board9.add(b9b9, gbc9);
		
		JPanel boards = (JPanel)frame.getContentPane();
		boards.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		boards.add(top, gbc);
		
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.gridx = 0;
		gbc.gridy = 1;
		boards.add(board1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		boards.add(board2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		boards.add(board3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		boards.add(board4, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		boards.add(board5, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		boards.add(board6, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		boards.add(board7, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		boards.add(board8, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		boards.add(board9, gbc);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public void check(int board) {
		
		if (board != 0) {
			turn();
		}
		
		if (board == 1) {
			if ( (!b1b1.isEnabled() && !b1b2.isEnabled() && !b1b3.isEnabled()) || (!b1b1.isEnabled() && !b1b4.isEnabled() && !b1b7.isEnabled()) || (!b1b1.isEnabled() && !b1b5.isEnabled() && !b1b9.isEnabled()) 
					|| (!b1b2.isEnabled() && !b1b5.isEnabled() && !b1b8.isEnabled()) || (!b1b3.isEnabled() && !b1b6.isEnabled() && !b1b9.isEnabled()) || (!b1b3.isEnabled() && !b1b5.isEnabled() && !b1b7.isEnabled())
					|| (!b1b4.isEnabled() && !b1b5.isEnabled() && !b1b6.isEnabled()) || (!b1b7.isEnabled() && !b1b8.isEnabled() && !b1b9.isEnabled()) ) {
				blackout(1, 1, 0);
			}
		} else if (board == 2) {
			if ( (!b2b1.isEnabled() && !b2b2.isEnabled() && !b2b3.isEnabled()) || (!b2b1.isEnabled() && !b2b4.isEnabled() && !b2b7.isEnabled()) || (!b2b1.isEnabled() && !b2b5.isEnabled() && !b2b9.isEnabled()) 
					|| (!b2b2.isEnabled() && !b2b5.isEnabled() && !b2b8.isEnabled()) || (!b2b3.isEnabled() && !b2b6.isEnabled() && !b2b9.isEnabled()) || (!b2b3.isEnabled() && !b2b5.isEnabled() && !b2b7.isEnabled())
					|| (!b2b4.isEnabled() && !b2b5.isEnabled() && !b2b6.isEnabled()) || (!b2b7.isEnabled() && !b2b8.isEnabled() && !b2b9.isEnabled()) ) {
				blackout(1, 2, 0);
			}
		} else if (board == 3) {
			if ( (!b3b1.isEnabled() && !b3b2.isEnabled() && !b3b3.isEnabled()) || (!b3b1.isEnabled() && !b3b4.isEnabled() && !b3b7.isEnabled()) || (!b3b1.isEnabled() && !b3b5.isEnabled() && !b3b9.isEnabled()) 
					|| (!b3b2.isEnabled() && !b3b5.isEnabled() && !b3b8.isEnabled()) || (!b3b3.isEnabled() && !b3b6.isEnabled() && !b3b9.isEnabled()) || (!b3b3.isEnabled() && !b3b5.isEnabled() && !b3b7.isEnabled())
					|| (!b3b4.isEnabled() && !b3b5.isEnabled() && !b3b6.isEnabled()) || (!b3b7.isEnabled() && !b3b8.isEnabled() && !b3b9.isEnabled()) ) {
				blackout(1, 3, 0);
			}
		} else if (board == 4) {
			if ( (!b4b1.isEnabled() && !b4b2.isEnabled() && !b4b3.isEnabled()) || (!b4b1.isEnabled() && !b4b4.isEnabled() && !b4b7.isEnabled()) || (!b4b1.isEnabled() && !b4b5.isEnabled() && !b4b9.isEnabled()) 
					|| (!b4b2.isEnabled() && !b4b5.isEnabled() && !b4b8.isEnabled()) || (!b4b3.isEnabled() && !b4b6.isEnabled() && !b4b9.isEnabled()) || (!b4b3.isEnabled() && !b4b5.isEnabled() && !b4b7.isEnabled())
					|| (!b4b4.isEnabled() && !b4b5.isEnabled() && !b4b6.isEnabled()) || (!b4b7.isEnabled() && !b4b8.isEnabled() && !b4b9.isEnabled()) ) {
				blackout(2, 1, 0);
			}
		} else if (board == 5) {
			if ( (!b5b1.isEnabled() && !b5b2.isEnabled() && !b5b3.isEnabled()) || (!b5b1.isEnabled() && !b5b4.isEnabled() && !b5b7.isEnabled()) || (!b5b1.isEnabled() && !b5b5.isEnabled() && !b5b9.isEnabled()) 
					|| (!b5b2.isEnabled() && !b5b5.isEnabled() && !b5b8.isEnabled()) || (!b5b3.isEnabled() && !b5b6.isEnabled() && !b5b9.isEnabled()) || (!b5b3.isEnabled() && !b5b5.isEnabled() && !b5b7.isEnabled())
					|| (!b5b4.isEnabled() && !b5b5.isEnabled() && !b5b6.isEnabled()) || (!b5b7.isEnabled() && !b5b8.isEnabled() && !b5b9.isEnabled()) ) {
				blackout(2, 2, 0);
			}
		} else if (board == 6) {
			if ( (!b6b1.isEnabled() && !b6b2.isEnabled() && !b6b3.isEnabled()) || (!b6b1.isEnabled() && !b6b4.isEnabled() && !b6b7.isEnabled()) || (!b6b1.isEnabled() && !b6b5.isEnabled() && !b6b9.isEnabled()) 
					|| (!b6b2.isEnabled() && !b6b5.isEnabled() && !b6b8.isEnabled()) || (!b6b3.isEnabled() && !b6b6.isEnabled() && !b6b9.isEnabled()) || (!b6b3.isEnabled() && !b6b5.isEnabled() && !b6b7.isEnabled())
					|| (!b6b4.isEnabled() && !b6b5.isEnabled() && !b6b6.isEnabled()) || (!b6b7.isEnabled() && !b6b8.isEnabled() && !b6b9.isEnabled()) ) {
				blackout(2, 3, 0);
			}
		} else if (board == 7) {
			if ( (!b7b1.isEnabled() && !b7b2.isEnabled() && !b7b3.isEnabled()) || (!b7b1.isEnabled() && !b7b4.isEnabled() && !b7b7.isEnabled()) || (!b7b1.isEnabled() && !b7b5.isEnabled() && !b7b9.isEnabled()) 
					|| (!b7b2.isEnabled() && !b7b5.isEnabled() && !b7b8.isEnabled()) || (!b7b3.isEnabled() && !b7b6.isEnabled() && !b7b9.isEnabled()) || (!b7b3.isEnabled() && !b7b5.isEnabled() && !b7b7.isEnabled())
					|| (!b7b4.isEnabled() && !b7b5.isEnabled() && !b7b6.isEnabled()) || (!b7b7.isEnabled() && !b7b8.isEnabled() && !b7b9.isEnabled()) ) {
				blackout(3, 1, 0);
			}
		} else if (board == 8) {
			if ( (!b8b1.isEnabled() && !b8b2.isEnabled() && !b8b3.isEnabled()) || (!b8b1.isEnabled() && !b8b4.isEnabled() && !b8b7.isEnabled()) || (!b8b1.isEnabled() && !b8b5.isEnabled() && !b8b9.isEnabled()) 
					|| (!b8b2.isEnabled() && !b8b5.isEnabled() && !b8b8.isEnabled()) || (!b8b3.isEnabled() && !b8b6.isEnabled() && !b8b9.isEnabled()) || (!b8b3.isEnabled() && !b8b5.isEnabled() && !b8b7.isEnabled())
					|| (!b8b4.isEnabled() && !b8b5.isEnabled() && !b8b6.isEnabled()) || (!b8b7.isEnabled() && !b8b8.isEnabled() && !b8b9.isEnabled()) ) {
				blackout(3, 2, 0);
			}
		} else if (board == 9) {
			if ( (!b9b1.isEnabled() && !b9b2.isEnabled() && !b9b3.isEnabled()) || (!b9b1.isEnabled() && !b9b4.isEnabled() && !b9b7.isEnabled()) || (!b9b1.isEnabled() && !b9b5.isEnabled() && !b9b9.isEnabled()) 
					|| (!b9b2.isEnabled() && !b9b5.isEnabled() && !b9b8.isEnabled()) || (!b9b3.isEnabled() && !b9b6.isEnabled() && !b9b9.isEnabled()) || (!b9b3.isEnabled() && !b9b5.isEnabled() && !b9b7.isEnabled())
					|| (!b9b4.isEnabled() && !b9b5.isEnabled() && !b9b6.isEnabled()) || (!b9b7.isEnabled() && !b9b8.isEnabled() && !b9b9.isEnabled()) ) {
				blackout(3, 3, 0);
			}
		} else {
			if ( (blackouts[0][0] && blackouts[0][1] && blackouts[0][2]) || (blackouts[0][0] && blackouts[1][0] && blackouts[2][0]) || (blackouts[0][0] && blackouts[1][1] && blackouts[2][2]) 
					|| (blackouts[1][0] && blackouts[1][1] && blackouts[1][2]) || (blackouts[2][0] && blackouts[2][1] && blackouts[2][2]) || (blackouts[0][1] && blackouts[1][1] && blackouts[2][1])
					|| (blackouts[0][2] && blackouts[1][2] && blackouts[2][2]) || (blackouts[2][0] && blackouts[1][1] && blackouts[0][2]) ) {
				blackout(0, 0, 1);
			}
		}
	}
	public void turn() {
		turnNum += 1;
		
		if (turnNum % 2 == 0) {
			winner = new Color(0, 200, 0);
			turnLabel.setText("<html><font color=\"green\">Player 2's turn</font></html>");
		} else {
			winner = new Color(0, 100, 255);
			turnLabel.setText("<html><font color=\"blue\">Player 1's turn</font></html>");
		}
		
		frame.setTitle("Tic Tac Toe          -          All X's          -          9 boards          -          Move " + turnNum);
	}
	public void blackout(int x, int y, int scale) {
		
		if (scale == 0) {
			if (x == 1 && y == 1) {
				b1b1.setBackground(Color.BLACK);
				b1b2.setBackground(Color.BLACK);
				b1b3.setBackground(Color.BLACK);
				b1b4.setBackground(Color.BLACK);
				b1b5.setBackground(Color.BLACK);
				b1b6.setBackground(Color.BLACK);
				b1b7.setBackground(Color.BLACK);
				b1b8.setBackground(Color.BLACK);
				b1b9.setBackground(Color.BLACK);
				if (b1b1.isEnabled()) {
					b1b1.setText(" ");
					b1b1.setEnabled(false);
				}
				if (b1b2.isEnabled()) {
					b1b2.setText(" ");
					b1b2.setEnabled(false);
				}
				if (b1b3.isEnabled()) {
					b1b3.setText(" ");
					b1b3.setEnabled(false);
				}
				if (b1b4.isEnabled()) {
					b1b4.setText(" ");
					b1b4.setEnabled(false);
				}
				if (b1b5.isEnabled()) {
					b1b5.setText(" ");
					b1b5.setEnabled(false);
				}
				if (b1b6.isEnabled()) {
					b1b6.setText(" ");
					b1b6.setEnabled(false);
				}
				if (b1b7.isEnabled()) {
					b1b7.setText(" ");
					b1b7.setEnabled(false);
				}
				if (b1b8.isEnabled()) {
					b1b8.setText(" ");
					b1b8.setEnabled(false);
				}
				if (b1b9.isEnabled()) {
					b1b9.setText(" ");
					b1b9.setEnabled(false);
				}
			} else if (x == 1 && y == 2) {
				b2b1.setBackground(Color.BLACK);
				b2b2.setBackground(Color.BLACK);
				b2b3.setBackground(Color.BLACK);
				b2b4.setBackground(Color.BLACK);
				b2b5.setBackground(Color.BLACK);
				b2b6.setBackground(Color.BLACK);
				b2b7.setBackground(Color.BLACK);
				b2b8.setBackground(Color.BLACK);
				b2b9.setBackground(Color.BLACK);
				if (b2b1.isEnabled()) {
					b2b1.setText(" ");
					b2b1.setEnabled(false);
				}
				if (b2b2.isEnabled()) {
					b2b2.setText(" ");
					b2b2.setEnabled(false);
				}
				if (b2b3.isEnabled()) {
					b2b3.setText(" ");
					b2b3.setEnabled(false);
				}
				if (b2b4.isEnabled()) {
					b2b4.setText(" ");
					b2b4.setEnabled(false);
				}
				if (b2b5.isEnabled()) {
					b2b5.setText(" ");
					b2b5.setEnabled(false);
				}
				if (b2b6.isEnabled()) {
					b2b6.setText(" ");
					b2b6.setEnabled(false);
				}
				if (b2b7.isEnabled()) {
					b2b7.setText(" ");
					b2b7.setEnabled(false);
				}
				if (b2b8.isEnabled()) {
					b2b8.setText(" ");
					b2b8.setEnabled(false);
				}
				if (b2b9.isEnabled()) {
					b2b9.setText(" ");
					b2b9.setEnabled(false);
				}
			} else if (x == 1 && y == 3) {
				b3b1.setBackground(Color.BLACK);
				b3b2.setBackground(Color.BLACK);
				b3b3.setBackground(Color.BLACK);
				b3b4.setBackground(Color.BLACK);
				b3b5.setBackground(Color.BLACK);
				b3b6.setBackground(Color.BLACK);
				b3b7.setBackground(Color.BLACK);
				b3b8.setBackground(Color.BLACK);
				b3b9.setBackground(Color.BLACK);
				if (b3b1.isEnabled()) {
					b3b1.setText(" ");
					b3b1.setEnabled(false);
				}
				if (b3b2.isEnabled()) {
					b3b2.setText(" ");
					b3b2.setEnabled(false);
				}
				if (b3b3.isEnabled()) {
					b3b3.setText(" ");
					b3b3.setEnabled(false);
				}
				if (b3b4.isEnabled()) {
					b3b4.setText(" ");
					b3b4.setEnabled(false);
				}
				if (b3b5.isEnabled()) {
					b3b5.setText(" ");
					b3b5.setEnabled(false);
				}
				if (b3b6.isEnabled()) {
					b3b6.setText(" ");
					b3b6.setEnabled(false);
				}
				if (b3b7.isEnabled()) {
					b3b7.setText(" ");
					b3b7.setEnabled(false);
				}
				if (b3b8.isEnabled()) {
					b3b8.setText(" ");
					b3b8.setEnabled(false);
				}
				if (b3b9.isEnabled()) {
					b3b9.setText(" ");
					b3b9.setEnabled(false);
				}
			} else if (x == 2 && y == 1) {
				b4b1.setBackground(Color.BLACK);
				b4b2.setBackground(Color.BLACK);
				b4b3.setBackground(Color.BLACK);
				b4b4.setBackground(Color.BLACK);
				b4b5.setBackground(Color.BLACK);
				b4b6.setBackground(Color.BLACK);
				b4b7.setBackground(Color.BLACK);
				b4b8.setBackground(Color.BLACK);
				b4b9.setBackground(Color.BLACK);
				if (b4b1.isEnabled()) {
					b4b1.setText(" ");
					b4b1.setEnabled(false);
				}
				if (b4b2.isEnabled()) {
					b4b2.setText(" ");
					b4b2.setEnabled(false);
				}
				if (b4b3.isEnabled()) {
					b4b3.setText(" ");
					b4b3.setEnabled(false);
				}
				if (b4b4.isEnabled()) {
					b4b4.setText(" ");
					b4b4.setEnabled(false);
				}
				if (b4b5.isEnabled()) {
					b4b5.setText(" ");
					b4b5.setEnabled(false);
				}
				if (b4b6.isEnabled()) {
					b4b6.setText(" ");
					b4b6.setEnabled(false);
				}
				if (b4b7.isEnabled()) {
					b4b7.setText(" ");
					b4b7.setEnabled(false);
				}
				if (b4b8.isEnabled()) {
					b4b8.setText(" ");
					b4b8.setEnabled(false);
				}
				if (b4b9.isEnabled()) {
					b4b9.setText(" ");
					b4b9.setEnabled(false);
				}
			} else if (x == 2 && y == 2) {
				b5b1.setBackground(Color.BLACK);
				b5b2.setBackground(Color.BLACK);
				b5b3.setBackground(Color.BLACK);
				b5b4.setBackground(Color.BLACK);
				b5b5.setBackground(Color.BLACK);
				b5b6.setBackground(Color.BLACK);
				b5b7.setBackground(Color.BLACK);
				b5b8.setBackground(Color.BLACK);
				b5b9.setBackground(Color.BLACK);
				if (b5b1.isEnabled()) {
					b5b1.setText(" ");
					b5b1.setEnabled(false);
				}
				if (b5b2.isEnabled()) {
					b5b2.setText(" ");
					b5b2.setEnabled(false);
				}
				if (b5b3.isEnabled()) {
					b5b3.setText(" ");
					b5b3.setEnabled(false);
				}
				if (b5b4.isEnabled()) {
					b5b4.setText(" ");
					b5b4.setEnabled(false);
				}
				if (b5b5.isEnabled()) {
					b5b5.setText(" ");
					b5b5.setEnabled(false);
				}
				if (b5b6.isEnabled()) {
					b5b6.setText(" ");
					b5b6.setEnabled(false);
				}
				if (b5b7.isEnabled()) {
					b5b7.setText(" ");
					b5b7.setEnabled(false);
				}
				if (b5b8.isEnabled()) {
					b5b8.setText(" ");
					b5b8.setEnabled(false);
				}
				if (b5b9.isEnabled()) {
					b5b9.setText(" ");
					b5b9.setEnabled(false);
				}
			} else if (x == 2 && y == 3) {
				b6b1.setBackground(Color.BLACK);
				b6b2.setBackground(Color.BLACK);
				b6b3.setBackground(Color.BLACK);
				b6b4.setBackground(Color.BLACK);
				b6b5.setBackground(Color.BLACK);
				b6b6.setBackground(Color.BLACK);
				b6b7.setBackground(Color.BLACK);
				b6b8.setBackground(Color.BLACK);
				b6b9.setBackground(Color.BLACK);
				if (b6b1.isEnabled()) {
					b6b1.setText(" ");
					b6b1.setEnabled(false);
				}
				if (b6b2.isEnabled()) {
					b6b2.setText(" ");
					b6b2.setEnabled(false);
				}
				if (b6b3.isEnabled()) {
					b6b3.setText(" ");
					b6b3.setEnabled(false);
				}
				if (b6b4.isEnabled()) {
					b6b4.setText(" ");
					b6b4.setEnabled(false);
				}
				if (b6b5.isEnabled()) {
					b6b5.setText(" ");
					b6b5.setEnabled(false);
				}
				if (b6b6.isEnabled()) {
					b6b6.setText(" ");
					b6b6.setEnabled(false);
				}
				if (b6b7.isEnabled()) {
					b6b7.setText(" ");
					b6b7.setEnabled(false);
				}
				if (b6b8.isEnabled()) {
					b6b8.setText(" ");
					b6b8.setEnabled(false);
				}
				if (b6b9.isEnabled()) {
					b6b9.setText(" ");
					b6b9.setEnabled(false);
				}
			} else if (x == 3 && y == 1) {
				b7b1.setBackground(Color.BLACK);
				b7b2.setBackground(Color.BLACK);
				b7b3.setBackground(Color.BLACK);
				b7b4.setBackground(Color.BLACK);
				b7b5.setBackground(Color.BLACK);
				b7b6.setBackground(Color.BLACK);
				b7b7.setBackground(Color.BLACK);
				b7b8.setBackground(Color.BLACK);
				b7b9.setBackground(Color.BLACK);
				if (b7b1.isEnabled()) {
					b7b1.setText(" ");
					b7b1.setEnabled(false);
				}
				if (b7b2.isEnabled()) {
					b7b2.setText(" ");
					b7b2.setEnabled(false);
				}
				if (b7b3.isEnabled()) {
					b7b3.setText(" ");
					b7b3.setEnabled(false);
				}
				if (b7b4.isEnabled()) {
					b7b4.setText(" ");
					b7b4.setEnabled(false);
				}
				if (b7b5.isEnabled()) {
					b7b5.setText(" ");
					b7b5.setEnabled(false);
				}
				if (b7b6.isEnabled()) {
					b7b6.setText(" ");
					b7b6.setEnabled(false);
				}
				if (b7b7.isEnabled()) {
					b7b7.setText(" ");
					b7b7.setEnabled(false);
				}
				if (b7b8.isEnabled()) {
					b7b8.setText(" ");
					b7b8.setEnabled(false);
				}
				if (b7b9.isEnabled()) {
					b7b9.setText(" ");
					b7b9.setEnabled(false);
				}
			} else if (x == 3 && y == 2) {
				b8b1.setBackground(Color.BLACK);
				b8b2.setBackground(Color.BLACK);
				b8b3.setBackground(Color.BLACK);
				b8b4.setBackground(Color.BLACK);
				b8b5.setBackground(Color.BLACK);
				b8b6.setBackground(Color.BLACK);
				b8b7.setBackground(Color.BLACK);
				b8b8.setBackground(Color.BLACK);
				b8b9.setBackground(Color.BLACK);
				if (b8b1.isEnabled()) {
					b8b1.setText(" ");
					b8b1.setEnabled(false);
				}
				if (b8b2.isEnabled()) {
					b8b2.setText(" ");
					b8b2.setEnabled(false);
				}
				if (b8b3.isEnabled()) {
					b8b3.setText(" ");
					b8b3.setEnabled(false);
				}
				if (b8b4.isEnabled()) {
					b8b4.setText(" ");
					b8b4.setEnabled(false);
				}
				if (b8b5.isEnabled()) {
					b8b5.setText(" ");
					b8b5.setEnabled(false);
				}
				if (b8b6.isEnabled()) {
					b8b6.setText(" ");
					b8b6.setEnabled(false);
				}
				if (b8b7.isEnabled()) {
					b8b7.setText(" ");
					b8b7.setEnabled(false);
				}
				if (b8b8.isEnabled()) {
					b8b8.setText(" ");
					b8b8.setEnabled(false);
				}
				if (b8b9.isEnabled()) {
					b8b9.setText(" ");
					b8b9.setEnabled(false);
				}
			} else if (x == 3 && y == 3) {
				b9b1.setBackground(Color.BLACK);
				b9b2.setBackground(Color.BLACK);
				b9b3.setBackground(Color.BLACK);
				b9b4.setBackground(Color.BLACK);
				b9b5.setBackground(Color.BLACK);
				b9b6.setBackground(Color.BLACK);
				b9b7.setBackground(Color.BLACK);
				b9b8.setBackground(Color.BLACK);
				b9b9.setBackground(Color.BLACK);
				if (b9b1.isEnabled()) {
					b9b1.setText(" ");
					b9b1.setEnabled(false);
				}
				if (b9b2.isEnabled()) {
					b9b2.setText(" ");
					b9b2.setEnabled(false);
				}
				if (b9b3.isEnabled()) {
					b9b3.setText(" ");
					b9b3.setEnabled(false);
				}
				if (b9b4.isEnabled()) {
					b9b4.setText(" ");
					b9b4.setEnabled(false);
				}
				if (b9b5.isEnabled()) {
					b9b5.setText(" ");
					b9b5.setEnabled(false);
				}
				if (b9b6.isEnabled()) {
					b9b6.setText(" ");
					b9b6.setEnabled(false);
				}
				if (b9b7.isEnabled()) {
					b9b7.setText(" ");
					b9b7.setEnabled(false);
				}
				if (b9b8.isEnabled()) {
					b9b8.setText(" ");
					b9b8.setEnabled(false);
				}
				if (b9b9.isEnabled()) {
					b9b9.setText(" ");
					b9b9.setEnabled(false);
				}
			}
			
			blackouts[x-1][y-1] = true;
			check(0);
		} else {
			if (turnNum % 2 == 0) {
				winner = new Color(0, 200, 0);
				turnLabel.setText("<html><font color=\"green\">Player 2 wins</font></html>");
			} else {
				winner = new Color(0, 100, 255);
				turnLabel.setText("<html><font color=\"blue\">Player 1 wins</font></html>");
			}
			
			b1b1.setBackground(winner);
			b1b2.setBackground(winner);
			b1b3.setBackground(winner);
			b1b4.setBackground(winner);
			b1b5.setBackground(winner);
			b1b6.setBackground(winner);
			b1b7.setBackground(winner);
			b1b8.setBackground(winner);
			b1b9.setBackground(winner);
			if (b1b1.isEnabled()) {
				b1b1.setText(" ");
				b1b1.setEnabled(false);
			}
			if (b1b2.isEnabled()) {
				b1b2.setText(" ");
				b1b2.setEnabled(false);
			}
			if (b1b3.isEnabled()) {
				b1b3.setText(" ");
				b1b3.setEnabled(false);
			}
			if (b1b4.isEnabled()) {
				b1b4.setText(" ");
				b1b4.setEnabled(false);
			}
			if (b1b5.isEnabled()) {
				b1b5.setText(" ");
				b1b5.setEnabled(false);
			}
			if (b1b6.isEnabled()) {
				b1b6.setText(" ");
				b1b6.setEnabled(false);
			}
			if (b1b7.isEnabled()) {
				b1b7.setText(" ");
				b1b7.setEnabled(false);
			}
			if (b1b8.isEnabled()) {
				b1b8.setText(" ");
				b1b8.setEnabled(false);
			}
			if (b1b9.isEnabled()) {
				b1b9.setText(" ");
				b1b9.setEnabled(false);
			}
			b2b1.setBackground(winner);
			b2b2.setBackground(winner);
			b2b3.setBackground(winner);
			b2b4.setBackground(winner);
			b2b5.setBackground(winner);
			b2b6.setBackground(winner);
			b2b7.setBackground(winner);
			b2b8.setBackground(winner);
			b2b9.setBackground(winner);
			if (b2b1.isEnabled()) {
				b2b1.setText(" ");
				b2b1.setEnabled(false);
			}
			if (b2b2.isEnabled()) {
				b2b2.setText(" ");
				b2b2.setEnabled(false);
			}
			if (b2b3.isEnabled()) {
				b2b3.setText(" ");
				b2b3.setEnabled(false);
			}
			if (b2b4.isEnabled()) {
				b2b4.setText(" ");
				b2b4.setEnabled(false);
			}
			if (b2b5.isEnabled()) {
				b2b5.setText(" ");
				b2b5.setEnabled(false);
			}
			if (b2b6.isEnabled()) {
				b2b6.setText(" ");
				b2b6.setEnabled(false);
			}
			if (b2b7.isEnabled()) {
				b2b7.setText(" ");
				b2b7.setEnabled(false);
			}
			if (b2b8.isEnabled()) {
				b2b8.setText(" ");
				b2b8.setEnabled(false);
			}
			if (b2b9.isEnabled()) {
				b2b9.setText(" ");
				b2b9.setEnabled(false);
			}
			b3b1.setBackground(winner);
			b3b2.setBackground(winner);
			b3b3.setBackground(winner);
			b3b4.setBackground(winner);
			b3b5.setBackground(winner);
			b3b6.setBackground(winner);
			b3b7.setBackground(winner);
			b3b8.setBackground(winner);
			b3b9.setBackground(winner);
			if (b3b1.isEnabled()) {
				b3b1.setText(" ");
				b3b1.setEnabled(false);
			}
			if (b3b2.isEnabled()) {
				b3b2.setText(" ");
				b3b2.setEnabled(false);
			}
			if (b3b3.isEnabled()) {
				b3b3.setText(" ");
				b3b3.setEnabled(false);
			}
			if (b3b4.isEnabled()) {
				b3b4.setText(" ");
				b3b4.setEnabled(false);
			}
			if (b3b5.isEnabled()) {
				b3b5.setText(" ");
				b3b5.setEnabled(false);
			}
			if (b3b6.isEnabled()) {
				b3b6.setText(" ");
				b3b6.setEnabled(false);
			}
			if (b3b7.isEnabled()) {
				b3b7.setText(" ");
				b3b7.setEnabled(false);
			}
			if (b3b8.isEnabled()) {
				b3b8.setText(" ");
				b3b8.setEnabled(false);
			}
			if (b3b9.isEnabled()) {
				b3b9.setText(" ");
				b3b9.setEnabled(false);
			}
			b4b1.setBackground(winner);
			b4b2.setBackground(winner);
			b4b3.setBackground(winner);
			b4b4.setBackground(winner);
			b4b5.setBackground(winner);
			b4b6.setBackground(winner);
			b4b7.setBackground(winner);
			b4b8.setBackground(winner);
			b4b9.setBackground(winner);
			if (b4b1.isEnabled()) {
				b4b1.setText(" ");
				b4b1.setEnabled(false);
			}
			if (b4b2.isEnabled()) {
				b4b2.setText(" ");
				b4b2.setEnabled(false);
			}
			if (b4b3.isEnabled()) {
				b4b3.setText(" ");
				b4b3.setEnabled(false);
			}
			if (b4b4.isEnabled()) {
				b4b4.setText(" ");
				b4b4.setEnabled(false);
			}
			if (b4b5.isEnabled()) {
				b4b5.setText(" ");
				b4b5.setEnabled(false);
			}
			if (b4b6.isEnabled()) {
				b4b6.setText(" ");
				b4b6.setEnabled(false);
			}
			if (b4b7.isEnabled()) {
				b4b7.setText(" ");
				b4b7.setEnabled(false);
			}
			if (b4b8.isEnabled()) {
				b4b8.setText(" ");
				b4b8.setEnabled(false);
			}
			if (b4b9.isEnabled()) {
				b4b9.setText(" ");
				b4b9.setEnabled(false);
			}
			b5b1.setBackground(winner);
			b5b2.setBackground(winner);
			b5b3.setBackground(winner);
			b5b4.setBackground(winner);
			b5b5.setBackground(winner);
			b5b6.setBackground(winner);
			b5b7.setBackground(winner);
			b5b8.setBackground(winner);
			b5b9.setBackground(winner);
			if (b5b1.isEnabled()) {
				b5b1.setText(" ");
				b5b1.setEnabled(false);
			}
			if (b5b2.isEnabled()) {
				b5b2.setText(" ");
				b5b2.setEnabled(false);
			}
			if (b5b3.isEnabled()) {
				b5b3.setText(" ");
				b5b3.setEnabled(false);
			}
			if (b5b4.isEnabled()) {
				b5b4.setText(" ");
				b5b4.setEnabled(false);
			}
			if (b5b5.isEnabled()) {
				b5b5.setText(" ");
				b5b5.setEnabled(false);
			}
			if (b5b6.isEnabled()) {
				b5b6.setText(" ");
				b5b6.setEnabled(false);
			}
			if (b5b7.isEnabled()) {
				b5b7.setText(" ");
				b5b7.setEnabled(false);
			}
			if (b5b8.isEnabled()) {
				b5b8.setText(" ");
				b5b8.setEnabled(false);
			}
			if (b5b9.isEnabled()) {
				b5b9.setText(" ");
				b5b9.setEnabled(false);
			}
			b6b1.setBackground(winner);
			b6b2.setBackground(winner);
			b6b3.setBackground(winner);
			b6b4.setBackground(winner);
			b6b5.setBackground(winner);
			b6b6.setBackground(winner);
			b6b7.setBackground(winner);
			b6b8.setBackground(winner);
			b6b9.setBackground(winner);
			if (b6b1.isEnabled()) {
				b6b1.setText(" ");
				b6b1.setEnabled(false);
			}
			if (b6b2.isEnabled()) {
				b6b2.setText(" ");
				b6b2.setEnabled(false);
			}
			if (b6b3.isEnabled()) {
				b6b3.setText(" ");
				b6b3.setEnabled(false);
			}
			if (b6b4.isEnabled()) {
				b6b4.setText(" ");
				b6b4.setEnabled(false);
			}
			if (b6b5.isEnabled()) {
				b6b5.setText(" ");
				b6b5.setEnabled(false);
			}
			if (b6b6.isEnabled()) {
				b6b6.setText(" ");
				b6b6.setEnabled(false);
			}
			if (b6b7.isEnabled()) {
				b6b7.setText(" ");
				b6b7.setEnabled(false);
			}
			if (b6b8.isEnabled()) {
				b6b8.setText(" ");
				b6b8.setEnabled(false);
			}
			if (b6b9.isEnabled()) {
				b6b9.setText(" ");
				b6b9.setEnabled(false);
			}
			b7b1.setBackground(winner);
			b7b2.setBackground(winner);
			b7b3.setBackground(winner);
			b7b4.setBackground(winner);
			b7b5.setBackground(winner);
			b7b6.setBackground(winner);
			b7b7.setBackground(winner);
			b7b8.setBackground(winner);
			b7b9.setBackground(winner);
			if (b7b1.isEnabled()) {
				b7b1.setText(" ");
				b7b1.setEnabled(false);
			}
			if (b7b2.isEnabled()) {
				b7b2.setText(" ");
				b7b2.setEnabled(false);
			}
			if (b7b3.isEnabled()) {
				b7b3.setText(" ");
				b7b3.setEnabled(false);
			}
			if (b7b4.isEnabled()) {
				b7b4.setText(" ");
				b7b4.setEnabled(false);
			}
			if (b7b5.isEnabled()) {
				b7b5.setText(" ");
				b7b5.setEnabled(false);
			}
			if (b7b6.isEnabled()) {
				b7b6.setText(" ");
				b7b6.setEnabled(false);
			}
			if (b7b7.isEnabled()) {
				b7b7.setText(" ");
				b7b7.setEnabled(false);
			}
			if (b7b8.isEnabled()) {
				b7b8.setText(" ");
				b7b8.setEnabled(false);
			}
			if (b7b9.isEnabled()) {
				b7b9.setText(" ");
				b7b9.setEnabled(false);
			}
			b8b1.setBackground(winner);
			b8b2.setBackground(winner);
			b8b3.setBackground(winner);
			b8b4.setBackground(winner);
			b8b5.setBackground(winner);
			b8b6.setBackground(winner);
			b8b7.setBackground(winner);
			b8b8.setBackground(winner);
			b8b9.setBackground(winner);
			if (b8b1.isEnabled()) {
				b8b1.setText(" ");
				b8b1.setEnabled(false);
			}
			if (b8b2.isEnabled()) {
				b8b2.setText(" ");
				b8b2.setEnabled(false);
			}
			if (b8b3.isEnabled()) {
				b8b3.setText(" ");
				b8b3.setEnabled(false);
			}
			if (b8b4.isEnabled()) {
				b8b4.setText(" ");
				b8b4.setEnabled(false);
			}
			if (b8b5.isEnabled()) {
				b8b5.setText(" ");
				b8b5.setEnabled(false);
			}
			if (b8b6.isEnabled()) {
				b8b6.setText(" ");
				b8b6.setEnabled(false);
			}
			if (b8b7.isEnabled()) {
				b8b7.setText(" ");
				b8b7.setEnabled(false);
			}
			if (b8b8.isEnabled()) {
				b8b8.setText(" ");
				b8b8.setEnabled(false);
			}
			if (b8b9.isEnabled()) {
				b8b9.setText(" ");
				b8b9.setEnabled(false);
			}
			b9b1.setBackground(winner);
			b9b2.setBackground(winner);
			b9b3.setBackground(winner);
			b9b4.setBackground(winner);
			b9b5.setBackground(winner);
			b9b6.setBackground(winner);
			b9b7.setBackground(winner);
			b9b8.setBackground(winner);
			b9b9.setBackground(winner);
			if (b9b1.isEnabled()) {
				b9b1.setText(" ");
				b9b1.setEnabled(false);
			}
			if (b9b2.isEnabled()) {
				b9b2.setText(" ");
				b9b2.setEnabled(false);
			}
			if (b9b3.isEnabled()) {
				b9b3.setText(" ");
				b9b3.setEnabled(false);
			}
			if (b9b4.isEnabled()) {
				b9b4.setText(" ");
				b9b4.setEnabled(false);
			}
			if (b9b5.isEnabled()) {
				b9b5.setText(" ");
				b9b5.setEnabled(false);
			}
			if (b9b6.isEnabled()) {
				b9b6.setText(" ");
				b9b6.setEnabled(false);
			}
			if (b9b7.isEnabled()) {
				b9b7.setText(" ");
				b9b7.setEnabled(false);
			}
			if (b9b8.isEnabled()) {
				b9b8.setText(" ");
				b9b8.setEnabled(false);
			}
			if (b9b9.isEnabled()) {
				b9b9.setText(" ");
				b9b9.setEnabled(false);
			}
		}
	}
}
