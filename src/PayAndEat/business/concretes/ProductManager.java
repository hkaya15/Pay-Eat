package PayAndEat.business.concretes;

import PayAndEat.business.abstracts.ProductService;
import PayAndEat.dataAccess.abstracts.ProductDao;
import PayAndEat.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.add(product);
		
	}

}
