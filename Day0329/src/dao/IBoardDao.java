package dao;

import java.util.HashMap;
import java.util.List;


public interface IBoardDao {
	public int insertBoard(HashMap<String, Object> params);
	public int updateBoard(HashMap<String, Object> params);
	public int deleteBoard(int num);
	public HashMap<String, Object> selectOne(int num);
	public List<HashMap<String, Object>> selectAll();
	public List<HashMap<String, Object>> selectBoardLimit(HashMap<String, Object> params);
	public int getBoardCount();
	public int updateRe(HashMap<String, Object> params);
	public int updatePlus(HashMap<String, Object> params);
}
