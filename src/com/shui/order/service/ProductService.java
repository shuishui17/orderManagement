package com.shui.order.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.shui.order.dao.ProductDao;
import com.shui.order.dao.ProviderDao;
import com.shui.order.doMain.Category;
import com.shui.order.doMain.Product;
import com.shui.order.doMain.Provider;
import com.shui.order.utils.JdbcHelper;

public class ProductService {
	ProductDao productDao = null;
	Connection conn = null;

	public void add(Product product) {

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			productDao = new ProductDao();
			productDao.add(conn, product);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JdbcHelper.closeJdbc(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 删除的方法
	public void delete(int productId) {
		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			productDao = new ProductDao();
			productDao.delete(conn, productId);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JdbcHelper.closeJdbc(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 修改的方法
	public void modify(Product product) {
		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			productDao = new ProductDao();
			productDao.modify(conn, product);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JdbcHelper.closeJdbc(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 查询的方法
	public ArrayList<Product> find() {
		// 进行连接
		ArrayList<Product> productList = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			productDao = new ProductDao();
			productList = productDao.find(conn);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JdbcHelper.closeJdbc(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return productList;
	}
	
	//查询供货商和商品种类
	public Map findProviderAndCategory(){
		Map map = new HashMap();
		try {
			conn = JdbcHelper.getConnection();
			conn.setAutoCommit(false);
			ProviderService providerService = new ProviderService();
			CategoryService categoryService = new CategoryService();
			
			ArrayList<Provider> providerList = providerService.find();
			map.put("providerList", providerList);
			ArrayList<Category> categoryList = categoryService.find();
			map.put("categoryList", categoryList);
			
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				JdbcHelper.closeJdbc(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return map;
	}
	
	//根据ID查询商品
	public Product findById(int productId){
		Product product = null;
		
			try {
				conn = JdbcHelper.getConnection();
				conn.setAutoCommit(false);
				productDao = new ProductDao();
				product = productDao.findById(conn,productId);
				
				conn.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					JdbcHelper.closeJdbc(conn);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return product;
	}
}
