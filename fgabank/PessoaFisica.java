package fgabank;

public class PessoaFisica extends PessoaHeranca{

	private String cpf;
	private String rg;
	private String profissao;
	
		
	public PessoaFisica() { //gcfs
		super();
	}

	public PessoaFisica(String cpf, String rg, String profissao) { //gcuf
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	
	public String getCpf() { //ggas
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	
	
	
}
