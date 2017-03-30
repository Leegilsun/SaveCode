import java.util.HashMap;
import java.util.List;

import service.BoardService;
import service.IBoardService;

public class ServiceTest {
	public static void main(String[] args) {
		IBoardService service = new BoardService();
		
//		service.writeBoard("1234", "자식2", "자식2", "자식2", "자식2", 205);

		for(HashMap<String, Object> rs : service.selectBoardLimit(0, 10) ){
			System.out.println(rs);
		}
	}
}