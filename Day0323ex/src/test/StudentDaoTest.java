package test;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import constant.Student;
import dao.StudentDao;

public class StudentDaoTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put(Student.S_ID, 15);
		params.put(Student.NAME, "이길선");
		params.put(Student.AGE, 26);
		params.put(Student.SCORE, 0);
//		dao.insertStudent(params);
//		dao.deleteStudent(params);
//		dao.updateStudent(params);
		for(HashMap<String, Object> h : dao.selectAll())
			System.out.println(h);
	}
}
