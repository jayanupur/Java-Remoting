package org.manh.com;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.manh.com.business.ProductServiceImpl;

@WebService(name="TestMart", portName="TestMartCatlogPort", serviceName="TestMartCatlogService",targetNamespace="http://www.testmart.com")
public class ProductCatlog {
	
	
	ProductServiceImpl productService=new ProductServiceImpl();
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String>  getProductCategories(){
		return  productService.getProductCategories();
	}
	@WebMethod(exclude=true)
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	@WebMethod(exclude=true)
	public boolean addProduct(String category, String Product ) {
		return productService.addProduct(category, Product);
	}
	

}
