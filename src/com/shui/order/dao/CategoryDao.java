package com.shui.order.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.shui.order.doMain.Category;

public class CategoryDao extends BaseDao{
	//增加
	public void add(Connection conn, Category category) throws Exception {
		String sql = "insert into category(categoryName, categoryDesc) values(?,?)";
		Object[] param = {category.getCategoryName(), category.getCategoryDesc()};
		update(conn,sql,param);
	}

	//删除
	public void delete(Connection conn, int categoryId) throws Exception {
		String sql = "delete from category where categoryId = ?";
		Object[] param = {categoryId};
		update(conn,sql,param);
	}

	//修改
	public void modify(Connection conn, Category category) throws Exception {
		String sql = "update category set categoryName = ?,categoryDesc = ? where categoryId = ?";
		Object[] param = {category.getCategoryName(), category.getCategoryDesc(),category.getCategoryId()};
		update(conn,sql,param);
	}
	
	//查询
	public ArrayList<Category> find(Connection conn) throws Exception{
		String sql = "select * from category";
		Object[] param = null;
		ResultSet rs = null;
		rs = query(conn,sql,param);
		ArrayList<Category> categoryList = new ArrayList<Category>();
		while(rs.next()){
			Category category = new Category();
			category.setCategoryId(rs.getInt("categoryId"));
			category.setCategoryName(rs.getString("categoryName"));
			category.setCategoryDesc(rs.getString("categoryDesc"));
			categoryList.add(category);
		}
		return categoryList;
	}
	
		//按学号查询
		public Category findById(Connection conn, int id) throws Exception{
			String sql = "select * from category where categoryId = ?";
			Object[] param = {id};
			ResultSet rs = null;
			rs = query(conn,sql,param);
			Category category = null;
			if(rs.next()){
				category = new Category();
				category.setCategoryId(rs.getInt("categoryId"));
				category.setCategoryName(rs.getString("categoryName"));
				category.setCategoryDesc(rs.getString("categoryDesc"));
			}
			return category;
		}
}
