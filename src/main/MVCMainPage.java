package main;

public class MVCMainPage {
	public static void main(String[] args) {
		MainPageModel mainPageModel = new MainPageModel();
		MainPageView mainPageView = new MainPageView();
		
		@SuppressWarnings("unused")
		MainPageController serverController = new MainPageController(mainPageModel, mainPageView);
		
		mainPageView.setVisible(true);
	}
}
