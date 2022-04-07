package debugs;

public class Calculadora {

	// declaradas aqui => global

	public void soma(double valor1, double valor2) {
		// var resultado = valor1 + valor2; // para ser declarado de forma local
		double resultado = valor1 + valor2;
		System.out.println("Total: " + resultado);
		
	}

	public double subtracao(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public static void multiplicacao(double valor1, double valor2) {
		System.out.println("Resultado: " + valor1 * valor2);
	}

}
