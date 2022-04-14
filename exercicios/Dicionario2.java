package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dicionario2 {

	public static void main(String[] args) {

		Map<String, List<String>> dicionarioApelidos = new HashMap<>();
		List<String> apelidosJoao = new ArrayList<>();
		apelidosJoao.add("Juan");
		apelidosJoao.add("Fissura");
		apelidosJoao.add("Maromba");

		List<String> apelidosLucas = Arrays.asList("Lukinha", "Jorge", "George");
		List<String> apelidosMaria = Arrays.asList("Wonder Woman", " Mary", "Marilene");
		List<String> apelidosMiguel = Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha");

		dicionarioApelidos.put("Joao", apelidosJoao);
		dicionarioApelidos.put("Miguel", apelidosMiguel);
		dicionarioApelidos.put("Maria", apelidosMaria);
		dicionarioApelidos.put("Lucas", apelidosLucas);
		
		
		for (Map.Entry<String, List<String>> entry: dicionarioApelidos.entrySet()) {
			System.out.println("Chave "+ entry.getKey()+ " - "+ "Apelidos " + entry.getValue());
		}
		
	
		

	}

}
