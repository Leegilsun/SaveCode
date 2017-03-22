package test;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import constant.Product;
import dao.ProductDao;

public class ProductDaoTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		ProductDao dao = context.getBean("productDao", ProductDao.class);
		HashMap<String, Object> params = new HashMap<>();
		//insert
//		params.put(Product.NAME, "버섯농장");
//		params.put(Product.PRICE, "1500");
//		params.put(Product.PICTUREURL, null);
//		params.put(Product.DESCROPTION, "ㅎㅎ안녕");
//		dao.insertProduct(params);
		
		//update
//		params.put(Product.CODE, 8);
//		params.put(Product.NAME, "꿀꽈배기");
//		params.put(Product.PRICE, 3000);
//		params.put(Product.PICTUREURL, null);
//		params.put(Product.DESCROPTION, "ㅎㅎ안녕");
//		dao.updateProduct(params);
		
		//select
		for(HashMap<String, Object> h : dao.selectAll())
			System.out.println(h);
		
		//delete
//		int code = 8;
//
//		dao.deleteProduct(code);
	}
}
