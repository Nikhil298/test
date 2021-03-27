package com.cg.stock.model;

public class Item {
	private int itemcode;
	private String itemname;
	private int quantity;
	private double price;
	public Item() {
	}
	
	
	
	public Item(int itemcode, String itemname, int quantity, double price) {
		super();
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.quantity = quantity;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Item [itemcode=" + itemcode + ", itemname=" + itemname + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}



	public int getItemcode() {
		return itemcode;
	}
	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
