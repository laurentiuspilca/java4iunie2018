package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ProductServiceAspect {

	@After("execution(* beans.ProductService.addProduct(..))")
	public void afterAddingProduct() {
		System.out.println("After adding product");
	}
	
	@AfterThrowing("execution(* beans.ProductService.addProduct(..))")
	public void afterThrowingProduct() {
		System.out.println("After throwing exception on adding product ");
	}
	
	@AfterReturning("execution(* beans.ProductService.addProduct(..))")
	public void afterReturningProduct() {
		System.out.println("After returning successfully on adding product");
	}
	
	@Around("execution(* beans.ProductService.addProduct(..))")
	public void around(ProceedingJoinPoint p) {
		try {
			System.out.println("Before method");
			p.proceed();
			System.out.println("After method");
		} catch (Throwable e) {
			System.out.println("Exceptie " + e);
		}
	}
}
