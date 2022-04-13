package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaSets {

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7.5,8.9,10.0,5.5,3.1)); // add valores a uma collection
		
		notas.add(7.5);
		
		System.out.println(notas);
		
		for (Double doubleTemp : notas) {
			System.out.println(doubleTemp);
		}
		
		System.out.println("Maior nota: "+Collections.max(notas));
		System.out.println("Menor nota: "+Collections.min(notas));
		
		double soma = 0;
		for (Double doubleTemp : notas) {
			soma += doubleTemp;
		}
		
		System.out.println("Soma total das notas: "+soma);
		System.out.println("Media notas: "+ (soma/notas.size()));
	
	
		
	}
	
	
	
}
