package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Aluno;

public class AlunoDao {
	
	private Connection conexao;
	
	public AlunoDao() {
		this.conexao = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionar(Aluno aluno) throws SQLException {
		
		try {
			String sql = "INSERT INTO tbAluno (nomeAluno, emailAluno, senhaAluno, sexoAluno) VALUES(?,?,?,?)";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getSenha());
			stmt.setString(4, String.valueOf(aluno.getSexo()));
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println("ERRO: " + e);
		}
		
		conexao.close();
	}

}
