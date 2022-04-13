package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMaps {
	
	public static void main(String[] args) {
		
		Map<String, Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();
		
		//put => adicionar valores ao map
		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Japão", 58);
		quadroMedalhasOlimpicas2020.put("Grã-Bretanha", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);
				
		//buscar informação atraves de uma chave e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("Alemanha"));
		
		//buscar informação atraves de uma valor e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(58));
		
		//Informa o tamanho do map
		System.out.println(quadroMedalhasOlimpicas2020.size());
				
		//Consultar o valor armazenado na chave
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));
		
		//Remover valores da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		for (Map.Entry<String, Integer> entry : quadroMedalhasOlimpicas2020.entrySet()) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println("==========================");
		
		for (String key : quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key +" => "+ quadroMedalhasOlimpicas2020.get(key));
		}
		
		System.out.println("==========================");
		System.out.println("Implementação de TreeMap");
	
		TreeMap<String, Integer>quadroMedalhasOlimpicas2016 = new TreeMap<>();
		
		quadroMedalhasOlimpicas2016.put("EUA", 103);
		quadroMedalhasOlimpicas2016.put("China", 90);
		quadroMedalhasOlimpicas2016.put("Japão", 50);
		quadroMedalhasOlimpicas2016.put("Grã-Bretanha", 70);
		quadroMedalhasOlimpicas2016.put("Brasil", 17);
		
		System.out.println(quadroMedalhasOlimpicas2016.firstKey()); //pega a primeira chave
		System.out.println(quadroMedalhasOlimpicas2016.lastKey()); //pega a ultima chave
		
		System.out.println(quadroMedalhasOlimpicas2016.lowerKey("China")); //mostra a chave anterior 
		System.out.println(quadroMedalhasOlimpicas2016.higherKey("China")); //mostra a chave posterior 
		
		System.out.println(quadroMedalhasOlimpicas2016.pollFirstEntry()); //exibe o valor e apaga posteriormente
		System.out.println(quadroMedalhasOlimpicas2016.pollLastEntry()); //exibe o valor e apaga posteriormente
		
	}

}
