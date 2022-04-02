package fgabank;

public class Diretor extends Funcionario{

	@Override
	public double getBonus() {
		return this.getSalario() * 0.15;
	}
	
}
