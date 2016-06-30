package com.shui.order.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shui.order.doMain.Category;
import com.shui.order.doMain.Provider;

public class ProviderDao extends BaseDao{

	public void add(Connection conn, Provider provider) throws Exception {
		String sql = "insert into provider (providerName,providerAdd,providerTel,email) values(?,?,?,?)";
		Object[] param = {provider.getProviderName(),provider.getProviderAdd(),provider.getProviderTel(),provider.getMail()};
		update(conn,sql,param);
	}

	public void delete(Connection conn, int providerId) throws Exception {
		String sql = "delete from provider where providerId = ?";
		Object[] param = {providerId};
		update(conn,sql,param);
	}

	public void modify(Connection conn, Provider provider) throws Exception {
		String sql = "update provider set providerName = ?,providerAdd = ? , providerTel = ?, email = ? where providerId = ?";
		Object[] param = {provider.getProviderName(),provider.getProviderAdd(),provider.getProviderTel(),provider.getMail(),provider.getProviderId()};
		update(conn,sql,param);
	}

	public ArrayList<Provider> find(Connection conn) throws Exception {
		String sql = "select * from provider";
		Object[] param = null;
		ResultSet rs = null;
		rs = query(conn,sql,param);
		ArrayList<Provider> providerList = new ArrayList<Provider>();
		while(rs.next()){
			Provider p = new Provider();
			p.setMail(rs.getString("email"));
			p.setProviderAdd(rs.getString("providerAdd"));
			p.setProviderId(rs.getInt("providerId"));
			p.setProviderName(rs.getString("providerName"));
			p.setProviderTel(rs.getInt("providerTel"));
			providerList.add(p);
		}
		return providerList;
	}

	public Provider findById(Connection conn, int id) throws Exception {
		String sql = "select * from provider where providerId = ?";
		Object[] param = {id};
		ResultSet rs = null;
		rs = query(conn,sql,param);
		Provider p = null;
		if(rs.next()){
			p = new Provider();
			p.setMail(rs.getString("email"));
			p.setProviderAdd(rs.getString("providerAdd"));
			p.setProviderId(rs.getInt("providerId"));
			p.setProviderName(rs.getString("providerName"));
			p.setProviderTel(rs.getInt("providerTel"));
		}
		return p;
	}
	
}
