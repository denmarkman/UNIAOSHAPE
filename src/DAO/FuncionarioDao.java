package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Funcionario;

public class FuncionarioDao {
	
	private Connection conexao;
	
	public FuncionarioDao() {
		this.conexao = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionar(Funcionario funcionario) throws SQLException {
		
		try {
			String sql = ""
					+ "INSERT INTO tbFuncionario"
					+ "(nomeFuncionario, emailFuncionario, cpfFuncionario, senhaFuncionario, cargoFuncionario, sexoFuncionario, salarioFuncionario)"
					+ "VALUES(?,?,?,?)";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getCpf());
			stmt.setString(4, funcionario.getSenha());
			stmt.setString(5, funcionario.getCargo());
			stmt.setString(6, String.valueOf(funcionario.getSexo()));
			stmt.setDouble(7, 2800.00);
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println("ERRO: " + e);
		}
		
		conexao.close();
	}

}
