package nLayeredDemo;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entiities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//burasý ToDo :Spring Ioc ile çözülecek

		ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());

		ProductService productService1 = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product=new Product(1, 1, "elma", 12, 50);
		Product product1=new Product(1, 2, "elma", 12, 50);
		productService.add(product);
		productService.add(product1);
	}

}
