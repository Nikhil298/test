package com.cg.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.stock.dao.IItemDao;
import com.cg.stock.model.Item;

@Service("itemService")
public class ItemServiceImpl implements IItemService{

	@Autowired
	IItemDao itemDao;
	@Override
	public void addItem(Item item) {
		itemDao.addItem(item);
	}

	@Override
	public Item getItemByCode(int code) {
		return itemDao.getItemByCode(code);
	}

	@Override
	public List<Item> getItemList() {
		return itemDao.getItemList();
	}

	@Override
	public void modifyItem(Item item) {
		itemDao.modifyItem(item);
	}
	@Override
	public void deleteItem(int code) {
		itemDao.deleteItem(code);
	}
}
