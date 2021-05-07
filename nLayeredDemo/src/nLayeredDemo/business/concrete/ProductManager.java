package nLayeredDemo.business.concrete;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concrete.Product;
import nLayeredDemo.jLogger.jLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao ,LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService = loggerService;
    }



    @Override
    public void add(Product product) {
        //iş kodları
        if(product.getCategoryId() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        else{
            //çalışır ama alternatif sistemi dahil edemem
            //bağımlı yapıdır. Manager a sıkı sıkı bağlı
            //unit test de yazamazsınız
            //sahte sistemlere çeviremezsin
            //dependence injection gevşek bağlı
            //sadece referans tutucu olarak
            /*HibernateProductDao dao = new HibernateProductDao();
            dao.add(product);*/
            this.productDao.add(product);
            this.loggerService.logToSystem("Ürün eklendi ");
            //hibernate e bağımlılık yok;
        }
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
