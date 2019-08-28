package com.example.ToDoApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDoApp.Model.ToDoItem;
import com.example.ToDoApp.Repository.ToDoItemRepository;


@Service
public class ToDoItemService {

	@Autowired
	private ToDoItemRepository toDoItemRepository;
	
	public List<ToDoItem> getAllToDoItem(){
		List<ToDoItem> toDoItem = new ArrayList<>();
		toDoItemRepository.findAll()
		.forEach(toDoItem::add);
		return toDoItem;
	}
	
	public Optional<ToDoItem> getToDoItem(String id) {
		return toDoItemRepository.findById(id);
	}

	public void addToDoItem(ToDoItem toDoItem) {
		toDoItemRepository.save(toDoItem);
	}

	public void updateToDoItem(String id, ToDoItem toDoItem) {
		toDoItemRepository.save(toDoItem);
	}

	public void deleteToDoItem(String id) {
		toDoItemRepository.deleteById(id);
	}
}
