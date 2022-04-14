package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DicionarioExercicio2 {

	
	public static void main(String[] args) {
		
		List<Integer> lista1 = Arrays.asList(1,5,5,6,7,8,8,8);
		
		Set<Integer> lista2 = new HashSet<>();
		
		lista2.add(1);
		lista2.add(5);
		lista2.add(5);
		lista2.add(6);
		lista2.add(7);
		lista2.add(8);
		lista2.add(8);
		lista2.add(8);
		
		lista1.forEach(System.out::println);
		lista2.forEach(System.out::println);
	
		int cont = 0;
		
		for (Integer valor : lista1) {
			System.out.println(cont + "->" + valor);
			cont++;
		}
		System.out.println(" ========================= ");
		cont = 0;
		for (Integer valor : lista2) {
			System.out.println(cont + "->" + valor);
			cont++;
		}
		
		
		
	}
	
}
