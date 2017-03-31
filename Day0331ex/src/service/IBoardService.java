package service;

import java.util.HashMap;
import java.util.List;

public interface IBoardService {
	public boolean writeBoard(String pass, String title, String content, String name, String email, int pnum);
	public boolean modifyBoard(int num, String title, String content);
	public boolean deleteBoard(int num);
	public HashMap<String, Object> readBoard(int num);
	public HashMap<String, Object> getBoardList(int page);
	public List<HashMap<String, Object>> selectBoardLimit(int page, int getBoardCount);
	public int getBoardCount();
}
