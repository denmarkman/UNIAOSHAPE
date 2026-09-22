package main;

import DAO.ConnectionFactory;

public class Aplicacao {

	public static void main(String[] args) {
		ConnectionFactory a = new ConnectionFactory();
		a.getConnection();
		
		new Menu();
	}
	
}
