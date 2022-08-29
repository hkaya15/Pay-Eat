package PayAndEat.dataAccess.concretes;

import java.util.List;

import PayAndEat.dataAccess.abstracts.ProductDao;
import PayAndEat.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("It's Added!");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("It's Updated!");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("It's Deleted!");
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
