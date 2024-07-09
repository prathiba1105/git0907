package org.client;

public class ClientDetails {
	public void clName() {
		System.out.println("Client Name : Sundar");
	}
	public void clLocation() {
		System.out.println("Client Location : Bagmane");
	}
 public static void main(String[] args) {
	 ClientDetails c = new ClientDetails();
	 c.clName();
	 c.clLocation();
}

}
