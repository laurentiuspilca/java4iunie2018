package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.ProductService;

@Controller
public class ProductWS {

	@Autowired
	private ProductService productService;
}
