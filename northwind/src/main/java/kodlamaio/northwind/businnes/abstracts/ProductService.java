package kodlamaio.northwind.businnes.abstracts;

import java.util.List;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	List<Product> getAll();
}
