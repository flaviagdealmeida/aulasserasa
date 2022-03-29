package fgabank;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String profissao;	
	private String rg;
	private String email;
	private String telefone;
	
	public Pessoa() {
		//metodo construtor default = preenchimento dos atributos é opcional
	}
	
	public Pessoa(String nome,String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
			
	public Pessoa(String nome, String cpf, String profissao, String rg, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() { //exibe os objetos
		return nome;
	}
	public void setNome(String nome) { //grava os objetos nos atributos
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

	
	
	
	
}
