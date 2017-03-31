package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.Product;
@Component
public class ProductDao implements IProductDao{
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;
	@Autowired
	private SqlSession session;
	
	@Override
	public int insertProduct(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		return session.getMapper(IProductDao.class).insertProduct(params);
	}

	@Override
	public int updateProduct(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		return session.getMapper(IProductDao.class).updateProduct(params);
	}

	@Override
	public int deleteProduct(int code) {
		// TODO Auto-generated method stub
		return session.getMapper(IProductDao.class).deleteProduct(code);
	}

	@Override
	public Product selectOne(int code) {
		// TODO Auto-generated method stub
		return session.getMapper(IProductDao.class).selectOne(code);
	}

	@Override
	public List<HashMap<String, Object>> selectAll() {
		// TODO Auto-generated method stub
		return session.getMapper(IProductDao.class).selectAll();
	}

}
