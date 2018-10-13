package main;

public class MVCMainPage {
	public static void main(String[] args) {
		MainPageModel clientModel = new MainPageModel();
		MainPageView clientView = new MainPageView();
		
		@SuppressWarnings("unused")
		MainPageController serverController = new MainPageController(clientModel, clientView);
		
		clientView.setVisible(true);
	}
}
