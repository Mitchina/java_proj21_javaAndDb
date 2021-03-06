package pkg1.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class CharacterSheetFrame extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private List<JButton> menuButtons;

	/**
	 * Create the frame.
	 */
	public CharacterSheetFrame() {
		setTitle("RPG");
		setVisible(true);
		menuButtons = new ArrayList<>();
		// overriding the windowClosing event
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askPlayerIfWannaExit();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 492, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 1, 0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setForeground(Color.WHITE);
		contentPane.add(desktopPane);
		desktopPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton btnStart = new JButton("START GAME");
		
		// passing this JFrame class as reference for the window in the pane 'CreatePlayer'
		btnStart.addActionListener(e->loadInternalPane(new CreatePlayer(this)));
		desktopPane.add(btnStart);
		menuButtons.add(btnStart);
		
		JButton btnOptions = new JButton("OPTIONS");
		desktopPane.add(btnOptions);
		menuButtons.add(btnOptions);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(e->askPlayerIfWannaExit());
		desktopPane.add(btnExit);
		menuButtons.add(btnExit);
		
	}	
	
	private void loadInternalPane(JPanel pane) {
		this.contentPane.setVisible(false);
		setContentPane(pane);		
		pane.setVisible(true);
	}
	
	
	
	private void askPlayerIfWannaExit() {
		// create an option panel for the user
		int answer = JOptionPane.showConfirmDialog(
				CharacterSheetFrame.this, 
				"Exit the game?", 
				"You are about to exit the game.",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		//System.out.println(answer); // 0 for yes, 1 for no
		if(answer==0)	
			CharacterSheetFrame.this.dispose();
		else
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

}
