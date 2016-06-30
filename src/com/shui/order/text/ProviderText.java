package com.shui.order.text;

import java.util.ArrayList;

import org.junit.Test;

import com.shui.order.doMain.Category;
import com.shui.order.doMain.Provider;
import com.shui.order.service.CategoryService;
import com.shui.order.service.ProviderService;

public class ProviderText {
	@Test
	public void addTest() {
		ProviderService providerService = new ProviderService();
		Provider p = new Provider();
		p.setMail("53335@163.com");
		p.setProviderAdd("巴拉拉");
		p.setProviderName("Tom");
		p.setProviderTel(911);
		providerService.add(p);
		System.out.println("添加成功！");
	}

	// 删除操作的测试
	@Test
	public void deleteTest() {
		ProviderService providerService = new ProviderService();
		int productId;
		productId = 3;
		providerService.delete(productId);
		System.out.println("删除成功!");
	}

	// 修改操作的测试
	@Test
	public void modifyTest() {
		ProviderService providerService = new ProviderService();
		Provider p = new Provider();
		p.setProviderId(1);
		p.setMail("53335@163.com");
		p.setProviderAdd("大声道");
		p.setProviderName("da倩");
		p.setProviderTel(911);
		providerService.modify(p);
		System.out.println("修改成功！");
	}

	// 查询操作的测试
	@Test
	public void find() {
		ProviderService providerService = new ProviderService();
		ArrayList<Provider> providerList = null;
		providerList = providerService.find();
		for (int i = 0; i < providerList.size(); i++) {
			Provider provider = new Provider();
			provider = providerList.get(i);
			System.out.println(provider.getProviderName() + "---"
					+ provider.getProviderAdd() + "---"
					+ provider.getProviderTel());
		}
		System.out.println("查询成功!");
	}

	// 按照编号进行查询操作
	@Test
	public void findById() {
		ProviderService providerService = new ProviderService();
		Provider provider = providerService.findById(4);
		System.out.println(provider.getProviderName() + "---"
				+ provider.getProviderAdd() + "---"
				+ provider.getProviderTel());
	}
}
