package com.cg.stock.dao;

import java.util.List;

import com.cg.stock.model.Item;

public interface IItemDao {
	public void addItem(Item item);
	public Item getItemByCode(int code);
	public List<Item> getItemList();
	public void modifyItem(Item item);
	public void deleteItem(int code);
}
