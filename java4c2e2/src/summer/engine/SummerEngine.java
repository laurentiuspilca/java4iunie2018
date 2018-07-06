package summer.engine;

import java.lang.reflect.Field;

import beans.repository.ProductRepository;
import beans.service.ProductService;
import summer.annotations.SummerComponent;
import summer.annotations.SummerInject;
import summer.context.SummerContext;

public class SummerEngine {

	public static void main(String [] args) {
		
		try {
			Class<?> repositoryClass = 
					Class.forName("beans.repository.ProductRepository");
			
			Class<?> serviceClass = 
					Class.forName("beans.service.ProductService");
			
			if (repositoryClass.isAnnotationPresent(SummerComponent.class)) {
				System.out.println("Found component beans.repository.ProductRepository");
				fillContext(repositoryClass);
			}
			
			if (serviceClass.isAnnotationPresent(SummerComponent.class)) {
				System.out.println("Found component beans.service.ProductService");
				fillContext(serviceClass);
			}
			
			injectFieldsForClassesInContext();
			
			ProductService s = (ProductService)
					SummerContext.getInstance().getBean(ProductService.class);
			s.addTenProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void fillContext(Class c) throws Exception {
		Object o = c.newInstance();
		System.out.println("Adding in context component of type " + c);
		SummerContext.getInstance().addToContext(o);
	}
	
	private static void injectFieldsForClassesInContext() throws Exception {
		for (Object o : SummerContext.getInstance().getContext()) {
			System.out.println("Injecting values for object " + o);
			injectFieldsForInstance(o);
		}
	}
	
	private static void injectFieldsForInstance(Object o) throws Exception {
		Class c = o.getClass();
		Field [] fields = c.getDeclaredFields();
		
		for (Field f : fields) {
			if (f.isAnnotationPresent(SummerInject.class)) {
				System.out.println("Found annotated field " + f);
				Object i = SummerContext.getInstance().getBean(f.getType());
				System.out.println("Injecting field " + f + " with value " + i);
				f.setAccessible(true);
				f.set(o, i);
			}
		}
		
	}
}
