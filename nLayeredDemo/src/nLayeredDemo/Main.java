package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concrete.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concrete.Product;

public class Main {

    public static void main(String[] args) {

        //ArrayList<Integer> numbers = new ArrayList<Integer>();
        //generic yapılar

        //TODO: spring IoC ile çözülecek
        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

        Product product = new Product(1,1,"Elma",12,50);
        productService.add(product);
    }
}
