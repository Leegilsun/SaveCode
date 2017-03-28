import dao.IProductDao;
import dao.ProductDao;
import model.Product;

public class Test {
	public static void main(String[] args) {
		IProductDao dao = new ProductDao();
		for(Product p:dao.selectAll())
			System.out.println(p);
		
//		Product product = new Product();
//		product.setName("상품명");
//		product.setPrice(1000);
//		product.setPicture("경로");
//		product.setDescription("설명");
//		dao.insertProduct(product);
		
	}
}	
