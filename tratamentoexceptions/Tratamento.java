package tratamentoexceptions;

import java.io.FileNotFoundException;

public class Tratamento {
	public static void metodo1() {
		System.out.println("Inicio do teste metodo 1");
		metodo2();
		System.out.println("Fim do teste metodo 1");
	}

	public static void metodo2() {
		System.out.println("Inicio do teste metodo 2");
		int array[] = new int[10];

		try {
			for (int i = 0; i < 20; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro pego no catch " + e);
		}finally {
			System.out.println("Uma execução que vai sempre aparecer na finalização");
		}
		
		System.out.println("Fim do teste metodo 2");
	}

	
	public static void metodo3() throws FileNotFoundException {
		new java.io.FileReader("arquivoDeTeste.txt");
	}
	
	
}
