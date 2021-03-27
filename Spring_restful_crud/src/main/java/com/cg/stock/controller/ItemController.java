package com.cg.stock.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.stock.model.Item;
import com.cg.stock.service.IItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	IItemService itemService;
	
	@GetMapping
	public ResponseEntity<List<Item>> getAllItems()
	{
		List<Item> itemList=itemService.getItemList();
		return new ResponseEntity<List<Item>>(itemList, HttpStatus.OK);
	}
	/*@PostMapping
	public ResponseEntity<String> addItem(@RequestBody Item item){
		itemService.addItem(item);
		return new ResponseEntity<>("item added..",HttpStatus.OK);
}*/
	@DeleteMapping
	public ResponseEntity<String> deleteItem(@RequestBody Integer code){
		itemService.deleteItem(code);
		return new ResponseEntity<>("item deleted..",HttpStatus.OK);
}
	/*@GetMapping
	public ResponseEntity<Item> getItemCode(@RequestBody Integer code)
	{
		Item itemList=itemService.getItemByCode(code);
		return new ResponseEntity<Item>(itemList, HttpStatus.OK);
	}*/
	@PutMapping
	public ResponseEntity<String> modifyItem(@RequestBody Item item){
		itemService.modifyItem(item);
		return new ResponseEntity<>("updated..",HttpStatus.OK);
	}
	}
