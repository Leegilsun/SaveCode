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
	public List<HashMap<String, Object>> selectBySearch(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).selectBySearch(params);
		} finally {
			session.close();
		}
	}
	@Override
	public List<HashMap<String, Object>> selectPage(int num) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).selectPage(num);
		} finally {
			session.close();
		}
	}
	@Override
	public List<HashMap<String, Object>> selectPageCnt() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IBoardDao.class).selectPageCnt();
		} finally {
			session.close();
		}
	}
	
	
}
