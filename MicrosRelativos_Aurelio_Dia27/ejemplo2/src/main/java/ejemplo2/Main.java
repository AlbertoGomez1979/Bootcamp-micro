package ejemplo2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Product> shopping = List.of(
				new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		//CALCULAR COSTE TOTAL DE LA COMPRA CON IMPUESTOS.
		//LISTA TODOS LOS PRODUCTOS QUE EMPIECEN CON C DE MANERA ORDENADA EN LISTA SEPARADAS CON  COMAS.
		
		BigDecimal count = shopping.stream()
				.map(x -> x.price.add(x.price.multiply(new BigDecimal(x.tax.percent))
        		.divide(new BigDecimal(100))))
				.reduce(BigDecimal.ZERO, (x, y) -> x.add(y))
				.setScale(2, RoundingMode.CEILING);
		System.out.println(count);
		
		String pro = shopping.stream()
				.filter(p -> p.name.startsWith("C"))
				.sorted((x,y) -> x.name.compareToIgnoreCase(y.name))
				.map(x-> x.name)
				.collect(Collectors.joining(","));
		System.out.println(pro);
		
		

	}
 
}
