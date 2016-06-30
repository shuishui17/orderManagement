package com.shui.order.text;

import java.sql.Connection;
import java.util.ArrayList;

import org.junit.Test;

import com.shui.order.dao.CategoryDao;
import com.shui.order.doMain.Category;
import com.shui.order.service.CategoryService;
import com.shui.order.utils.JdbcHelper;

public class JdbcText {

	// 添加操作的测试
	@Test
	public void addTest() {
		CategoryService categoryService = new CategoryService();
		Category category = new Category();
		category.setCategoryName("张士露");
		category.setCategoryDesc("大儿子");
		categoryService.add(category);
		System.out.println("添加成功!");
	}

	// 删除操作的测试
	@Test
	public void deleteTest() {
		CategoryService categoryService = new CategoryService();
		int categoryId;
		categoryId = 13;
		categoryService.delete(categoryId);
		System.out.println("删除成功!");
	}

	// 修改操作的测试
	@Test
	public void modifyTest() {
		CategoryService categoryService = new CategoryService();
		Category category = new Category();
		category.setCategoryId(3);
		category.setCategoryName("火狐2");
		category.setCategoryDesc("浏览器");
		categoryService.modify(category);
		System.out.println("修改成功!");
	}

	// 查询操作的测试
	@Test
	public void find() {
		CategoryService categoryService = new CategoryService();
		ArrayList<Category> categoryList = null;
		categoryList = categoryService.find();
		for(int i = 0; i < categoryList.size(); i++){
			Category ca = new Category();
			ca = categoryList.get(i);
			System.out.println(ca.getCategoryId() + "---" + ca.getCategoryName() + "---" + ca.getCategoryDesc());
		}
		System.out.println("查询成功!");
	}
	
	//按照编号进行查询操作
	@Test
	public void findById(){
		CategoryService categoryService = new CategoryService();
		Category category = categoryService.findById(4);
		System.out.println(category.getCategoryName() + "---" + category.getCategoryDesc());
	}
}
