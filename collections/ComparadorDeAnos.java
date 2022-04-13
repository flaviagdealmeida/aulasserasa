package collections;

import java.util.Comparator;

public class ComparadorDeAnos implements Comparator <Carro> {

	@Override
	public int compare(Carro c1, Carro c2) {
			return Integer.compare(c1.getAno(), c2.getAno());
	}

}
