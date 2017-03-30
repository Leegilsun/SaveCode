import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dao.IProductDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		IProductDao dao = context.getBean("productDao", IProductDao.class);
		
		for(HashMap<String, Object> p: dao.selectAll())
			System.out.println(p);
	}
}
