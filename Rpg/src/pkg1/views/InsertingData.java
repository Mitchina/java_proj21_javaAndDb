package pkg1.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Color;

public class InsertingData extends JInternalFrame {

	private JPanel contentPane;
	// adding the desktopPane as an attribute of the class
	private JDesktopPane desktopPane;
	
	/**
	 * Create the frame.
	 */
	public InsertingData() {
		//this.desktopPane = desktopPane;
		//setVisible(true);
		setBounds(100, 100, 513, 508);
		contentPane = new JPanel();
		//contentPane.setBorder(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane deskCreateChar = new JDesktopPane();
		contentPane.add(deskCreateChar, BorderLayout.CENTER);
		deskCreateChar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(255, 204, 51));
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnCreate = new JButton("Create character");
		btnCreate.setHorizontalAlignment(SwingConstants.TRAILING);
		toolBar.add(btnCreate);
		
		JButton btnAbility = new JButton("Abilities");
		btnAbility.setHorizontalAlignment(SwingConstants.TRAILING);
		toolBar.add(btnAbility);
		
		JButton btnNewButton = new JButton("Background and Aligment");
		btnNewButton.setHorizontalAlignment(SwingConstants.TRAILING);
		toolBar.add(btnNewButton);
	}
}
