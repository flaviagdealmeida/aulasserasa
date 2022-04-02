package fgabank;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno {

	// mockado
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataDeAdmissao) {
		super(nome, cpf, ctps, salario, dataDeAdmissao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getSalario() * 0.1;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		}
		return false;
	}


}
