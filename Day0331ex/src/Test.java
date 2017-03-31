import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dao.IBoardDao;
import service.IBoardService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		IBoardService service = context.getBean("boardService", IBoardService.class);
		
//		for(HashMap<String, Object> h : service.selectBoardLimit(0, 10))
//			System.out.println(h);
		
		for(HashMap<String, Object> h : (List<HashMap<String, Object>>) service.getBoardList(5).get("boardList"))
			System.out.println(h);
		
		
		
	}
}
