package ejemplo;

import java.util.List;
import java.util.stream.Stream;

public class numeros {

	//OPERACION CON LAMBDA, FUNCIONAL
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,3,6,9,10);
		
//FILTRADO DE LOS NUMEROS, FILTRA LOS MAYORES DE 10 Y LOS SUMA
		long count = numbers.stream().filter(num -> num>10).count();
		
		System.out.print(count);
	}

}

  