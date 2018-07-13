package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.ProductService;

@Aspect
@Component
public class ProductServiceAspect {
	
	@Autowired
	private ProductService productService;
	
//	@Before("execution(* beans.ProductService.addProduct(..))")
//	public void beforeAddProduct() {
//		System.out.println("Before adding product");
//	}
//
//	@After("execution(* beans.ProductService.addProduct(..))")
//	public void afterAddProduct() {
//		System.out.println("After adding product");
//	}
	
	@Around("execution(* beans.ProductService.addProduct(..))")
	public void around(ProceedingJoinPoint p) {
		productService.getProduct();
	}
}
