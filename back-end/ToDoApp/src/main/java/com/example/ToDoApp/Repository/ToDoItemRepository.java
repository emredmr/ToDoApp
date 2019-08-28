package com.example.ToDoApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ToDoApp.Model.ToDoItem;

public interface ToDoItemRepository extends CrudRepository<ToDoItem, String>{

	
}
