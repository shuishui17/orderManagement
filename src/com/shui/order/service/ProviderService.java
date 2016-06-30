package com.shui.order.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.shui.order.dao.ProviderDao;
import com.shui.order.doMain.Provider;
import com.shui.order.utils.JdbcHelper;

public class ProviderService {
	ProviderDao providerDao = null;
	// 添加的方法
	public void add(Provider provider) {
		// 进行连接
		Connection conn = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			providerDao = new ProviderDao();
			providerDao.add(conn, provider);
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
	public void delete(int providerId) {
		// 进行连接
		Connection conn = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			providerDao = new ProviderDao();
			providerDao.delete(conn, providerId);
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
	public void modify(Provider provider) {
		// 进行连接
		Connection conn = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			providerDao = new ProviderDao();
			providerDao.modify(conn, provider);
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
	public ArrayList<Provider> find() {
		// 进行连接
		Connection conn = null;
		ArrayList<Provider> providerList = null;

		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			providerDao = new ProviderDao();
			providerList = providerDao.find(conn);
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

		return providerList;
	}

	// 按照编号查询的方法
	public Provider findById(int id) {
		// 进行连接
		Connection conn = null;
		Provider provider = null;
		try {
			conn = JdbcHelper.getConnection();
			// 为了保持事务的原子性
			conn.setAutoCommit(false);
			providerDao = new ProviderDao();
			provider = providerDao.findById(conn, id);
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

		return provider;
	}
}
