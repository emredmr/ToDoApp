package com.example.ToDoApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDoApp.Model.ToDoList;
import com.example.ToDoApp.Repository.ToDoListRepository;

@Service
public class ToDoListService {

	@Autowired
	private ToDoListRepository toDoListRepository;
	
	public List<ToDoList> getAllToDoList(){
		List<ToDoList> toDoList = new ArrayList<>();
		toDoListRepository.findAll()
		.forEach(toDoList::add);
		return toDoList;
	}
	
	public Optional<ToDoList> getToDoList(String id) {
		return toDoListRepository.findById(id);
	}

	public void addToDoList(ToDoList toDoList) {
		toDoListRepository.save(toDoList);
	}

	public void updateToDoList(String id, ToDoList toDoList) {
		toDoListRepository.save(toDoList);
	}

	public void deleteToDoList(String id) {
		toDoListRepository.deleteById(id);
	}
}
