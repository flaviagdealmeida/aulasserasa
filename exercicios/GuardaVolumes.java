package exercicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
	
	private Map<Integer, List<Peca>> mapVolumes = new HashMap<>();
	private static int contador = 0;
	
	public GuardaVolumes() {
		GuardaVolumes.contador += 1;
	}
	
	public Integer guardarPecas(List<Peca> listaDePeca) {
		mapVolumes.put(contador,listaDePeca );
		return contador;
		
	}
	
	public void mostrarPecas() {
		for (Map.Entry<Integer, List<Peca>> entry: mapVolumes.entrySet()) {
			System.out.println("Chave "+ entry.getKey()+ " - "+ "Volumes " + entry.getValue());
		}
	}
	
	 public void mostrarPecas(Integer numero) {
		System.out.println(mapVolumes.containsKey(numero));
	}
	 
	 public void devolverPecas(Integer numero) {
		 mapVolumes.remove(numero);
	 }
}
