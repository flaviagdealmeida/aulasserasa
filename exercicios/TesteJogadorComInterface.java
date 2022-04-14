package exercicios;

public class TesteJogadorComInterface {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador();
		
		Pistola pistola = new Pistola();
		pistola.atirar(15);
		pistola.recarregar(60);
		
		ArcoEFlexa arco = new ArcoEFlexa();
		arco.atirar(3);
		arco.recarregar(120);
		
		
		
	}
	
}
