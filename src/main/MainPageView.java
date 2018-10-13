package main;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPageView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel;
	
	private JPanel titlePanel;
	private JLabel titleLabel;
	
	private JPanel buttonsPanel;
	
	private JPanel clientPanel;
	private JButton startClientButton;
	
	private JPanel serverPanel;
	private JButton startServerButton;

	public MainPageView() {
		super("Main page");
		
		mainPanel = new JPanel();
		
		titlePanel = new JPanel();
		titleLabel = new JLabel("Scegli un'opzione");
		
		buttonsPanel = new JPanel();
		
		clientPanel = new JPanel();
		startClientButton = new JButton("Client");
		
		serverPanel = new JPanel();
		startServerButton = new JButton("Server");
		
		createGUI();
		
		setActionListeners();
	}
	
	private void setActionListeners() {
		
	}

	private void createGUI() {
		Container co = this.getContentPane();
		co.add(generateMainJPanel());

		this.setSize(300,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	private JPanel generateMainJPanel() {
		JPanel jp = new JPanel();
		
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		
		titlePanel.add(titleLabel);
		
		jp.add(titlePanel);
		
		clientPanel.add(startClientButton);
		buttonsPanel.add(clientPanel);
		
		serverPanel.add(startServerButton);
		buttonsPanel.add(serverPanel);
		
		jp.add(buttonsPanel);
		
		return jp;
	}
	
	public void setStartClientButtonListener(ActionListener actionListener) {
		startClientButton.addActionListener(actionListener);
	}
	
	public void setStartServerButtonListener(ActionListener actionListener) {
		startServerButton.addActionListener(actionListener);
	}
}
