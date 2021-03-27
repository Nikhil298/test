package com.cg.stock.service;

import java.util.List;

import com.cg.stock.model.Item;

public interface IItemService {
	public void addItem(Item item);
	public Item getItemByCode(int code);
	public List<Item> getItemList();
	public void modifyItem(Item item);
	public void deleteItem(int code);
}
