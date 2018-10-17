package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestGUI {

	private JFrame frame;
	private JTextField roomTextField;
	private JTextField messageTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JSplitPane mainSplitpane = new JSplitPane();
		mainSplitpane.setResizeWeight(1.0);
		frame.getContentPane().add(mainSplitpane, BorderLayout.CENTER);
		
		JPanel messagesPanel = new JPanel();
		mainSplitpane.setLeftComponent(messagesPanel);
		messagesPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane messagesScrollPane = new JScrollPane();
		messagesPanel.add(messagesScrollPane);
		
		JTextPane messagesTextPane = new JTextPane();
		messagesScrollPane.setViewportView(messagesTextPane);
		
		JLabel messagesLabel = new JLabel("Messaggi");
		messagesScrollPane.setColumnHeaderView(messagesLabel);
		
		JSplitPane optionsSplitPane = new JSplitPane();
		optionsSplitPane.setResizeWeight(0.6);
		optionsSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		mainSplitpane.setRightComponent(optionsSplitPane);
		
		JTabbedPane optionsTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		optionsSplitPane.setLeftComponent(optionsTabbedPane);
		
		JPanel inputOptionsPanel = new JPanel();
		optionsSplitPane.setRightComponent(inputOptionsPanel);
		inputOptionsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		roomTextField = new JTextField();
		inputOptionsPanel.add(roomTextField);
		roomTextField.setColumns(20);
		
		JButton changeRoomButton = new JButton("Cambia stanza");
		inputOptionsPanel.add(changeRoomButton);
		
		JPanel sendMessagePanel = new JPanel();
		frame.getContentPane().add(sendMessagePanel, BorderLayout.SOUTH);
		
		messageTextField = new JTextField();
		sendMessagePanel.add(messageTextField);
		messageTextField.setColumns(30);
		
		JButton sendMessageButton = new JButton("Invia");
		sendMessageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sendMessagePanel.add(sendMessageButton);
	}

}
