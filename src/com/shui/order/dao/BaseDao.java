package com.shui.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	public void update(Connection conn, String sql, Object[] param)
			throws Exception {
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		// 循环设置?的值
		if (param != null) {
			for (int i = 0; i < param.length; i++) {
				ps.setObject(i + 1, param[i]);
			}
		}

		ps.executeUpdate();
	}
	
	public ResultSet query(Connection conn, String sql, Object[] param)
			throws Exception {
		ResultSet rs = null;
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		// 循环设置?的值
		if (param != null) {
			for (int i = 0; i < param.length; i++) {
				ps.setObject(i + 1, param[i]);
			}
		}
		
		rs = ps.executeQuery();
		return rs;
	}
}
