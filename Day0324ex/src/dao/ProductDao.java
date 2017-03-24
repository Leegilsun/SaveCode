package dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Product;


public class ProductDao {
	private SqlSessionFactory sqlSessionFactory;
	public ProductDao(){
		try {
			Reader reader = Resources.getResourceAsReader("configure.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean insertProduct(Product product){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			int result = session.insert("product.insert", product);
			if(result > 0){
				session.commit();
				return true;
			} else {
				session.rollback();
				return false;
			}
		} finally {
			session.close();
		}
	}
	
	public boolean updateProduct(Product product){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			int result = session.update("product.update", product);
			if(result > 0){
				session.commit();
				return true;
			} else{
				session.rollback();
				return false;
			}
		} finally {
			session.close();
		}
	}
	
	public boolean deleteProduct(int code){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			int result = session.delete("product.delete", code);
			if(result > 0){
				session.commit();
				return true;
			} else {
				session.rollback();
				return false;
			}
		} finally {
			session.close();
		}
	}
	
	public Product selectOne(int code){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.selectOne("product.selectOne", code);
		} finally {
			session.close();
		}
	}
	
	public List<Product> selectAll(){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			return session.selectList("product.selectAll");
		} finally {
			session.close();
		}
	}
}
