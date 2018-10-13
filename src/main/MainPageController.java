package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import client.MVCClient;
import server.MVCServer;

public class MainPageController {
	
	private MainPageModel mainPageModel;
	private MainPageView mainPageView;

	public MainPageController(MainPageModel mainPageModel, MainPageView mainPageView) {
		this.mainPageModel = mainPageModel;
		this.mainPageView = mainPageView;
		
		setListeners();
	}
	
	private void setListeners() {
		this.mainPageView.setStartClientButtonListener(new startClientButtonListener());
		this.mainPageView.setStartServerButtonListener(new startServerButtonListener());
	}
	
	class startClientButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			mainPageView.dispose();
			new MVCClient();
		}
	}
	
	class startServerButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			mainPageView.dispose();
//			new MVCServer();
//			SwingUtilities.invokeLater(new Runnable() {
//		        public void run() {
//		            new JFrame("frame1").setVisible(true);
//		            new JFrame("frame2").setVisible(true);
//		        }
//			});
			
			MVCServer frame = new MVCServer();
			//set default close operation
			MainPageController.this.mainPageView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	}
}
