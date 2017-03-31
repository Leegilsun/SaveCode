import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dao.IStudentDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		IStudentDao dao = context.getBean("studentDao", IStudentDao.class);
		
		for(HashMap<String, Object> s: dao.selectAll())
			System.out.println(s);
	}
}
