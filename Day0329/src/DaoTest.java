import java.util.HashMap;

import dao.BoardDao;
import dao.IBoardDao;

public class DaoTest {
	public static void main(String[] args) {
		IBoardDao dao = new BoardDao();
		HashMap<String, Object> params = new HashMap<>();
		params.put("skip", 0);
		params.put("count", 10);
		for(HashMap<String, Object> rs : dao.selectBoardLimit(params))
			System.out.println(rs);
		
		System.out.println("총게시물"+dao.getBoardCount());
	}
}
