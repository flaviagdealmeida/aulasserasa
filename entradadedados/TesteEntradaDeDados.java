package entradadedados;

import java.util.Scanner;

public class TesteEntradaDeDados {

	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in); //instancia = copia
		
		System.out.println("Informe sua idade: ");
		int idade = entradaDeDados.nextInt();
		System.out.println("Idade informada: "+idade);
		
		System.out.println("Informe um nome completo");
		String nome = entradaDeDados.nextLine();
		System.out.println("Nome informado é: "+nome);
		
		System.out.println("Informe o sexo");
		String sexo = entradaDeDados.nextLine();
		System.out.println("Sexo informado: "+sexo);
		
		
	}
	
	
	
	
	

}
