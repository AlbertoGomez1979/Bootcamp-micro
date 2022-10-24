package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${product.product-name}")
	private String myProducto;
	
	@GetMapping(path = "/getProductName")
	public String myProducto() {
		return this.myProducto;
	}

}
