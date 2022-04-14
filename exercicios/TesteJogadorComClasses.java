package exercicios;

public class TesteJogadorComClasses {

	public static void main(String[] args) {
		
		Jogador2 jogador2 = new Jogador2();
		
		Arma2 pistola = new Arma2();
		pistola.atirar(15);
		pistola.recarregar(120);
		
		System.out.println(pistola.toString());
		
		Arma2 besta = new Arma2();
		besta.atirar(1);
		besta.recarregar(30);
		
		System.out.println(besta.toString());
			
		
		//Exemplo ternário
		int idade = 18;
		String resultado = idade >= 18 ? "Maior idade":"Menor idade";
		System.out.println(resultado);
		

		
	}
	
}
