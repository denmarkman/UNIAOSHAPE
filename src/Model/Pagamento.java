package Model;

public class Pagamento {
	
	private int codGerente, codFuncionario;
	private String data;
	private double porcentagemAumento;
	
	public int getCodGerente() {
		return codGerente;
	}
	public void setCodGerente(int codGerente) {
		this.codGerente = codGerente;
	}
	public int getCodFuncionario() {
		return codFuncionario;
	}
	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getPorcentagemAumento() {
		return porcentagemAumento;
	}
	public void setPorcentagemAumento(double porcentagemAumento) {
		this.porcentagemAumento = porcentagemAumento;
	}

}
