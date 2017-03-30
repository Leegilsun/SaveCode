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
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public int insertProduct(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
//			return session.insert("product.insertProduct", product);
			return session.getMapper(IProductDao.class).insertProduct(params);
		} finally {
			session.close();
		}
	}

	@Override
	public int updateProduct(HashMap<String, Object> params) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
//			return session.update("product.updateProduct", product);
			return session.getMapper(IProductDao.class).updateProduct(params);
		}finally {
			session.close();
		}
	}

	@Override
	public int deleteProduct(int code) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
//			return session.delete("product.deleteProduct", code);
			return session.getMapper(IProductDao.class).deleteProduct(code);
		}finally {
			session.close();
		}
	}

	@Override
	public Product selectOne(int code) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
//			return session.selectOne("product.selectOne", code);
			return session.getMapper(IProductDao.class).selectOne(code);
		}finally {
			session.close();
		}
	}

	@Override
	public List<HashMap<String, Object>> selectAll() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
//			return session.selectList("product.selectAll");
			return session.getMapper(IProductDao.class).selectAll();
		}finally {
			session.close();
		}
	}

}
