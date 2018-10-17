package client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ClientView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JMenu mnFile;
	
	private JSplitPane mainSplitpane;
	
	private JPanel messagesPanel;
	private JScrollPane messagesScrollPane;
	private JLabel messagesLabel;
	private JTextPane messagesTextPane;
	
	private JSplitPane optionsSplitPane;
	private JTabbedPane optionsTabbedPane;
	private JPanel inputOptionsPanel;
	
	private JTextField roomTextField;
	private JButton changeRoomButton;
	
	private JTextField messageTextField;
	
	private JPanel sendMessagePanel;
	private JButton sendMessageButton;
	
	public ClientView() {
		super("Client");
		
		menuBar = new JMenuBar();
		mnFile = new JMenu("File");
		
		mainSplitpane = new JSplitPane();
		
		messagesPanel = new JPanel();
		messagesScrollPane = new JScrollPane();
		messagesLabel = new JLabel("Messaggi");
		messagesTextPane = new JTextPane();
		
		optionsSplitPane = new JSplitPane();
		optionsTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		inputOptionsPanel = new JPanel();
		
		roomTextField = new JTextField();
		
		changeRoomButton = new JButton("Cambia stanza");
		
		sendMessagePanel = new JPanel();
		messageTextField = new JTextField(30);
		sendMessageButton = new JButton("Invia");
		
		initialize();
	}
	
	private void initialize() {
		Container co = this.getContentPane();
		co.add(generateMainJPanel());
		
		setBounds(100, 100, 664, 434);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private JPanel generateMainJPanel() {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		
		setJMenuBar(menuBar);
		menuBar.add(mnFile);
		
		mainSplitpane.setResizeWeight(1.0);
		mainSplitpane.setLeftComponent(messagesPanel);
		mainSplitpane.setRightComponent(optionsSplitPane);
		jp.add(mainSplitpane, BorderLayout.CENTER);
		
		messagesPanel.setLayout(new BorderLayout(0, 0));
		messagesPanel.add(messagesScrollPane);
		
		messagesScrollPane.setViewportView(messagesTextPane);
		messagesScrollPane.setColumnHeaderView(messagesLabel);
		
		optionsSplitPane.setResizeWeight(0.6);
		optionsSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		optionsSplitPane.setLeftComponent(optionsTabbedPane);
		optionsSplitPane.setRightComponent(inputOptionsPanel);
		
		inputOptionsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		inputOptionsPanel.add(roomTextField);
		inputOptionsPanel.add(changeRoomButton);
		
		roomTextField.setColumns(20);
	
		sendMessagePanel.add(messageTextField);
		sendMessagePanel.add(sendMessageButton);
		
		jp.add(sendMessagePanel, BorderLayout.SOUTH);
		
		return jp;
	}
	
//	private void initialize() {
//		setBounds(100, 100, 664, 434);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		JMenuBar menuBar = new JMenuBar();
//		setJMenuBar(menuBar);
//		
//		JMenu mnFile = new JMenu("File");
//		menuBar.add(mnFile);
//		
//		JSplitPane mainSplitpane = new JSplitPane();
//		mainSplitpane.setResizeWeight(1.0);
//		getContentPane().add(mainSplitpane, BorderLayout.CENTER);
//		
//		JPanel messagesPanel = new JPanel();
//		mainSplitpane.setLeftComponent(messagesPanel);
//		messagesPanel.setLayout(new BorderLayout(0, 0));
//		
//		JScrollPane messagesScrollPane = new JScrollPane();
//		messagesPanel.add(messagesScrollPane);
//		
//		JTextPane messagesTextPane = new JTextPane();
//		messagesScrollPane.setViewportView(messagesTextPane);
//		
//		JLabel messagesLabel = new JLabel("Messaggi");
//		messagesScrollPane.setColumnHeaderView(messagesLabel);
//		
//		JSplitPane optionsSplitPane = new JSplitPane();
//		optionsSplitPane.setResizeWeight(0.6);
//		optionsSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
//		mainSplitpane.setRightComponent(optionsSplitPane);
//		
//		JTabbedPane optionsTabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		optionsSplitPane.setLeftComponent(optionsTabbedPane);
//		
//		JPanel inputOptionsPanel = new JPanel();
//		optionsSplitPane.setRightComponent(inputOptionsPanel);
//		inputOptionsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
//		
//		roomTextField = new JTextField();
//		inputOptionsPanel.add(roomTextField);
//		roomTextField.setColumns(20);
//		
//		JButton changeRoomButton = new JButton("Cambia stanza");
//		inputOptionsPanel.add(changeRoomButton);
//		
//		
//		
//		
//		
//		getContentPane().add(sendMessagePanel, BorderLayout.SOUTH);
//		
//	}
	
}
