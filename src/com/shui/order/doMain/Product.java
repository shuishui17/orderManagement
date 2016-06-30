package com.shui.order.doMain;

public class Product {
	private int productId;
	private String productName;
	private double incomePrice;
	private int providerId;
	private int quantity;
	private double salePrice;
	private int categoryId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getIncomePrice() {
		return incomePrice;
	}
	public void setIncomePrice(double incomePrice) {
		this.incomePrice = incomePrice;
	}
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
		
	public Product( String productName, double incomePrice,
			int providerId, int quantity, double salePrice, int categoryId) {
		super();
		this.productName = productName;
		this.incomePrice = incomePrice;
		this.providerId = providerId;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.categoryId = categoryId;
	}
	
	public Product(int productId, String productName, double incomePrice,
			int providerId, int quantity, double salePrice, int categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.incomePrice = incomePrice;
		this.providerId = providerId;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.categoryId = categoryId;
	}
	public Product(){
		super();
	}
}
