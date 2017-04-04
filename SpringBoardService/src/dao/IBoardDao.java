package dao;

import java.util.List;

import model.Board;

public interface IBoardDao {
	public int insertBoard(Board board);
	public int updateBoard(Board board);
	public int deleteBoard(Board board);
	public Board selectOne(int num);
	public List<Board> selectAll();
}
