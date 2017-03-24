import dao.ProductDao;
import model.Product;

public class Test {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		for(Product p : dao.selectAll())
			System.out.println(p);
		
		Product product = new Product();
		
		product.setName("이길선");
		product.setPrice(90000);
		product.setPictureurl(null);
		product.setDescription("ddddffadasd");

		
	}
}
