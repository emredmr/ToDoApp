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

import com.example.ToDoApp.Model.ToDoList;
import com.example.ToDoApp.Service.ToDoListService;

@CrossOrigin
@RestController
public class ToDoListController {
	@Autowired
	private ToDoListService toDoListService;
	
	@RequestMapping(method = RequestMethod.GET, value="/list")
	public List<ToDoList> getAllToDoList() {
		return toDoListService.getAllToDoList();
	}
	
	@RequestMapping("/list/{id}")
	public Optional<ToDoList> getToDoList(@PathVariable String id) {
		return toDoListService.getToDoList(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/list")
	public void addToDoList(@RequestBody ToDoList toDoList) {
		toDoListService.addToDoList(toDoList);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/list/{id}")
	public void updateToDoList(@RequestBody ToDoList toDoList, @PathVariable String id) {
		toDoListService.updateToDoList(id,toDoList);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/list/{id}")
	public void deleteToDoList(@PathVariable String id) {
		toDoListService.deleteToDoList(id);
	}
}
