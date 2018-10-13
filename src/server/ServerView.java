package server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class ServerView extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JTabbedPane mainTabbedPane;
	
	private JPanel logsPanel;
	private JScrollPane logsScrollPane;
	private JTextArea logsTextArea;
	
	private JPanel optionsPanel;
	
	public ServerView() {
		super("Server");
		
		mainTabbedPane = new JTabbedPane();
		
		logsPanel = new JPanel();
		logsTextArea = new JTextArea(0,40);
		logsScrollPane = new JScrollPane(logsTextArea);
		
		optionsPanel = new JPanel();
		
		createGUI();
	}

	private void createGUI() {
		
		Container co = this.getContentPane();
		co.add(generateMainJPanel());

		this.setSize(460,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private JPanel generateMainJPanel() {
		JPanel jp = new JPanel();
		
		jp.setLayout(new BorderLayout());
		jp.setBorder(new EtchedBorder());
		
		logsTextArea.setLineWrap(true);
		logsTextArea.setWrapStyleWord(true);
		logsTextArea.setEditable(false);
		
		logsPanel.setLayout(new BorderLayout());
		logsPanel.add(logsScrollPane, BorderLayout.CENTER);
				
		mainTabbedPane.addTab("Logs", logsPanel);
		mainTabbedPane.addTab("Options", optionsPanel);
		
		jp.add(mainTabbedPane);
		
		return jp;
	}
	
	public void appendLog(String log) {
		logsTextArea.append(log);
	}
}
