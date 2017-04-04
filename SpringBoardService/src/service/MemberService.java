package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import dao.IBoardDao;
import dao.IMemberDao;
import model.Board;
import model.Member;

@Service
public class MemberService {
	@Autowired
	private IBoardDao bDao;
	@Autowired
	private IMemberDao mDao;
	@Autowired
	private DataSourceTransactionManager txManager;
	
	public void join(String id, String pw, String name, String intro){
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		
		Board board = new Board();
		board.setContent(intro);
		board.setTitle(name+"가입인사");
		board.setName(name);
		board.setPass(pw);
		board.setEmail("");

			mDao.insertMember(member);
			bDao.insertBoard(board);
	}
}
