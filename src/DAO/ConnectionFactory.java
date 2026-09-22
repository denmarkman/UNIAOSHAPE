package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bdUniaoShape","root","");
		}
		catch(SQLException e) {
			System.err.println("ERRO: NÃO FOI POSSÍVEL ESTABELECER A CONEXÃO COM O BANCO DE DADOS\n");
//			throw new RuntimeException();
		}
		return null;
	}

}
