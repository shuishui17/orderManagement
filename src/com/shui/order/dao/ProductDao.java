package com.shui.order.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.shui.order.doMain.Product;
import com.shui.order.doMain.Provider;

public class ProductDao extends BaseDao{

	public void add(Connection conn, Product product) throws Exception {
		String sql = "insert into product (productName,incomePrice,providerId,quantity,salePrice,categoryId) values (?,?,?,?,?,?)";
		Object[] param = {product.getProductName(),product.getIncomePrice(),product.getProviderId(),product.getQuantity(),product.getSalePrice(),product.getCategoryId()};
		update(conn, sql, param);
	}

	public void delete(Connection conn, int productId) throws Exception {
		String sql = "delete from product where productId = ?";
		Object[] param = {productId};
		update(conn,sql,param);
	}

	public void modify(Connection conn, Product product) throws Exception {
		String sql = "update product set productName = ?,incomePrice = ? , providerId = ?, quantity = ?,salePrice = ?,categoryId = ? where productId = ?";
		Object[] param = {product.getProductName(),product.getIncomePrice(),product.getProviderId(),product.getQuantity(),product.getSalePrice(),product.getCategoryId(),product.getProductId()};
		update(conn,sql,param);
	}

	public ArrayList<Product> find(Connection conn) throws Exception {
		String sql = "select * from product";
		Object[] param = null;
		ResultSet rs = null;
		rs = query(conn,sql,param);
		ArrayList<Product> productList = new ArrayList<Product>();
		while(rs.next()){
			Product product = new Product();
			product.setProductName(rs.getString("productName"));
			product.setIncomePrice(rs.getDouble("incomePrice"));
			product.setProviderId(rs.getInt("providerId"));
			product.setQuantity(rs.getInt("quantity"));
			product.setSalePrice(rs.getDouble("salePrice"));
			product.setCategoryId(rs.getInt("categoryId"));
			product.setProductId(rs.getInt("productId"));
			productList.add(product);
		}
		return productList;
	}

	public Product findById(Connection conn,int productId) throws Exception {
		String sql = "select * from product where productId = ?";
		Object[] param = {productId};
		ResultSet rs = query(conn,sql,param);
		Product product = null;
		while(rs.next()){
			product = new Product();
			product.setProductId(productId);
			product.setProductName(rs.getString("productName"));
			product.setIncomePrice(rs.getDouble("incomePrice"));
			product.setProviderId(rs.getInt("providerId"));
			product.setQuantity(rs.getInt("quantity"));
			product.setSalePrice(rs.getDouble("salePrice"));
			product.setCategoryId(rs.getInt("categoryId"));
		}
		
		return product;
	}

}
