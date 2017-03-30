package dao;

import java.util.HashMap;
import java.util.List;

import model.Product;

public interface IProductDao {
	public int insertProduct(HashMap<String, Object> params);
	public int updateProduct(HashMap<String, Object> params);
	public int deleteProduct(int code);
	public Product selectOne(int code);
	public List<HashMap<String, Object>> selectAll();
}
