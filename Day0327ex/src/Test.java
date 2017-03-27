import dao.IProductDao;
import dao.ProductDao;
import model.Product;

public class Test {
	public static void main(String[] args) {
		IProductDao dao = new ProductDao();
		for(Product p:dao.selectAll())
			System.out.println(p);
		
	}
}
