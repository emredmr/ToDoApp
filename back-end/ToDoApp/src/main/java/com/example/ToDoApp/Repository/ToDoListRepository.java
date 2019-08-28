package com.example.ToDoApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ToDoApp.Model.ToDoList;

public interface ToDoListRepository extends CrudRepository<ToDoList, String>{

	
}
