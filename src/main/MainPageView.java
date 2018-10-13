package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPageView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel;
	
	private JPanel textPanel;
	private JLabel textLabel;
	
	private JPanel buttonsPanel;
	
	private JPanel clientPanel;
	private JButton startClientButton;
	
	private JPanel serverPanel;
	private JButton startServerButton;

	public MainPageView() {
		super("Main page");
	}
	
	
}
