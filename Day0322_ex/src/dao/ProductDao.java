package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import constant.Product;
import constant.Product;
import dao.ProductDao.ProductMapper;

public class ProductDao {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean insertProduct(HashMap<String, Object> params){
		int result = jdbcTemplate.update("insert into product values(0,?,?,?,?)", params.get(Product.NAME), params.get(Product.PRICE), params.get(Product.PICTUREURL), params.get(Product.DESCROPTION));
		if(result > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean updateProduct(HashMap<String, Object> params){
		int result = jdbcTemplate.update("update product set name=?, price=?, pictureurl=?, description=? where code=?", params.get(Product.NAME), params.get(Product.PRICE), params.get(Product.PICTUREURL), params.get(Product.DESCROPTION), params.get(Product.CODE));
		if(result > 0){
			return true;
		} else{
			return false;
		}
	}
	
	public boolean deleteProduct(int code){
		int result = jdbcTemplate.update("delete from product where code=?", code);
		if(result > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public List<HashMap<String, Object>> selectAll(){
		return jdbcTemplate.query("select * from product", mapper);
	}
	
	public HashMap<String, Object> selectByCode(int code){
		return jdbcTemplate.queryForObject("select * from product where code=?", mapper);
	}
	
	
	private RowMapper<HashMap<String, Object>> mapper = new ProductMapper();
	
	class ProductMapper implements RowMapper<HashMap<String, Object>>{
		//RowMapper를 상속받아서 구현하는 메소드에 한줄의 레코드에 대해ResultSet을 받앗을때 내가 모델객체에 연결시킬지를 정의
		
		@Override
		public HashMap<String, Object> mapRow(ResultSet arg0, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			HashMap<String, Object> result = new HashMap<String, Object>();
			result.put(Product.CODE, arg0.getInt(Product.CODE));
			result.put(Product.NAME, arg0.getString(Product.NAME));
			result.put(Product.PRICE, arg0.getInt(Product.PRICE));
			result.put(Product.PICTUREURL, arg0.getString(Product.PICTUREURL));
			result.put(Product.DESCROPTION, arg0.getString(Product.DESCROPTION));
			return result;
		}
		
	}
}
