package com.cg.stock.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.stock.model.Item;

@Repository("itemDao")
public class ItemDaoImpl implements IItemDao{

	List<Item> itemList=new ArrayList<Item>();
	public ItemDaoImpl() {
		itemList.add(new Item(101,"Monitor",10,8500.00));
		itemList.add(new Item(102,"Keyboard",20,2500.00));
		itemList.add(new Item(103,"Mouse",40,500.00));
	}
	
	@Override
	public void addItem(Item item) {
		itemList.add(item);
	}
	@Override
	public Item getItemByCode(int code) {
	
		for(Item item:itemList) {
			if(item.getItemcode()==code)
				return item;
		}
		
		return null;
	}
	@Override
	public List<Item> getItemList() {
		
		return itemList;
	}
	@Override
	public void modifyItem(Item item) {
		//itemList.get(1).setPrice(20000);
		Item it=getItemByCode(item.getItemcode());
		if(it!=null) {
			it.setPrice(20000);
		}
		
	}

	@Override
	public void deleteItem(int code) {
		
		Item item=getItemByCode(code);
		if(item!=null)
		{
			itemList.remove(item);
		}
	}

}
