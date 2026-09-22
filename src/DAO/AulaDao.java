package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Aula;

public class AulaDao {
	
	private Connection conexao;
	
	public AulaDao() {
		this.conexao = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionar(Aula aula) throws SQLException {
		
		try {
			String sql = ""
					+ "INSERT INTO tbAula"
					+ "(codFuncionario, nomeAula, diaSemanaAula)"
					+ "VALUES(?,?,?,?)";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, aula.getCodFuncionario());
			stmt.setString(2, aula.getNome());
			stmt.setString(3, aula.getDiaSemana());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println("ERRO: " + e);
		}
		
		conexao.close();
	}

}
