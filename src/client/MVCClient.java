package client;

public class MVCClient {
	
	public MVCClient() {
		ClientModel clientModel = new ClientModel();
		ClientView clientView = new ClientView();
		
		@SuppressWarnings("unused")
		ClientController serverController = new ClientController(clientModel, clientView);
		
		clientView.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MVCClient();
	}
}
