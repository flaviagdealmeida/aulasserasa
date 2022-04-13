package collections;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class TesteOptional {
	
	public static void main(String[] args) {
		
		Optional<String> listaString = Optional.of("Valor optional presente"); //recebe valor do tipo que estamos trabalhando
		listaString.ifPresentOrElse(System.out::println, () -> System.out.println("N�o est� presente")); // express�o lambda
		
		Optional<String> listaNula = Optional.ofNullable(null); //espera um possivel valor nulo
		listaNula.ifPresentOrElse(System.out::println, () -> System.out.println("Nulo o valor n�o est� presente"));
		
		Optional<String> listaVazia = Optional.empty(); // verifica se a lista est� vazia
		listaVazia.ifPresentOrElse(System.out::println, () -> System.out.println("Vazio o valor n�o est� presente"));
		
//		Optional<String> listaComErro = Optional.of(null); // erro pois n�o aceita o tipo null
//		listaComErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro o valor n�o est� presente"));
		
		System.out.println("Valores Inteiros");
		OptionalInt.of(22).ifPresent(System.out::println);
		
		System.out.println("Valores decimais");
		OptionalDouble.of(22.55).ifPresent(System.out::println);
		
		System.out.println("Valores Inteiros Longos");
		OptionalLong.of(23L).ifPresent(System.out::println);
		
	}

}
