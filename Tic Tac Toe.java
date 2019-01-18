package x;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TicTacToe {
	
	static TicTacToe ttt;
	JFrame frame;
	
	XButton b1b1,b1b2,b1b3,b1b4,b1b5,b1b6,b1b7,b1b8,b1b9, b2b1,b2b2,b2b3,b2b4,b2b5,b2b6,b2b7,b2b8,b2b9, b3b1,b3b2,b3b3,b3b4,b3b5,b3b6,b3b7,b3b8,b3b9, b4b1,b4b2,b4b3,b4b4,b4b5,b4b6,b4b7,b4b8,b4b9,
			b5b1,b5b2,b5b3,b5b4,b5b5,b5b6,b5b7,b5b8,b5b9, b6b1,b6b2,b6b3,b6b4,b6b5,b6b6,b6b7,b6b8,b6b9, b7b1,b7b2,b7b3,b7b4,b7b5,b7b6,b7b7,b7b8,b7b9, b8b1,b8b2,b8b3,b8b4,b8b5,b8b6,b8b7,b8b8,b8b9,
			b9b1,b9b2,b9b3,b9b4,b9b5,b9b6,b9b7,b9b8,b9b9;
	boolean[][] blackouts = { {false, false, false},{false, false, false},{false, false, false} };
	
	XButton[] buttons = new XButton[81];
	XButton[] board1 = new XButton[9];
	XButton[] board2 = new XButton[9];
	XButton[] board3 = new XButton[9];
	XButton[] board4 = new XButton[9];
	XButton[] board5 = new XButton[9];
	XButton[] board6 = new XButton[9];
	XButton[] board7 = new XButton[9];
	XButton[] board8 = new XButton[9];
	XButton[] board9 = new XButton[9];
	XButton[][] boards = new XButton[9][9];
	
	boolean blackout_b1 = false;
	boolean blackout_b2 = false;
	boolean blackout_b3 = false;
	boolean blackout_b4 = false;
	boolean blackout_b5 = false;
	boolean blackout_b6 = false;
	boolean blackout_b7 = false;
	boolean blackout_b8 = false;
	boolean blackout_b9 = false;
	
	JLabel turnLabel;
	Color winner;
	int turnNum = 1;
	boolean gameWon = false;
	
	String rulesText = "This game is a modified version of Tic Tac Toe. The variation is that both players are X, and there are multiple boards.\n\nEvery other turn a player will take turns clicking on the white boxes to place their X. Because both players are X it does not matter who placed which X, just that an X is placed there.\n\nOnce a board gets three in a row, that board is considered dead, and no more X's can be played in it.\nOnce three boards in a row are dead, the player who made the final move that killed the last board loses.\n\nThe object of the game is to not kill three boards in a row.";
	
	public static void main(String[] args) {
		
		new TicTacToe();
	}
	public TicTacToe() {
		
		ttt = this;
		
		frame = new JFrame();
		frame.setTitle("All X's Tic Tac Toe - Move 1");
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
		
		b1b1 = new XButton();b1b1.init();b1b1.setMain(ttt);
		b1b2 = new XButton();b1b2.init();b1b2.setMain(ttt);
		b1b3 = new XButton();b1b3.init();b1b3.setMain(ttt);
		b1b4 = new XButton();b1b4.init();b1b4.setMain(ttt);
		b1b5 = new XButton();b1b5.init();b1b5.setMain(ttt);
		b1b6 = new XButton();b1b6.init();b1b6.setMain(ttt);
		b1b7 = new XButton();b1b7.init();b1b7.setMain(ttt);
		b1b8 = new XButton();b1b8.init();b1b8.setMain(ttt);
		b1b9 = new XButton();b1b9.init();b1b9.setMain(ttt);
		
		b2b1 = new XButton();b2b1.init();b2b1.setMain(ttt);
		b2b2 = new XButton();b2b2.init();b2b2.setMain(ttt);
		b2b3 = new XButton();b2b3.init();b2b3.setMain(ttt);
		b2b4 = new XButton();b2b4.init();b2b4.setMain(ttt);
		b2b5 = new XButton();b2b5.init();b2b5.setMain(ttt);
		b2b6 = new XButton();b2b6.init();b2b6.setMain(ttt);
		b2b7 = new XButton();b2b7.init();b2b7.setMain(ttt);
		b2b8 = new XButton();b2b8.init();b2b8.setMain(ttt);
		b2b9 = new XButton();b2b9.init();b2b9.setMain(ttt);

		b3b1 = new XButton();b3b1.init();b3b1.setMain(ttt);
		b3b2 = new XButton();b3b2.init();b3b2.setMain(ttt);
		b3b3 = new XButton();b3b3.init();b3b3.setMain(ttt);
		b3b4 = new XButton();b3b4.init();b3b4.setMain(ttt);
		b3b5 = new XButton();b3b5.init();b3b5.setMain(ttt);
		b3b6 = new XButton();b3b6.init();b3b6.setMain(ttt);
		b3b7 = new XButton();b3b7.init();b3b7.setMain(ttt);
		b3b8 = new XButton();b3b8.init();b3b8.setMain(ttt);
		b3b9 = new XButton();b3b9.init();b3b9.setMain(ttt);
		
		b4b1 = new XButton();b4b1.init();b4b1.setMain(ttt);
		b4b2 = new XButton();b4b2.init();b4b2.setMain(ttt);
		b4b3 = new XButton();b4b3.init();b4b3.setMain(ttt);
		b4b4 = new XButton();b4b4.init();b4b4.setMain(ttt);
		b4b5 = new XButton();b4b5.init();b4b5.setMain(ttt);
		b4b6 = new XButton();b4b6.init();b4b6.setMain(ttt);
		b4b7 = new XButton();b4b7.init();b4b7.setMain(ttt);
		b4b8 = new XButton();b4b8.init();b4b8.setMain(ttt);
		b4b9 = new XButton();b4b9.init();b4b9.setMain(ttt);
		
		b5b1 = new XButton();b5b1.init();b5b1.setMain(ttt);
		b5b2 = new XButton();b5b2.init();b5b2.setMain(ttt);
		b5b3 = new XButton();b5b3.init();b5b3.setMain(ttt);
		b5b4 = new XButton();b5b4.init();b5b4.setMain(ttt);
		b5b5 = new XButton();b5b5.init();b5b5.setMain(ttt);
		b5b6 = new XButton();b5b6.init();b5b6.setMain(ttt);
		b5b7 = new XButton();b5b7.init();b5b7.setMain(ttt);
		b5b8 = new XButton();b5b8.init();b5b8.setMain(ttt);
		b5b9 = new XButton();b5b9.init();b5b9.setMain(ttt);
		
		b6b1 = new XButton();b6b1.init();b6b1.setMain(ttt);
		b6b2 = new XButton();b6b2.init();b6b2.setMain(ttt);
		b6b3 = new XButton();b6b3.init();b6b3.setMain(ttt);
		b6b4 = new XButton();b6b4.init();b6b4.setMain(ttt);
		b6b5 = new XButton();b6b5.init();b6b5.setMain(ttt);
		b6b6 = new XButton();b6b6.init();b6b6.setMain(ttt);
		b6b7 = new XButton();b6b7.init();b6b7.setMain(ttt);
		b6b8 = new XButton();b6b8.init();b6b8.setMain(ttt);
		b6b9 = new XButton();b6b9.init();b6b9.setMain(ttt);
		
		b7b1 = new XButton();b7b1.init();b7b1.setMain(ttt);
		b7b2 = new XButton();b7b2.init();b7b2.setMain(ttt);
		b7b3 = new XButton();b7b3.init();b7b3.setMain(ttt);
		b7b4 = new XButton();b7b4.init();b7b4.setMain(ttt);
		b7b5 = new XButton();b7b5.init();b7b5.setMain(ttt);
		b7b6 = new XButton();b7b6.init();b7b6.setMain(ttt);
		b7b7 = new XButton();b7b7.init();b7b7.setMain(ttt);
		b7b8 = new XButton();b7b8.init();b7b8.setMain(ttt);
		b7b9 = new XButton();b7b9.init();b7b9.setMain(ttt);
		
		b8b1 = new XButton();b8b1.init();b8b1.setMain(ttt);
		b8b2 = new XButton();b8b2.init();b8b2.setMain(ttt);
		b8b3 = new XButton();b8b3.init();b8b3.setMain(ttt);
		b8b4 = new XButton();b8b4.init();b8b4.setMain(ttt);
		b8b5 = new XButton();b8b5.init();b8b5.setMain(ttt);
		b8b6 = new XButton();b8b6.init();b8b6.setMain(ttt);
		b8b7 = new XButton();b8b7.init();b8b7.setMain(ttt);
		b8b8 = new XButton();b8b8.init();b8b8.setMain(ttt);
		b8b9 = new XButton();b8b9.init();b8b9.setMain(ttt);
		
		b9b1 = new XButton();b9b1.init();b9b1.setMain(ttt);
		b9b2 = new XButton();b9b2.init();b9b2.setMain(ttt);
		b9b3 = new XButton();b9b3.init();b9b3.setMain(ttt);
		b9b4 = new XButton();b9b4.init();b9b4.setMain(ttt);
		b9b5 = new XButton();b9b5.init();b9b5.setMain(ttt);
		b9b6 = new XButton();b9b6.init();b9b6.setMain(ttt);
		b9b7 = new XButton();b9b7.init();b9b7.setMain(ttt);
		b9b8 = new XButton();b9b8.init();b9b8.setMain(ttt);
		b9b9 = new XButton();b9b9.init();b9b9.setMain(ttt);
		
		board1 = new XButton[]{b1b1,b1b2,b1b3,b1b4,b1b5,b1b6,b1b7,b1b8,b1b9};
		board2 = new XButton[]{b2b1,b2b2,b2b3,b2b4,b2b5,b2b6,b2b7,b2b8,b2b9};
		board3 = new XButton[]{b3b1,b3b2,b3b3,b3b4,b3b5,b3b6,b3b7,b3b8,b3b9};
		board4 = new XButton[]{b4b1,b4b2,b4b3,b4b4,b4b5,b4b6,b4b7,b4b8,b4b9};
		board5 = new XButton[]{b5b1,b5b2,b5b3,b5b4,b5b5,b5b6,b5b7,b5b8,b5b9};
		board6 = new XButton[]{b6b1,b6b2,b6b3,b6b4,b6b5,b6b6,b6b7,b6b8,b6b9};
		board7 = new XButton[]{b7b1,b7b2,b7b3,b7b4,b7b5,b7b6,b7b7,b7b8,b7b9};
		board8 = new XButton[]{b8b1,b8b2,b8b3,b8b4,b8b5,b8b6,b8b7,b8b8,b8b9};
		board9 = new XButton[]{b9b1,b9b2,b9b3,b9b4,b9b5,b9b6,b9b7,b9b8,b9b9};
		boards = new XButton[][]{board1, board2, board3, board4, board5, board6, board7, board8, board9};
		
		buttons = new XButton[]{b1b1,b1b2,b1b3,b1b4,b1b5,b1b6,b1b7,b1b8,b1b9, b2b1,b2b2,b2b3,b2b4,b2b5,b2b6,b2b7,b2b8,b2b9, b3b1,b3b2,b3b3,b3b4,b3b5,b3b6,b3b7,b3b8,b3b9, 
						  		b4b1,b4b2,b4b3,b4b4,b4b5,b4b6,b4b7,b4b8,b4b9, b5b1,b5b2,b5b3,b5b4,b5b5,b5b6,b5b7,b5b8,b5b9, b6b1,b6b2,b6b3,b6b4,b6b5,b6b6,b6b7,b6b8,b6b9, 
						  		b7b1,b7b2,b7b3,b7b4,b7b5,b7b6,b7b7,b7b8,b7b9, b8b1,b8b2,b8b3,b8b4,b8b5,b8b6,b8b7,b8b8,b8b9, b9b1,b9b2,b9b3,b9b4,b9b5,b9b6,b9b7,b9b8,b9b9};
		
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
		
		//CPU(); // Will randomly select a square each second
	}
	public void check(boolean size) {
		
		if (size == true) {
			turn();
		}
		if (blackout_b1 == false && ( (!b1b1.isEnabled() && !b1b2.isEnabled() && !b1b3.isEnabled()) || (!b1b1.isEnabled() && !b1b4.isEnabled() && !b1b7.isEnabled()) || (!b1b1.isEnabled() && !b1b5.isEnabled() && !b1b9.isEnabled()) 
				|| (!b1b2.isEnabled() && !b1b5.isEnabled() && !b1b8.isEnabled()) || (!b1b3.isEnabled() && !b1b6.isEnabled() && !b1b9.isEnabled()) || (!b1b3.isEnabled() && !b1b5.isEnabled() && !b1b7.isEnabled())
				|| (!b1b4.isEnabled() && !b1b5.isEnabled() && !b1b6.isEnabled()) || (!b1b7.isEnabled() && !b1b8.isEnabled() && !b1b9.isEnabled())) ) {
			blackout_b1 = true;
			blackout(1, 1, 0);
		}
		if (blackout_b2 == false && ( (!b2b1.isEnabled() && !b2b2.isEnabled() && !b2b3.isEnabled()) || (!b2b1.isEnabled() && !b2b4.isEnabled() && !b2b7.isEnabled()) || (!b2b1.isEnabled() && !b2b5.isEnabled() && !b2b9.isEnabled()) 
				|| (!b2b2.isEnabled() && !b2b5.isEnabled() && !b2b8.isEnabled()) || (!b2b3.isEnabled() && !b2b6.isEnabled() && !b2b9.isEnabled()) || (!b2b3.isEnabled() && !b2b5.isEnabled() && !b2b7.isEnabled())
				|| (!b2b4.isEnabled() && !b2b5.isEnabled() && !b2b6.isEnabled()) || (!b2b7.isEnabled() && !b2b8.isEnabled() && !b2b9.isEnabled())) ) {
			blackout_b2 = true;
			blackout(1, 2, 0);
		}
		if (blackout_b3 == false && ( (!b3b1.isEnabled() && !b3b2.isEnabled() && !b3b3.isEnabled()) || (!b3b1.isEnabled() && !b3b4.isEnabled() && !b3b7.isEnabled()) || (!b3b1.isEnabled() && !b3b5.isEnabled() && !b3b9.isEnabled()) 
				|| (!b3b2.isEnabled() && !b3b5.isEnabled() && !b3b8.isEnabled()) || (!b3b3.isEnabled() && !b3b6.isEnabled() && !b3b9.isEnabled()) || (!b3b3.isEnabled() && !b3b5.isEnabled() && !b3b7.isEnabled())
				|| (!b3b4.isEnabled() && !b3b5.isEnabled() && !b3b6.isEnabled()) || (!b3b7.isEnabled() && !b3b8.isEnabled() && !b3b9.isEnabled())) ) {
			blackout_b3 = true;
			blackout(1, 3, 0);
		}
		if (blackout_b4 == false && ( (!b4b1.isEnabled() && !b4b2.isEnabled() && !b4b3.isEnabled()) || (!b4b1.isEnabled() && !b4b4.isEnabled() && !b4b7.isEnabled()) || (!b4b1.isEnabled() && !b4b5.isEnabled() && !b4b9.isEnabled()) 
				|| (!b4b2.isEnabled() && !b4b5.isEnabled() && !b4b8.isEnabled()) || (!b4b3.isEnabled() && !b4b6.isEnabled() && !b4b9.isEnabled()) || (!b4b3.isEnabled() && !b4b5.isEnabled() && !b4b7.isEnabled())
				|| (!b4b4.isEnabled() && !b4b5.isEnabled() && !b4b6.isEnabled()) || (!b4b7.isEnabled() && !b4b8.isEnabled() && !b4b9.isEnabled())) ) {
			blackout_b4 = true;
			blackout(2, 1, 0);
		}
		if (blackout_b5 == false && ( (!b5b1.isEnabled() && !b5b2.isEnabled() && !b5b3.isEnabled()) || (!b5b1.isEnabled() && !b5b4.isEnabled() && !b5b7.isEnabled()) || (!b5b1.isEnabled() && !b5b5.isEnabled() && !b5b9.isEnabled()) 
				|| (!b5b2.isEnabled() && !b5b5.isEnabled() && !b5b8.isEnabled()) || (!b5b3.isEnabled() && !b5b6.isEnabled() && !b5b9.isEnabled()) || (!b5b3.isEnabled() && !b5b5.isEnabled() && !b5b7.isEnabled())
				|| (!b5b4.isEnabled() && !b5b5.isEnabled() && !b5b6.isEnabled()) || (!b5b7.isEnabled() && !b5b8.isEnabled() && !b5b9.isEnabled())) ) {
			blackout_b5 = true;
			blackout(2, 2, 0);
		}
		if (blackout_b6 == false && ( (!b6b1.isEnabled() && !b6b2.isEnabled() && !b6b3.isEnabled()) || (!b6b1.isEnabled() && !b6b4.isEnabled() && !b6b7.isEnabled()) || (!b6b1.isEnabled() && !b6b5.isEnabled() && !b6b9.isEnabled()) 
				|| (!b6b2.isEnabled() && !b6b5.isEnabled() && !b6b8.isEnabled()) || (!b6b3.isEnabled() && !b6b6.isEnabled() && !b6b9.isEnabled()) || (!b6b3.isEnabled() && !b6b5.isEnabled() && !b6b7.isEnabled())
				|| (!b6b4.isEnabled() && !b6b5.isEnabled() && !b6b6.isEnabled()) || (!b6b7.isEnabled() && !b6b8.isEnabled() && !b6b9.isEnabled())) ) {
			blackout_b6 = true;
			blackout(2, 3, 0);
		}
		if (blackout_b7 == false && ( (!b7b1.isEnabled() && !b7b2.isEnabled() && !b7b3.isEnabled()) || (!b7b1.isEnabled() && !b7b4.isEnabled() && !b7b7.isEnabled()) || (!b7b1.isEnabled() && !b7b5.isEnabled() && !b7b9.isEnabled()) 
				|| (!b7b2.isEnabled() && !b7b5.isEnabled() && !b7b8.isEnabled()) || (!b7b3.isEnabled() && !b7b6.isEnabled() && !b7b9.isEnabled()) || (!b7b3.isEnabled() && !b7b5.isEnabled() && !b7b7.isEnabled())
				|| (!b7b4.isEnabled() && !b7b5.isEnabled() && !b7b6.isEnabled()) || (!b7b7.isEnabled() && !b7b8.isEnabled() && !b7b9.isEnabled())) ) {
			blackout_b7 = true;
			blackout(3, 1, 0);
		}
		if (blackout_b8 == false && ( (!b8b1.isEnabled() && !b8b2.isEnabled() && !b8b3.isEnabled()) || (!b8b1.isEnabled() && !b8b4.isEnabled() && !b8b7.isEnabled()) || (!b8b1.isEnabled() && !b8b5.isEnabled() && !b8b9.isEnabled()) 
				|| (!b8b2.isEnabled() && !b8b5.isEnabled() && !b8b8.isEnabled()) || (!b8b3.isEnabled() && !b8b6.isEnabled() && !b8b9.isEnabled()) || (!b8b3.isEnabled() && !b8b5.isEnabled() && !b8b7.isEnabled())
				|| (!b8b4.isEnabled() && !b8b5.isEnabled() && !b8b6.isEnabled()) || (!b8b7.isEnabled() && !b8b8.isEnabled() && !b8b9.isEnabled())) ) {
			blackout_b8 = true;
			blackout(3, 2, 0);
		}
		if (blackout_b9 == false && ( (!b9b1.isEnabled() && !b9b2.isEnabled() && !b9b3.isEnabled()) || (!b9b1.isEnabled() && !b9b4.isEnabled() && !b9b7.isEnabled()) || (!b9b1.isEnabled() && !b9b5.isEnabled() && !b9b9.isEnabled()) 
				|| (!b9b2.isEnabled() && !b9b5.isEnabled() && !b9b8.isEnabled()) || (!b9b3.isEnabled() && !b9b6.isEnabled() && !b9b9.isEnabled()) || (!b9b3.isEnabled() && !b9b5.isEnabled() && !b9b7.isEnabled())
				|| (!b9b4.isEnabled() && !b9b5.isEnabled() && !b9b6.isEnabled()) || (!b9b7.isEnabled() && !b9b8.isEnabled() && !b9b9.isEnabled())) ) {
			blackout_b9 = true;
			blackout(3, 3, 0);
		}
		if ( (blackouts[0][0] && blackouts[0][1] && blackouts[0][2]) || (blackouts[0][0] && blackouts[1][0] && blackouts[2][0]) || (blackouts[0][0] && blackouts[1][1] && blackouts[2][2]) 
				|| (blackouts[1][0] && blackouts[1][1] && blackouts[1][2]) || (blackouts[2][0] && blackouts[2][1] && blackouts[2][2]) || (blackouts[0][1] && blackouts[1][1] && blackouts[2][1])
				|| (blackouts[0][2] && blackouts[1][2] && blackouts[2][2]) || (blackouts[2][0] && blackouts[1][1] && blackouts[0][2]) ) {
			blackout(0, 0, 1);
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
		
		frame.setTitle("Tic Tac Toe, All X's - Move " + turnNum);
	}
	public void blackout(int x, int y, int scale) {
		
		if (scale == 0) {
			if (x == 1 && y == 1) {
				for (int i=0; i<9; i++) {
					board1[i].setColor(Color.BLACK);
					if (board1[i].getEnabled() == true) {
						board1[i].changeText(" ");
						board1[i].changeState(false);
					}
				}
			} else if (x == 1 && y == 2) {
				for (int i=0; i<9; i++) {
					board2[i].setColor(Color.BLACK);
					if (board2[i].getEnabled() == true) {
						board2[i].changeText(" ");
						board2[i].changeState(false);
					}
				}
			} else if (x == 1 && y == 3) {
				for (int i=0; i<9; i++) {
					board3[i].setColor(Color.BLACK);
					if (board3[i].getEnabled() == true) {
						board3[i].changeText(" ");
						board3[i].changeState(false);
					}
				}
			} else if (x == 2 && y == 1) {
				for (int i=0; i<9; i++) {
					board4[i].setColor(Color.BLACK);
					if (board4[i].getEnabled() == true) {
						board4[i].changeText(" ");
						board4[i].changeState(false);
					}
				}
			} else if (x == 2 && y == 2) {
				for (int i=0; i<9; i++) {
					board5[i].setColor(Color.BLACK);
					if (board5[i].getEnabled() == true) {
						board5[i].changeText(" ");
						board5[i].changeState(false);
					}
				}
			} else if (x == 2 && y == 3) {
				for (int i=0; i<9; i++) {
					board6[i].setColor(Color.BLACK);
					if (board6[i].getEnabled() == true) {
						board6[i].changeText(" ");
						board6[i].changeState(false);
					}
				}
			} else if (x == 3 && y == 1) {
				for (int i=0; i<9; i++) {
					board7[i].setColor(Color.BLACK);
					if (board7[i].getEnabled() == true) {
						board7[i].changeText(" ");
						board7[i].changeState(false);
					}
				}
			} else if (x == 3 && y == 2) {
				for (int i=0; i<9; i++) {
					board8[i].setColor(Color.BLACK);
					if (board8[i].getEnabled() == true) {
						board8[i].changeText(" ");
						board8[i].changeState(false);
					}
				}
			} else if (x == 3 && y == 3) {
				for (int i=0; i<9; i++) {
					board9[i].setColor(Color.BLACK);
					if (board9[i].getEnabled() == true) {
						board9[i].changeText(" ");
						board9[i].changeState(false);
					}
				}
			}
			blackouts[x-1][y-1] = true;
			check(false);
		} else {
			if (turnNum % 2 == 0) {
				winner = new Color(0, 200, 0);
				turnLabel.setText("<html><font color=\"green\">Player 2 wins</font></html>");
			} else {
				winner = new Color(0, 100, 255);
				turnLabel.setText("<html><font color=\"blue\">Player 1 wins</font></html>");
			}
			
			for(int i=0; i<9; i++) {
				for (int j=0; j<9; j++) {
					boards[i][j].setColor(winner);
					if (boards[i][j].getEnabled() == true) {
						boards[i][j].changeText(" ");
						boards[i][j].changeState(false);
					}
				}
			}
			gameWon = true;
		}
	}
	public void CPU() {
		System.out.println("CPU :: initializing...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CPU :: shuffling...");
		shuffle(buttons);
		
		for (int i=0; i<81; i++) {
			
			System.out.println("CPU :: disabling button...");
			buttons[i].changeState(false);
			check(true);
			if (gameWon) {
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("CPU :: finished.");
	}
	public void shuffle(Object[] array) {
		
		int length = array.length;
		
		for (int i=0; i<length; i++) {
			int s = i + (int)(Math.random() * (length - i));
			
			Object temp = array[s];
			array[s] = array[i];
			array[i] = temp;
		}
	}
}
