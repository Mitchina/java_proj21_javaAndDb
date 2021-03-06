package pkg1.views;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreatePlayer extends JPanel {
	/**
	 * Create the panel.
	 */
	public CreatePlayer(JFrame window) {
		setVisible(true);
		setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		add(desktopPane, BorderLayout.CENTER);
		
		JToolBar toolBar_1 = new JToolBar();
		toolBar_1.setBackground(new Color(255, 204, 51));
		add(toolBar_1, BorderLayout.NORTH);
		
		JButton btnCreate = new JButton("Create character");
		btnCreate.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		toolBar_1.add(btnCreate);
		
		JButton btnAbility = new JButton("Abilities");
		btnAbility.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		toolBar_1.add(btnAbility);
		
		JButton btnNewButton = new JButton("Background and Aligment");
		btnNewButton.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		toolBar_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(e->menuPane(window));
		btnNewButton_1.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		toolBar_1.add(btnNewButton_1);	

	}
	
	private void menuPane(JFrame window) {
		// this class is a panel, return to the menu that is a JFrame
		this.setVisible(false);
		window.getContentPane().setVisible(true);
		window.setContentPane(window.getContentPane());
		//window.getContentPane().isEnabled();
		
		
	}

}
