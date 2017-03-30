package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardDao implements IBoardDao{
	SqlSessionFactory sqlSessionFactory;
	public BoardDao(){
		InputStream io = null;
		try{
			io=Resources.getResourceAsStream("configure.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(io);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(io!=null){
				try{
					io.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	@Override
	public int insertBoard(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).insertBoard(params);
		} finally {
			session.close();
		}
	}
	
	@Override
	public int updateBoard(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).updateBoard(params);
		} finally {
			session.close();
		}
	}
	
	@Override
	public int deleteBoard(int num) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).deleteBoard(num);
		} finally {
			session.close();
		}
	}
	
	@Override
	public HashMap<String, Object> selectOne(int num) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).selectOne(num);
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<HashMap<String, Object>> selectAll() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).selectAll();
		} finally {
			session.close();
		}
	}

	@Override
	public List<HashMap<String, Object>> selectBoardLimit(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).selectBoardLimit(params);
		} finally {
			session.close();
		}
	}
	@Override
	public int getBoardCount() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).getBoardCount();
		} finally {
			session.close();
		}
	}
	@Override
	public int updateRe(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).updateRe(params);
		} finally {
			session.close();
		}
	}
	@Override
	public int updatePlus(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).updatePlus(params);
		} finally {
			session.close();
		}
	}
}
