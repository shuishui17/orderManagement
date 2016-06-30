package com.shui.order.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.shui.order.dao.CategoryDao;
import com.shui.order.doMain.Category;
import com.shui.order.utils.JdbcHelper;

public class CategoryService {

	// 添加的方法
	public void add(Category category) {
		// 进行连接
		Connection conn = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			CategoryDao categoryDao = new CategoryDao();
			categoryDao.add(conn, category);
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
	public void delete(int categoryId) {
		// 进行连接
		Connection conn = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			CategoryDao categoryDao = new CategoryDao();
			categoryDao.delete(conn, categoryId);
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
	}

	// 修改的方法
	public void modify(Category category) {
		// 进行连接
		Connection conn = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			CategoryDao categoryDao = new CategoryDao();
			categoryDao.modify(conn, category);
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
	}

	// 查询的方法
	public ArrayList<Category> find() {
		// 进行连接
		Connection conn = null;
		ArrayList<Category> categoryList = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			CategoryDao categoryDao = new CategoryDao();
			categoryList = categoryDao.find(conn);
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
		
		return categoryList;
	}
	
		// 按照编号查询的方法
		public Category findById(int id) {
			// 进行连接
			Connection conn = null;
			Category category = null;
			try {
				conn = JdbcHelper.getConnection();
				// 为了保持事务的原子性
				conn.setAutoCommit(false);
				CategoryDao categoryDao = new CategoryDao();
				category = categoryDao.findById(conn,id);
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
			
			return category;
		}
}
