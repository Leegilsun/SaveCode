package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Product;

public class ProductDao implements IProductDao{
	private SqlSessionFactory sqlSessionFactory;
	public ProductDao(){
		InputStream io = null;
		try{
			io = Resources.getResourceAsStream("configure.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(io);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(io != null){
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
	public int insertProduct(Product product) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IProductDao.class).insertProduct(product);
		} finally {
			session.close();
		}
	}
	
	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IProductDao.class).updateProduct(product);
		} finally {
			session.close();
		}
	}
	
	@Override
	public int deleteProduct(int code) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IProductDao.class).deleteProduct(code);
		} finally {
			session.close();
		}
	}
	
	@Override
	public Product selectOne(int code) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IProductDao.class).selectOne(code);
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.getMapper(IProductDao.class).selectAll();
		} finally {
			session.close();
		}
	}
	
	
}
