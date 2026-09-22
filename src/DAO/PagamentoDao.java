package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Pagamento;

public class PagamentoDao {
	
	private Connection conexao;
	
	public PagamentoDao() {
		this.conexao = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionar(Pagamento pagamento) throws SQLException {
		
		try {
			String sql = ""
					+ "INSERT INTO tbPagamento"
					+ "(codGerente, codFuncionario, dataPagamento, porcentagemAumento)"
					+ "VALUES(?,?,?,?)";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, pagamento.getCodGerente());
			stmt.setInt(2, pagamento.getCodFuncionario());
			stmt.setString(3, pagamento.getData());
			stmt.setDouble(4, pagamento.getPorcentagemAumento());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println("ERRO: " + e);
		}
		
		conexao.close();
	}

}
