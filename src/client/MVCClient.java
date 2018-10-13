package client;

public class MVCClient {
	public static void main(String[] args) {
		ClientModel clientModel = new ClientModel();
		ClientView clientView = new ClientView();
		
		@SuppressWarnings("unused")
		ClientController serverController = new ClientController(clientModel, clientView);
		
		clientView.setVisible(true);
	}
}
