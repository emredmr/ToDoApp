package com.example.ToDoApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoApp.Model.ToDoItem;
import com.example.ToDoApp.Service.ToDoItemService;

@CrossOrigin
@RestController
public class ToDoItemController {

	@Autowired
	private ToDoItemService toDoItemService;
	
	@RequestMapping(method = RequestMethod.GET, value="/items")
	public List<ToDoItem> getAllToDoItem() {
		return toDoItemService.getAllToDoItem();
	}
	
	@RequestMapping("/items/{id}")
	public Optional<ToDoItem> getToDoItem(@PathVariable String id) {
		return toDoItemService.getToDoItem(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/items")
	public void addToDoItem(@RequestBody ToDoItem toDoItem) {
		toDoItemService.addToDoItem(toDoItem);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/items/{id}")
	public void updateToDoItem(@RequestBody ToDoItem toDoItem, @PathVariable String id) {
		toDoItemService.updateToDoItem(id,toDoItem);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/items/{id}")
	public void deleteToDoItem(@PathVariable String id) {
		toDoItemService.deleteToDoItem(id);
	}
}
