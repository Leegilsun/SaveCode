import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import dao.IMemberDao;
import service.MemberService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		MemberService service = context.getBean("memberService", MemberService.class);
		
		try{
		service.join("pjjwjwth3", "1234", "이길선", "하이염 방가방가");
		} catch (DataAccessException e) {
			// TODO: handle exception
			
		}
		System.out.println("출력 ok?");
	}
}
