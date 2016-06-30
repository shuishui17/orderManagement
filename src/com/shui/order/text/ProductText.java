package com.shui.order.text;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

import com.shui.order.doMain.Category;
import com.shui.order.doMain.Product;
import com.shui.order.doMain.Provider;
import com.shui.order.service.ProductService;

public class ProductText {
	@Test
	public void addText(){
		ProductService productService = new ProductService();
		Product p = new Product();
		p.setCategoryId(3);
		p.setIncomePrice(123d);
		p.setProductName("手机");
		p.setProviderId(4);
		p.setQuantity(5);
		p.setSalePrice(200d);
		productService.add(p);
	}
	
	@Test
	public void deleteText(){
		ProductService productService = new ProductService();
		int id = 1;
		productService.delete(id);
	}
	
	@Test
	public void modifyText(){
		ProductService productService = new ProductService();
		Product p = new Product();
		p.setProductId(4);
		p.setCategoryId(3);
		p.setIncomePrice(123d);
		p.setProductName("电话");
		p.setProviderId(5);
		p.setQuantity(5);
		p.setSalePrice(888d);
		productService.modify(p);
	}
	
	@Test
	public void find(){
		ProductService productService = new ProductService();
		ArrayList<Product> productList = productService.find();
		for(int i = 0; i < productList.size(); i++){
			Product p = productList.get(i);
			System.out.println(p.getProductId() + "---" + p.getCategoryId() + "---" + p.getProductName());
		}
	}
	
	@Test
	public void findCandP(){
		ProductService productService = new ProductService();
		System.out.println("--------------------------------" );
		Map map = productService.findProviderAndCategory();
		
		ArrayList<Provider> providerList = (ArrayList<Provider>)map.get("providerList");
		ArrayList<Category> categoryList = (ArrayList<Category>)map.get("categoryList");
		System.out.println("providerList" + providerList);
		System.out.println("categoryList" + categoryList);
	}
	
	@Test
	public void findByIdTest(){
		ProductService productService = new ProductService();
		int id = 5;
		Product p = productService.findById(id);
		System.out.println(p.getProductId() + "---" + p.getCategoryId() + "---" + p.getProductName());
	}

}
