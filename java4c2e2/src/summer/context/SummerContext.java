package summer.context;

import java.util.ArrayList;
import java.util.List;

public class SummerContext {

	private List<Object> context = new ArrayList<>();
	
	private SummerContext() {}
	
	private static final class SingletonHolder {
		private static SummerContext INSTANCE = new SummerContext();
	}
	
	public static SummerContext getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public void addToContext(Object o) {
		context.add(o);
	}
	
	public Object getBean(Class c) {
		for (Object o : context) {
			if (o.getClass() == c) {
				return o;
			}
		}
		
		throw new RuntimeException("Bean does not exist in context!");
	}
	
	public List<Object> getContext() {
		return this.context;
	}
}
