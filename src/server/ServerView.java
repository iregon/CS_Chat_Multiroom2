package server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class ServerView extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JTabbedPane mainTabbedPane;
	
	private JPanel logsPanel;
	private JScrollPane logsScrollPane;
	private JTextPane logsTextPane;
	
	private JPanel optionsPanel;
	
	public ServerView() {
		super("Server");
		
		mainTabbedPane = new JTabbedPane();
		
		logsPanel = new JPanel();
		logsTextPane = new JTextPane();
		logsScrollPane = new JScrollPane(logsTextPane);
		
		optionsPanel = new JPanel();
		
		createGUI();
	}

	private void createGUI() {
		
		Container co = this.getContentPane();
		co.add(generateMainJPanel());

		this.setSize(460,500);
		this.setMinimumSize(new Dimension(460, 500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private JPanel generateMainJPanel() {
		JPanel jp = new JPanel();
		
		jp.setLayout(new BorderLayout());
		jp.setBorder(new EtchedBorder());
	
		logsTextPane.setEditable(false);
		
		logsPanel.setLayout(new BorderLayout());
		logsPanel.add(logsScrollPane, BorderLayout.CENTER);
						
		mainTabbedPane.addTab("Logs", logsPanel);
		mainTabbedPane.addTab("Options", optionsPanel);
		
		jp.add(mainTabbedPane);
		
		return jp;
	}
	
	public void appendLog(String log) {
		appendToPane(log, Color.BLACK);
	}
	
	public void appendLog(String log, Color color) {
		appendToPane(log, color);
	}
	
	private void appendToPane(String msg, Color color) {
		StyledDocument doc = logsTextPane.getStyledDocument();
		try {
			StyleContext sc = StyleContext.getDefaultStyleContext();
			AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);
			doc.insertString(doc.getLength(), msg, aset);
		} catch (BadLocationException ble) {
			//TODO: Gestire errore nell'inserimento di una stringa nel JtextPanel
		    System.err.println("Couldn't insert initial text into text pane.");
		}
	}
}
